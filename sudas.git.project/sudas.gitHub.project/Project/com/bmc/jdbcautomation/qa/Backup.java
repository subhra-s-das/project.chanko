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

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Backup {
	
	// JDBC QUERY CLASS
	

	
	String user;
	String url;
	String password;
	String jsql = null;
	
	
	// method_01 Set method
		public void setJDBCConn(String jx, String jy, String jz)
	{
		user =jx;
		url=jy;
		password=jz;		
	}
	
	// method_02 Get method. Method to get the Arraylist
		HashMap<Integer, ArrayList<String>>  jgetarray ()
	{
		Connection conn;
			HashMap<Integer, ArrayList<String>> hashMap1 = new HashMap<Integer, ArrayList<String>>();
		
		try
		{
		// Read the workbook
		Workbook workbook = Workbook.getWorkbook(new File("src/Query.xls"));
		Sheet sheet = workbook.getSheet(0); // set the workSheet number
		int rowCount=sheet.getRows();	// no of rows in excel
//		System.out.println("RowCount"+rowCount);
		HashMap<String, String> hashmap = new HashMap<String, String>();
		for (int i=0;i<rowCount;i++)
		{	Cell JrowObj1 =sheet.getCell(0, i);		// Cell interface , Sheet Interface
			Cell JrowObj2 = sheet.getCell(1, i);
//			System.out.println("Row Object_01 : "+JrowObj1.getContents());
//			System.out.println("Row Object_02 : "+JrowObj2.getContents());
			jsql =JrowObj2.getContents();
			hashmap.put(JrowObj1.getContents(), JrowObj2.getContents());

		}
		
		
		Class.forName("com.bmc.arsys.jdbc.core.Driver");
//		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn = DriverManager.getConnection(url, user, password);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(jsql);
//		ResultSetMetaData metadata = rs.getMetaData();
//		System.out.println("column"+metadata.getColumnCount());
		
		
		//get the SQL from corresponding key from all excel rows
		
		
		
		// get all the sql from the spreadsheet for every row and execute them
		List<ResultSet> arraylist = new ArrayList<ResultSet>();
		int i;
		String y;
		String sql1 = null;
		ResultSet rs1 = null;
for (i=1;i<=rowCount;i++)
{
	
//	System.out.println(rowCount);
	y = Integer.toString(i);
	sql1 =hashmap.get(y);
//	System.out.println("SQL from arraylist : "+sql1);
	rs  = st.executeQuery(sql1);
	arraylist.add(rs);

//	System.out.println(rs);


int j;

//for (j=0;j<arraylist.size();j++)
//{
	rs1 = st.executeQuery(sql1);
//System.out.println(rs1);
//System.out.println(arraylist.get(j));
ResultSetMetaData metadata1 = rs1.getMetaData();
int ColCount = metadata1.getColumnCount();
//System.out.println(ColCount);

ArrayList<String> sqlarray = new ArrayList<String>();

while (rs1.next())
{
	int k;
	for (k=1;k<=metadata1.getColumnCount();k++)
	{
		sqlarray.add(rs1.getString(k));
		hashMap1.put(i, sqlarray);
	}
	}
//System.out.println("> Result For JDBC Query: "+i);
//System.out.println(sqlarray);

ArrayList<String> finalResult = hashMap1.get(i);
System.out.println(finalResult);
}

} 

		catch (SQLException | BiffException | IOException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return hashMap1;
		
}
		

		// NATIVE SQL QUERY CLASS
		
		String user1;
		String url1;
		String password1;
		String nsql = null;
		
		// method_01 Set method
				public void setNativeConn(String nx, String ny, String nz)
			{
				user1 =nx;
				url1=ny;
				password1=nz;		
			}
		
		
				// method_02 Get method. Method to get the Arraylist
				HashMap<Integer, ArrayList<String>> ngetarray ()
			{
				Connection NativeConn;
				
				HashMap<Integer, ArrayList<String>> nativeHashMap = new HashMap<Integer, ArrayList<String>>();

				try
				{
				// Read the workbook
				Workbook NativeWorkbook = Workbook.getWorkbook(new File("src/Query.xls"));
				Sheet sheet = NativeWorkbook.getSheet(1); // set the workSheet number
				int NativeRowCount=sheet.getRows();	// no of rows in excel
//				System.out.println("RowCount"+rowCount);
				HashMap<String, String> NativeHashmap = new HashMap<String, String>();
				for (int i=0;i<NativeRowCount;i++)
				{	Cell NrowObj1 =sheet.getCell(0, i);		// Cell interface , Sheet Interface
					Cell NrowObj2 = sheet.getCell(1, i);
//					System.out.println("Row Object_01 : "+NrowObj1.getContents());
//					System.out.println("Row Object_02 : "+NrowObj2.getContents());
					nsql =NrowObj2.getContents();
					NativeHashmap.put(NrowObj1.getContents(), NrowObj2.getContents());

				}
				
				
//				Class.forName("com.bmc.arsys.jdbc.core.Driver");
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				NativeConn = DriverManager.getConnection(url1, user1, password1);
				Statement Nst = NativeConn.createStatement();
				ResultSet Nrs = Nst.executeQuery(nsql);
//				ResultSetMetaData metadata = rs.getMetaData();
//				System.out.println("column"+metadata.getColumnCount());
				
				
				//get the SQL from corresponding key from all excel rows
				
				
				
				// get all the sql from the spreadsheet for every row and execute them
				List<ResultSet> narraylist = new ArrayList<ResultSet>();
				int ni;
				String ny;
				String nsql1 = null;
				ResultSet nrs1 = null;
		for (ni=1;ni<=NativeRowCount;ni++)
		{
			
//			System.out.println(rowCount);
			ny = Integer.toString(ni);
			nsql1 =NativeHashmap.get(ny);
//			System.out.println("SQL from arraylist : "+sql1);
			Nrs  = Nst.executeQuery(nsql1);
			narraylist.add(Nrs);

//			System.out.println(rs);


		int nj;

		//for (j=0;j<arraylist.size();j++)
		//{
			nrs1 = Nst.executeQuery(nsql1);
		//System.out.println(rs1);
		//System.out.println(arraylist.get(j));
		ResultSetMetaData metadata1 = nrs1.getMetaData();
		int ColCount = metadata1.getColumnCount();
		//System.out.println(ColCount);

		ArrayList<String> sqlarray = new ArrayList<String>();	

		while (nrs1.next())
		{
			int nk;
			for (nk=1;nk<=metadata1.getColumnCount();nk++)
			{
				sqlarray.add(nrs1.getString(nk));
				nativeHashMap.put(ni, sqlarray);
			}
			}
		//System.out.println("> Result For Native Query: "+i);
		//System.out.println(sqlarray);

		ArrayList<String> finalResult = nativeHashMap.get(ni);
		System.out.println(finalResult);

		}
		} 

				catch (SQLException | BiffException | IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return nativeHashMap;
				
		
			
			}
}
			

		
		
		

		


