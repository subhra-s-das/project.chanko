package com.bmc.yellowfinws.qa;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.PropertyConfigurator;

import com.hof.mi.web.service.AdministrationClientOrg;
import com.hof.mi.web.service.AdministrationPerson;
import com.hof.mi.web.service.AdministrationServiceRequest;
import com.hof.mi.web.service.AdministrationServiceResponse;
import com.hof.mi.web.service.AdministrationServiceService;
import com.hof.mi.web.service.AdministrationServiceServiceLocator;
import com.hof.mi.web.service.AdministrationServiceSoapBindingStub;

/*
 * ########################################################## 
 * GET LIST OF USERS FROM YELLOWFIN **** <SUDAS>
 * ##########################################################
 */
public class GetUsers extends GetClientOrg {

	public static void main(String[] args) {

		String hostname = "vl-pun-atm-dv19";
		String username = "siadmin";
		String password = "siadmin";
		int port = 8181;

		// setting up the log4j
		String log4jConfPath = "src/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

		// creating a connection
		AdministrationServiceService ts = new AdministrationServiceServiceLocator(
				hostname, port, "/services/AdministrationService", false);

		try {
			// Create AdministrationServiceRequest object
			AdministrationServiceRequest rsr = new AdministrationServiceRequest();
			// SOAP
			AdministrationServiceSoapBindingStub rssbs = (AdministrationServiceSoapBindingStub) ts
					.getAdministrationService();
			rsr.setLoginId(username);
			rsr.setPassword(password);
			rsr.setOrgId(new Integer(1));

			// client organization object
			AdministrationClientOrg aco = new AdministrationClientOrg();
			aco.setClientReferenceId("test_Yahoo");
			rsr.setClient(aco);
			rsr.setFunction("LISTUSERSATCLIENT");

			// Dave@testtenant

			AdministrationServiceResponse rs = rssbs
					.remoteAdministrationCall(rsr);

			// status code of WS call
			String statusCode = rs.getStatusCode();
			System.out.println("statusCode " + statusCode);

			// Get users belonging to a client organization
			AdministrationPerson[] people = rs.getPeople();

			if (people == null) {
				System.out.println("Client org not available");
			} else {
				int i = 0;
				for (i = 0; i < people.length; i++) {
					String Person = people[i].getUserId();
					System.out.println(Person);

				}
			}

		} catch (ServiceException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
