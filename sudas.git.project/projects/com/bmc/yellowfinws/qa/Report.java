package com.bmc.yellowfinws.qa;

import java.rmi.RemoteException;
import java.rmi.server.RemoteServer;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.PropertyConfigurator;

import com.hof.mi.web.service.AdministrationServiceRequest;
import com.hof.mi.web.service.AdministrationServiceResponse;
import com.hof.mi.web.service.AdministrationServiceService;
import com.hof.mi.web.service.AdministrationServiceServiceLocator;
import com.hof.mi.web.service.AdministrationServiceSoapBindingStub;
import com.hof.mi.web.service.ReportRow;
import com.hof.mi.web.service.ReportServiceClient;
import com.hof.mi.web.service.ReportServiceRequest;
import com.hof.mi.web.service.ReportServiceResponse;
import com.hof.mi.web.service.WebserviceException;
import com.hof.mi.web.service.i4Report;

public class Report {

	public static void main(String[] args) {



		String hostname = "vl-pun-atm-qa12";
		String username = "siadmin";
		String password = "siadmin";
		int port = 91;
		
		

		String log4jConfPath = "src/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

		AdministrationServiceService ts = new AdministrationServiceServiceLocator(hostname, port, "/SmartReporting/services/AdministrationService", false);
		
		AdministrationServiceSoapBindingStub rssbs;
		try {
			rssbs = (AdministrationServiceSoapBindingStub) ts.getAdministrationService();
		
		AdministrationServiceRequest rsr = new AdministrationServiceRequest();
		AdministrationServiceResponse rs = null;

		rsr.setLoginId(username);
		rsr.setPassword(password);
		rsr.setOrgId(new Integer(1));
		rsr.setOrgRef("test_GlobalLogic");
//		rsr.setFunction("LISTCLIENTS");

		rs = rssbs.remoteAdministrationCall(rsr);
		
		ReportServiceRequest reportrequest = new ReportServiceRequest();
		ReportServiceResponse rresponse = new ReportServiceResponse();
		reportrequest.setReportRequest("TEXT");
		
		
		reportrequest.setReportId(58587);
		
		
		
		} catch (ServiceException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
