package com.bmc.jdbcautomation.qa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class JDBCquery {

	public static void main(String[] args) {
		// for AR JDBC
		String user = "Dave";
//		String url = "jdbc:arserver://vl-pun-atm-dv16:0;mode=new";
		String url = "jdbc:arserver://vl-pun-atm-dv16:0;mode=new";
		String password = "bmcAdm1n";
		String sql1 =null;
			




				
				

		try {
			Class.forName("com.bmc.arsys.jdbc.core.Driver");

			Connection conn = DriverManager.getConnection(url, user, password);
			Statement st = conn.createStatement();
			ResultSet rs1 = st.executeQuery(sql1);

			ResultSetMetaData metadata = rs1.getMetaData();
			int ColumnCount = metadata.getColumnCount();
			ArrayList<String> arraylist = new ArrayList<String>();
			HashMap<Integer, ArrayList<String>> hashmap = new HashMap<Integer, ArrayList<String>>();
			while (rs1.next()) {
				for (int i = 1; i <= ColumnCount; i++) {
					System.out.println(rs1.getString(i));
					// arraylist.add(rs1.getString(i));
					// hashmap.put(i, arraylist);

				}

			}
			for (int j = 0; j < arraylist.size(); j++) {
				String Result = arraylist.get(j);
				System.out.println(Result);
			}
			// System.out.println(hashmap.get(1));

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
