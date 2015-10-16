package com.bmc.artestdata.qa;

import com.bmc.arsys.api.ARServerUser;

public class ARConn {
	
	String user;
	String password;
	String locale;
	String server;
	int serverPort;

	//parameterized connection method
	public ARServerUser arConnection() {

		ARServerUser aruser = new ARServerUser(user, password, locale, server,
				serverPort);
		return aruser;
	}

	
	//parameterized connection constructor
	public ARConn(String user, String password, String locale, String server, int serverPort)
	{
		 this.user = user;
		 this.password = password;
		 this.locale = locale;
		 this.server = server;
		 this.serverPort = serverPort;
		
	}
	
	
}
