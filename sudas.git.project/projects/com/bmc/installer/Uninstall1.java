package com.bmc.installer.automation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Uninstall1 {

	public static void main(String[] args) {

		String url = "jdbc:sqlserver://10.133.8.59;databasename=ARSystem";
		String user = "sa";
		String password = "bmcAdm1n";
		String sql = "ALTER DATABASE smartrepo SET OFFLINE WITH ROLLBACK IMMEDIATE " + "DROP DATABASE [smartrepo]";

		Uninstall1 uninstaller = new Uninstall1();
		// Step 1: Drop the database
		uninstaller.jdbc(url, user, password, sql);
		// Step 2: Delete the file system and database ldf and mdf files
		uninstaller.clean();
		//Step 3: Delete the Smart Reporting service

	}

	public void jdbc(String url, String user, String password, String sql) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement st = conn.createStatement();
			ResultSet rs = null;

			st.executeQuery(sql);
			/*
			 * if (rs!= st.executeQuery(sql)) { System.out.println("DB Dropped"
			 * ); }
			 * 
			 * // get the metadata and create a metadata object
			 * ResultSetMetaData metadata = rs.getMetaData();
			 * 
			 * int columnCount = metadata.getColumnCount();
			 * 
			 * // as long as result set (rs) has next element the while loop
			 * witll // continue while (rs.next()) { // iterate through number
			 * of columns int i; for (i = 1; i < columnCount; i++) { // get
			 * string is the value of the perticular string String columnValue =
			 * rs.getString(i); String columnName = metadata.getColumnName(i);
			 * 
			 * System.out.println(columnValue); System.out.println(columnName);
			 * } }
			 */
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			String message = e.toString();
			System.out.println(message + '\n' + '\n' + " Smart Reporting Repositort Dropped Successfully");
		}
	}

	

	
	public void clean() {
		try {
			Runtime.getRuntime().exec("cmd /c start c:/Uninstall.bat");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
