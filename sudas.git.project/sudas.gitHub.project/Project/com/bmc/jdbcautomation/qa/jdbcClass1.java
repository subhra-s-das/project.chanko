package com.bmc.jdbcautomation.qa;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbcClass1 {
	public static void main(String[] args)  {
		
		String user="peter";
		String url="jdbc:arserver://vw-pun-atm-dv18:0;mode=new";
		String password="bmcAdm1n";
		Connection conn;
		String sql =null;
		try {
		
			
			// Read the workbook
			Workbook workbook = Workbook.getWorkbook(new File("src/Query.xls"));
			Sheet sheet = workbook.getSheet(0);
			int rowCount=sheet.getRows();	// no of rows in excel
			System.out.println("RowCount"+rowCount);
			Map<String, String> hashmap = new HashMap<String, String>();
			for (int i=0;i<rowCount;i++)
			{	Cell rowObj1 =sheet.getCell(0, i);		// Cell interface , Sheet Interface
				Cell rowObj2 = sheet.getCell(1, i);
//				System.out.println("Row Object_01 : "+rowObj1.getContents());
//				System.out.println("Row Object_02 : "+rowObj2.getContents());
				sql =rowObj2.getContents();
				hashmap.put(rowObj1.getContents(), rowObj2.getContents());

			}
			
			
			Class.forName("com.bmc.arsys.jdbc.core.Driver");
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, user, password);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
//			ResultSetMetaData metadata = rs.getMetaData();
//			System.out.println("column"+metadata.getColumnCount());
			
			
			//get the SQL from corresponding key from all excel rows
			
			
			
			// get all the sql from the spreadsheet for every row and execute them
			List<ResultSet> arraylist = new ArrayList<ResultSet>();
			int i;
			String y;
			String sql1 = null;
			ResultSet rs1 = null;
	for (i=1;i<=rowCount;i++)
	{
		
//		System.out.println(rowCount);
		y = Integer.toString(i);
		sql1 =hashmap.get(y);
//		System.out.println("SQL from arraylist : "+sql1);
		rs  = st.executeQuery(sql1);
		arraylist.add(rs);
	
//		System.out.println(rs);

	
	int j;
	
	//for (j=0;j<arraylist.size();j++)
//	{
		rs1 = st.executeQuery(sql1);
//	System.out.println(rs1);
//	System.out.println(arraylist.get(j));
	ResultSetMetaData metadata1 = rs1.getMetaData();
	int ColCount = metadata1.getColumnCount();
//	System.out.println(ColCount);

	//}
	

	ArrayList<String> sqlarray = new ArrayList<String>();
	HashMap<Integer, ArrayList<String>> hashMap1 = new HashMap<Integer, ArrayList<String>>();
	while (rs1.next())
	{
		int k;
		for (k=1;k<=metadata1.getColumnCount();k++)
		{

			sqlarray.add(rs1.getString(k));
	hashMap1.put(i, sqlarray);
			
		}
		}

	for (int m=0;m<sqlarray.size();m++)
	{
//		System.out.println(sqlarray.get(m));
		String LS = sqlarray.get(m);
		if (LS == "null")
		{
			sqlarray.set(m, "TEST/TEST/TEST");
		}
		
	}
	
	System.out.println(i);

ArrayList<String> finalResult = hashMap1.get(i);
if (finalResult == null)
{
	System.out.println("NO DATA IN AR FOR THIS REPORT");
}
else
{
System.out.println(finalResult);
}


	}

	
		} catch (SQLException | BiffException | IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		
			
		}
		
		
		
	}

}
