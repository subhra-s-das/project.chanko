package com.bmc.yellowfinws.qa;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.PropertyConfigurator;

import com.hof.mi.web.service.AdministrationClientOrg;
import com.hof.mi.web.service.AdministrationServiceRequest;
import com.hof.mi.web.service.AdministrationServiceResponse;
import com.hof.mi.web.service.AdministrationServiceService;
import com.hof.mi.web.service.AdministrationServiceServiceLocator;
import com.hof.mi.web.service.AdministrationServiceSoapBindingStub;

/*
 * ########################################################## 
 * GET LIST OF CLIENT ORG FROM YELLOWFIN **** <SUDAS>
 * ##########################################################
 */
public class GetClientOrg {

	public static void main(String[] args) {

		String hostname = "vl-pun-atm-qa12";
		String username = "siadmin";
		String password = "siadmin";
		int port = 9191;
		
//		String hostname = "vl-pun-atm-dv16";
//		String username = "siadmin";
//		String password = "siadmin";
//		int port = 91;


		String log4jConfPath = "src/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

		AdministrationServiceService ts = new AdministrationServiceServiceLocator(hostname, port, "/services/AdministrationService", false);

		try {
			AdministrationServiceSoapBindingStub rssbs = (AdministrationServiceSoapBindingStub) ts.getAdministrationService();
			AdministrationServiceRequest rsr = new AdministrationServiceRequest();
			AdministrationServiceResponse rs = null;

			rsr.setLoginId(username);
			rsr.setPassword(password);
			rsr.setOrgId(new Integer(1));
			rsr.setFunction("LISTCLIENTS");
			rs = rssbs.remoteAdministrationCall(rsr);
			String statusCode = rs.getStatusCode();
			System.out.println(statusCode);

			AdministrationClientOrg[] clients = rs.getClients();
			String clientName = null;
			String clientRefID =null;
//			System.out.println(clients.length);
			for (int i = 0; i < clients.length; i++) {
				clientName = clients[i].getClientName();
				clientRefID = clients[i].getClientReferenceId();
				System.out.println("Client Name :"+" "+clientName);
//				System.out.println("Client RefID :"+" "+clientRefID);
							}
			
//			
//			System.out.println(clientRefID);
		}

		catch (ServiceException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}