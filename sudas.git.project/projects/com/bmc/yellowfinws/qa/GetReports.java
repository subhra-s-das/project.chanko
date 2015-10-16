package com.bmc.yellowfinws.qa;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.PropertyConfigurator;

import com.hof.mi.web.service.AdministrationPerson;
import com.hof.mi.web.service.AdministrationReport;
import com.hof.mi.web.service.AdministrationServiceRequest;
import com.hof.mi.web.service.AdministrationServiceResponse;
import com.hof.mi.web.service.AdministrationServiceService;
import com.hof.mi.web.service.AdministrationServiceServiceLocator;
import com.hof.mi.web.service.AdministrationServiceSoapBindingStub;

/*
 * ########################################################## 
 * GET LIST OF REPORTS FROM YELLOWFIN **** <SUDAS>
 * ##########################################################
 */

public class GetReports {

	public static void main(String[] args) {

		String hostname = "vw-pun-atm-dv19";
		String username = "siadmin";
		String password = "siadmin";
		int port = 8181;
		
//		String hostname = "clm-pun-015281";
//		String username = "admin@yellowfin.com.au";
//		String password = "test";
//		int port = 91;

		// log 4j
		String log4jConfPath = "src/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

		// connection
		AdministrationServiceService ts = new AdministrationServiceServiceLocator(
				hostname, port, "/services/AdministrationService", false);

		try {

			AdministrationServiceRequest rsr = new AdministrationServiceRequest();
			AdministrationServiceSoapBindingStub rssbs = (AdministrationServiceSoapBindingStub) ts
					.getAdministrationService();

			AdministrationPerson person;
			person = new AdministrationPerson();
			person.setUserId(username);

			rsr.setLoginId(username);
			rsr.setPassword(password);
			rsr.setOrgId(new Integer(1));
			rsr.setOrgRef("bmc");
			rsr.setFunction("GETALLUSERREPORTS");
			rsr.setPerson(person);

			AdministrationServiceResponse rs = null;
			rs = rssbs.remoteAdministrationCall(rsr);

			AdministrationReport[] allReports = rs.getReports();
			

			// System.out.println(rs.getReport().getReportName());

			for (int i = 0; i < allReports.length; i++) {
				System.out.println("Report Name "+allReports[i].getReportName());
				System.out.println("Report Category : "+allReports[i].getReportCategory());
				System.out.println("Report ID : "+allReports[i].getReportId());
				System.out.println("*******************************************");
//				System.out.println(allReports[i].getReportUUID());
			}

		} catch (ServiceException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}