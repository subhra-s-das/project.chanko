package com.bmc.yellowfinws.qa;


import java.rmi.RemoteException;

import org.apache.axis.transport.http.AdminServlet;

import com.hof.mi.web.service.AdministrationPerson;
import com.hof.mi.web.service.AdministrationServiceRequest;
import com.hof.mi.web.service.AdministrationServiceResponse;

public class ReportsForUsers {

	public static void main(String[] args) {
		String username = "siadmin";
		String password = "siadmin";
		AdministrationServiceRequest request = new AdministrationServiceRequest();
		AdministrationServiceResponse response = null;
		
		request.setLoginId(username);
		request.setPassword(password);
		request.setOrgId( new Integer(1));
		
		AdministrationPerson person= null;
				person=new AdministrationPerson();
//		person.setUserId(userId);
				
		request.setPerson(person);
		
		AdministrationService service = new AdministrationService();
		try {
			
			response=service.adminservice().remoteAdministrationCall(request);
			
		
			
			
			
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
