package com.bmc.jdbcautomation.qa;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReportSQLrefresh {

	public static void main(String[] args) {

		/*
		 * ########################################################## COMPARE
		 * JDBC SQL QUERIES WITH NATIVE SQL QUERIES **** <SUDAS>
		 * ##########################################################
		 * 
		 * >BUG : There is a bug where the entire row of the excel sheets needs
		 * to be deleted >by right click on the row and delete
		 */

		// Setup the jdbc connection parameters
		String juser = "Dave";
		String jurl = "jdbc:arserver://vl-pun-atm-dv16:0;mode=new"; // "jdbc:arserver://vs-pun-cus-dv02:0;mode=new";
		String jpassword = "bmcAdm1n";
		Connection jconn;

		// Read the excel workbook for JDBC queries
		try {
			Workbook jworkbook = Workbook
					.getWorkbook(new File("src/Query_2.xls"));
			Sheet jsheet = jworkbook.getSheet(0);
			int jrowCount = jsheet.getRows(); // no of rows in excel
			System.out.println("Total Number Of SQL to Execute " + jrowCount);
			System.out.println("*********************************************");
			HashMap<String, String> jhashmap = new HashMap<String, String>();
			for (int i = 0; i < jrowCount; i++) {
				Cell jrowObj1 = jsheet.getCell(0, i); // Cell interface , Sheet
														// Interface
				Cell jrowObj2 = jsheet.getCell(1, i);
				// System.out.println("Row Object_01 : "+jrowObj1.getContents());
				// System.out.println("Row Object_02 : "+jrowObj2.getContents());
				String jsql = jrowObj2.getContents();
				jhashmap.put(jrowObj1.getContents(), jrowObj2.getContents());
			}

			// load the AR JDBC driver
			Class.forName("com.bmc.arsys.jdbc.core.Driver");
			// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			jconn = DriverManager.getConnection(jurl, juser, jpassword);
			Statement jst = jconn.createStatement();

			/*
			 * create two two array list, one for storing the result set of JDBC
			 * SQL query and other for storing result set of native SQL query.
			 */
			List<ResultSet> jarraylist = new ArrayList<ResultSet>();

			int i;
			String y;

			String jsql1 = null;
			ResultSet jrs1 = null;

			for (i = 1; i <= jrowCount; i++) {
				y = Integer.toString(i);

				// get the SQL queries which are read from the excel sheet
				jsql1 = jhashmap.get(y);

				// add the executed SQL result set to a array list
				jarraylist.add(jrs1);

				// create rs objects
				jrs1 = jst.executeQuery(jsql1); // get a null pointer if excel
												// sheet not deleted correctly

				// create meta data objects of both rs
				ResultSetMetaData jmetadata = jrs1.getMetaData();

				// get the column count of bot rs
				int jColCount = jmetadata.getColumnCount();

				// add the SQL output to hashmap
				ArrayList<String> jsqlarray2 = new ArrayList<String>();

				HashMap<Integer, ArrayList<String>> jhashMap2 = new HashMap<Integer, ArrayList<String>>();

				while (jrs1.next()) {
					int k;
					for (k = 1; k <= jColCount; k++) {
						jsqlarray2.add(jrs1.getString(k));
						jhashMap2.put(i, jsqlarray2);
					}
				}

				// replace "null" to ... into jsqlarray elements
				for (int lj = 0; lj < jsqlarray2.size(); lj++) {
					String LJ = jsqlarray2.get(lj);
					if (LJ == "null") {
						jsqlarray2.set(lj, "NULL");
					}
				}

				// System.out.println("Executing test case No");
				ArrayList<String> jfinalResult = jhashMap2.get(i);

				if (jfinalResult==null)
				{
					System.out.println("No Data To Display For Query # "+i);
				}
				
				else
				{
					System.out.println("Refreshed Report SQL # "+i);
				}
				
				System.out.println("--------------------------------------------------");
				
				


			}

		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
