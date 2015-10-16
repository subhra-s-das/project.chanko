package com.bmc.yellowfinws.qa;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.PropertyConfigurator;

import com.hof.mi.web.service.RelatedReport;
import com.hof.mi.web.service.ReportRow;
import com.hof.mi.web.service.ReportSchema;
import com.hof.mi.web.service.ReportServiceRequest;
import com.hof.mi.web.service.ReportServiceResponse;
import com.hof.mi.web.service.ReportServiceServiceLocator;
import com.hof.mi.web.service.ReportServiceSoapBindingStub;

public class RefreshReportData {

	public static void main(String[] args) {

		String username = "siadmin";
		String password = "siadmin";

		int reportID = 58508;

		String log4jConfPath = "src/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

		ReportServiceRequest  reportrequest = new ReportServiceRequest(); 
		


		ReportServiceResponse reportresponse = null;



		reportrequest.setLoginId(username);
		reportrequest.setPassword(password);
		reportrequest.setReportUserId(username);
		reportrequest.setReportUserPassword(username);
		reportrequest.setOrgId(new Integer(1));
		reportrequest.setOrgRef("bmc");
		reportrequest.setReportRequest("RESULTSET"); // RESULTSET
		reportrequest.setReportId(reportID); // Incident Details 58507 CI type

		RefreshReportData reportcall = new RefreshReportData();

		try {
			reportresponse = reportcall.reportMethod().remoteReportCall(
					reportrequest);

			System.out.println("ERROR CODE " + reportresponse.getErrorCode());

			ReportRow[] reportrow = reportresponse.getResults();
			System.out.println(reportrow.length);


			System.out.println("STATUS CODE " + reportresponse.getStatusCode());
			System.out.println("ERROR CODE " + reportresponse.getErrorCode());

			System.out.println(reportresponse.getViewName());

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

		}

	}

	public ReportServiceSoapBindingStub reportMethod() // Report Call Method
	{
		String hostname = "clm-pun-015281";
		int port = 94;

		ReportServiceServiceLocator reposervice = new ReportServiceServiceLocator(
				hostname, port, "/services/ReportService", false);
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

}
