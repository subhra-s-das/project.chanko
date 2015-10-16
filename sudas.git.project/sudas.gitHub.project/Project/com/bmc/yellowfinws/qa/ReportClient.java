package com.bmc.yellowfinws.qa;

import java.rmi.RemoteException;

import javax.xml.ws.Response;

import com.hof.mi.web.service.AdministrationServiceClient;
import com.hof.mi.web.service.ReportChart;
import com.hof.mi.web.service.ReportRow;
import com.hof.mi.web.service.ReportSchema;
import com.hof.mi.web.service.ReportServiceClient;
import com.hof.mi.web.service.ReportServiceRequest;
import com.hof.mi.web.service.ReportServiceResponse;
import com.hof.mi.web.service.WebserviceException;
import com.hof.mi.web.service.i4Report;

public class ReportClient {

	public static void main(String[] args) {

		String hostname = "vl-pun-atm-dv11";
		String username = "siadmin";
		String password = "siadmin";
		int port = 8181;
		String serviceURL="/services/";
		
		try {
			ReportServiceClient reportclient = new ReportServiceClient
					(hostname, port, username, password, serviceURL+"ReportService");
			
i4Report i4 = reportclient.loadReportForUser(58646, username, password, "msp_Banana Co.");
	
			
AdministrationServiceClient adminclient = new AdministrationServiceClient
(hostname, port, username, password, serviceURL+"AdministrationService");

i4.run();
System.out.println(i4.render());

			

		
		} 
		catch (WebserviceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		


	}

}
