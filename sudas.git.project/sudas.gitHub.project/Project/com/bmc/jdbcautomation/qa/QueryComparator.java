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

public class QueryComparator {
	
	
	public static void main(String[] args) {

		/*
		 * ########################################################## 
		 * COMPARE JDBC SQL QUERIES WITH NATIVE SQL QUERIES **** <SUDAS>
		 * ##########################################################
		 * 
		 * >BUG : There is a bug where the entire row of the excel sheets needs
		 * to be deleted >by right click on the row and delete
		 */

		// Setup the jdbc connection parameters
		String juser = "Dave";
		String jurl ="jdbc:arserver://vl-pun-atm-dv16:0;mode=new"; 											//"jdbc:arserver://vs-pun-cus-dv02:0;mode=new";
		String jpassword = "bmcAdm1n";
		Connection jconn;
		String jsql = null;

		// Set up the native SQL Server/ Oracle connection parameters
		String nuser = "ARAdmin";
		String nurl = "jdbc:oracle:thin:@//10.129.103.235:1521/ORA121DB";											
		//"jdbc:oracle:thin:@//10.129.103.235:1521/ORA121DB";				//String nurl = "jdbc:sqlserver://vw-pun-atm-qa26:1433;databasename=ARSystem";
		String npassword = "AR#Admin#";
		Connection nconn;
		String nsql = null;

		// Read the excel workbook for JDBC queries
		try {
			Workbook jworkbook = Workbook
					.getWorkbook(new File("src/Query.xls"));
			Sheet jsheet = jworkbook.getSheet(0);
			int jrowCount = jsheet.getRows(); // no of rows in excel
			System.out.println("ROW COUNT "+ jrowCount);
			HashMap<String, String> jhashmap = new HashMap<String, String>();
			for (int i = 0; i < jrowCount; i++) {
				Cell jrowObj1 = jsheet.getCell(0, i); // Cell interface , Sheet
														// Interface
				Cell jrowObj2 = jsheet.getCell(1, i);
				// System.out.println("Row Object_01 : "+jrowObj1.getContents());
				// System.out.println("Row Object_02 : "+jrowObj2.getContents());
				jsql = jrowObj2.getContents();
				jhashmap.put(jrowObj1.getContents(), jrowObj2.getContents());
			}

			// Read the excel workbook for native SQL queries
			Workbook nworkbook = Workbook
					.getWorkbook(new File("src/Query.xls"));
			Sheet nsheet = nworkbook.getSheet(1);
			int nrowCount = nsheet.getRows(); // no of rows in excel
			System.out.println("Executing Total: " + jrowCount
					+ " Test Cases ......");
			System.out
					.println("--------------------------------------------------------------------------");
			Map<String, String> nhashmap = new HashMap<String, String>();
			for (int i = 0; i < nrowCount; i++) {
				Cell nrowObj1 = nsheet.getCell(0, i); // Cell interface , Sheet
														// Interface
				Cell nrowObj2 = nsheet.getCell(1, i);
				// System.out.println("Row Object_01 : "+nrowObj1.getContents());
				// System.out.println("Row Object_02 : "+nrowObj2.getContents());
				nsql = nrowObj2.getContents();
				nhashmap.put(nrowObj1.getContents(), nrowObj2.getContents());

			}

			// load the AR JDBC driver
			Class.forName("com.bmc.arsys.jdbc.core.Driver");
			// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			jconn = DriverManager.getConnection(jurl, juser, jpassword);
			Statement jst = jconn.createStatement();

			// load the MS SQL Server/ Oracle JDBC driver
			Class.forName("com.bmc.arsys.jdbc.core.Driver");
			// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			nconn = DriverManager.getConnection(nurl, nuser, npassword);
			Statement nst = nconn.createStatement();

			/*
			 * create two two array list, one for storing the result set of JDBC
			 * SQL query and other for storing result set of native SQL query.
			 */
			List<ResultSet> jarraylist = new ArrayList<ResultSet>();
			List<ResultSet> narraylist = new ArrayList<ResultSet>();

			int i;
			String y;

			String jsql1 = null;
			ResultSet jrs1 = null;

			String nsql1 = null;
			ResultSet nrs1 = null;

			for (i = 1; i <= jrowCount; i++) {
				y = Integer.toString(i);

				// get the SQL queries which are read from the excel sheet
				jsql1 = jhashmap.get(y);
				nsql1 = nhashmap.get(y);

				// add the executed SQL result set to a array list
				jarraylist.add(jrs1);
				narraylist.add(nrs1);

				// create rs objects
				jrs1 = jst.executeQuery(jsql1);		// get a null pointer if excel sheet not deleted correctly
				nrs1 = nst.executeQuery(nsql1);

				// create meta data objects of both rs
				ResultSetMetaData jmetadata = jrs1.getMetaData();
				ResultSetMetaData nmetadata = nrs1.getMetaData();

				// get the column count of bot rs
				int jColCount = jmetadata.getColumnCount();
				int nColCount = nmetadata.getColumnCount();

				// add the SQL output to hashmap
				ArrayList<String> jsqlarray2 = new ArrayList<String>();
				ArrayList<String> nsqlarray2 = new ArrayList<String>();

				HashMap<Integer, ArrayList<String>> jhashMap2 = new HashMap<Integer, ArrayList<String>>();
				HashMap<Integer, ArrayList<String>> nhashMap2 = new HashMap<Integer, ArrayList<String>>();

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

//				System.out.println("Executing test case No");
				ArrayList<String> jfinalResult = jhashMap2.get(i);
				
				// debug code
//				if (jfinalResult==null)
//				{System.out.println("JDBC query has no data");
//				
//				}

				 

//				System.out.println(jfinalResult);

				while (nrs1.next()) {
					int k;
					for (k = 1; k <= nColCount; k++) {
						nsqlarray2.add(nrs1.getString(k));
						nhashMap2.put(i, nsqlarray2);

					}
				}

				// replace "null" to ... into jsqlarray elements
				for (int ln = 0; ln < nsqlarray2.size(); ln++) {
					String LN = nsqlarray2.get(ln);
					if (LN == null) {
						nsqlarray2.set(ln, "NULL");
					}
				}

				ArrayList<String> nfinalResult = nhashMap2.get(i);
				
				// debug code
//				if (nfinalResult==null)
//				{System.out.println("Native query has no data");
//				
//				}
				
				
				 if 
				(jfinalResult!=null || nfinalResult!=null )
				{
//					 System.out.println("JDBC "+jfinalResult);
//					 System.out.println("NATIVE "+nfinalResult);
					 
					 if (jfinalResult.equals(nfinalResult))
					 {
						 System.out.println("Test Case # "+i+" PASS");

					 }
					 else if(!jfinalResult.equals(nfinalResult))
					 {
						 System.out.println("Test Case # "+i+" FAIL");
					 }
				
				}
				 else
				 {
					 System.out.println("Test Case # "+i +" has no data");
				 }
				 


			System.out.println(" ");
			

			

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
