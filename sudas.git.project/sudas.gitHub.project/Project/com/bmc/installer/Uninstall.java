package com.bmc.installer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Uninstall {

	public static void main(String[] args) {

		String url = "jdbc:sqlserver://10.133.8.59;databasename=System Database";
		String user = "sa";
		String password = "bmcAdm1n";
		String sql = "select * from [smartrepo].[dbo].[Event]";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);

			// get the metadata and create a metadata object
			ResultSetMetaData metadata = rs.getMetaData();

			int columnCount = metadata.getColumnCount();

			// as long as result set (rs) has next element the while loop witll
			// continue
			while (rs.next()) {
				// iterate through number of columns
				int i;
				for (i = 1; i < columnCount; i++) {
					// get string is the value of the perticular string
					String columnValue = rs.getString(i);
					String columnName = metadata.getColumnName(i);
					
					System.out.println(columnValue);
					System.out.println(columnName);
				}
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
