package com.bmc.yellowfinws.qa;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.PropertyConfigurator;

import com.hof.mi.web.service.ReportRow;
import com.hof.mi.web.service.ReportServiceRequest;
import com.hof.mi.web.service.ReportServiceResponse;
import com.hof.mi.web.service.ReportServiceService;
import com.hof.mi.web.service.ReportServiceServiceLocator;
import com.hof.mi.web.service.ReportServiceSoapBindingStub;

public class ReportData {

	public static void main(String[] args) {

		String username = "siadmin";
		String password = "siadmin";
		
		String username1 = "user_01@msp";
		String password1 = "password";
		
		int reportID=58937;
		

		String log4jConfPath = "src/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

		ReportServiceRequest reportrequest = null;
		reportrequest = new ReportServiceRequest();

		ReportServiceRequest reportrequest1 = null;
		reportrequest1 = new ReportServiceRequest();

		System.out.println(reportrequest);
		ReportServiceResponse reportresponse = null;
		ReportServiceResponse reportresponse1 = null;
		

		reportrequest1.setLoginId(username);
		reportrequest1.setPassword(password);
		reportrequest1.setOrgId(new Integer(1));
//		reportrequest1.setOrgRef("msp_Banana Co.");
		reportrequest1.setReportRequest("SCHEMA");
		reportrequest1.setReportId(reportID); // Incident Details
//		reportrequest1.setReportUserId(username);
//		reportrequest1.setReportUserPassword(password);

		
		reportrequest.setLoginId(username);
		reportrequest.setPassword(password);
		reportrequest.setOrgId(new Integer(1));
//		reportrequest.setOrgRef("msp_Banana Co.");
		reportrequest.setReportRequest("RESULTSET");
		reportrequest.setReportId(reportID); // Incident Details 58507 CI type			58422 63564
//		reportrequest.setReportUserId(username);
//		reportrequest.setReportUserPassword(password);

		
		ReportData reportcall = new ReportData();
	
		

		try {
			
					
						reportresponse1 = reportcall.reportMethod().remoteReportCall(
					reportrequest1);
						


						ReportRow[] reportrow = reportresponse1.getResults();
//						System.out.println(reportrow.length);

						reportresponse = reportcall.reportMethod().remoteReportCall(
								reportrequest);
						
						System.out.println("Error Code " +reportresponse.getErrorCode());
						
						
			System.out.println("SCHEMA METHODS "+reportresponse.getContentType());
			String status = reportresponse.getStatusCode();
			System.out.println(status);

		


			ReportRow row[] = reportresponse.getResults();
				System.out.println(row.length);

			int i = 0; // row
			int k = 0; // value
			for (i = 0; i < row.length; i++) {
								String[] value = row[i].getDataValue();
				for (k = 0; k < value.length; k++) {

					System.out.println(value[k]);
					// }
				}

			}

			//
			// for (j=0;j<columns.length;j++)
			// {
			// String columnName1 = columns[j].getColumnName();
			// System.out.println(columnName1);
			// }

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Throwable exception = e.getCause();
			// if (exception==null)
			// {
			// System.out.println("Report Returned No Data");
			// }

		}

	}

	public ReportServiceSoapBindingStub reportMethod() // Report Call Method 1
	{
		String hostname = "vl-pun-atm-dv11";
		int port = 8181;
		String service = "/services/ReportService";

		ReportServiceServiceLocator reposervice = new ReportServiceServiceLocator(
				hostname, port,service , false);
		ReportServiceSoapBindingStub rssbs = null;
		try {

			rssbs = (ReportServiceSoapBindingStub) reposervice
					.getReportService();

		}

		catch (ServiceException e) {
			e.printStackTrace();
		}
		return rssbs;

	}
	
	
	public ReportServiceResponse response(ReportServiceRequest rsr) // Report Call Method 2
	{
		String hostname = "vl-pun-atm-dv11";
		int port = 8181;
		String service = "/services/ReportService";
		 ReportServiceResponse rs = null;

		 ReportServiceService ts = new ReportServiceServiceLocator(hostname, port, service, false);
         ReportServiceSoapBindingStub rssbs = null;
		try {
			rssbs = (ReportServiceSoapBindingStub) ts.getReportService();
		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
         
         try {
			rs = rssbs.remoteReportCall(rsr);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;

	}
	
}
