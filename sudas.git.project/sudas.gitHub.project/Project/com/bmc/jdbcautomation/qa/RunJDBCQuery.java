package com.bmc.jdbcautomation.qa;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.ls.LSInput;
 
public class RunJDBCQuery {

	public static void main(String[] args) {

		String user="Demo";
		String url="jdbc:arserver://vl-pun-atm-qa12:0;mode=new";
		String password="bmcAdm1n";
//		String sql="select Incident_Number,Submit_Date from HPD_Help_Desk";
		String sql1="SELECT  * FROM `AR System Schema`.`HPD:Help Desk`";


		try {
			Class.forName("com.bmc.arsys.jdbc.core.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement st = conn.createStatement();
			ResultSet rs1 = st.executeQuery(sql1);

			ResultSetMetaData metadata = rs1.getMetaData();
//			ResultSetMetaData metadata1 = rs2.getMetaData();
			
			ArrayList<String> arrayList = new ArrayList<String>();
			while(rs1.next())
			{

//				System.out.println(rs.getString(1));
				int i=1;
				while (i<metadata.getColumnCount())
				{
					arrayList.add(rs1.getString(i++));
				System.out.println(rs1.getString(1));
							
				}
				}

//			System.out.println(arrayList.get(55));
//			System.out.println(arrayList.size());
//			System.out.println(arrayList.get(55));
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


