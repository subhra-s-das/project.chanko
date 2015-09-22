package com.bmc.yellowfinws.qa;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.hof.mi.web.service.ReportRow;
import com.hof.mi.web.service.ReportSchema;
import com.hof.mi.web.service.ReportServiceClient;
import com.hof.mi.web.service.ReportServiceRequest;
import com.hof.mi.web.service.ReportServiceResponse;
import com.hof.mi.web.service.ReportServiceService;
import com.hof.mi.web.service.ReportServiceServiceLocator;
import com.hof.mi.web.service.ReportServiceSoapBindingStub;
import com.hof.mi.web.service.WebserviceException;
import com.sun.rowset.internal.Row;

public class Refresh {

	public static void main(String[] args) {
		//
		// ReportServiceRequest reportrequest = new ReportServiceRequest();
		//
		// reportrequest.setLoginId("siadmin");
		// reportrequest.setPassword("siadmin");
		// reportrequest.setOrgId(new Integer(1));
		//
		// reportrequest.setReportRequest("SCHEMA");
		// reportrequest.setReportId(63147);
		// // reportrequest.setReportUserId("sudas@test");
		// // reportrequest.setReportUserPassword("bmcAdm1n");
		//
		// // reportrequest.setOrgRef("test_yahoo");
		//
		// Refresh refresh = new Refresh();
		// try {
		//
		// ReportServiceResponse response = refresh.reportMethod()
		// .remoteReportCall(reportrequest);
		// System.out.println(response.getErrorCode());
		// System.out.println(response.getStatusCode());
		// System.out.println(response.getCategory());
		// System.out.println("BIANARY DATA " + response.getBinaryObjects());
		//
		// for (int y = 0; y < response.getColumns().length; y++) {
		// System.out.println("got length");
		// }
		// // System.out.println(response.getResults().length);
		//
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		//

		ReportServiceRequest reportrequest = new ReportServiceRequest();
		ReportServiceResponse response = null;
		reportrequest.setLoginId("admin@yellowfin.com.au");
		reportrequest.setPassword("test");
		reportrequest.setOrgId(new Integer(1));
		reportrequest.setReportRequest("RESULTSET");
		reportrequest.setReportId(54005);
		// reportrequest.setReportUserId("sudas@test");
		// reportrequest.setReportUserPassword("bmcAdm1n");

		Refresh refresh = new Refresh();
		response = refresh.doRequest(reportrequest);

		// System.out.println(response.getSessionId());
		// reportrequest.setSessionId(response.getSessionId());

		ReportRow[] row = response.getResults();
		System.out.println(row.length);
		int i = 0; // row
		int k = 0; // value
		for (i = 0; i < row.length; i++) {
			for (int j = 0; j < row[i].getDataValue().length; j++)
				System.out.println(response.getResults()[i].getDataValue()[j]);
			//
			// String[] value = row[i].getDataValue();
			// for (k = 0; k < value.length; k++)
			{

				// System.out.println(value[k]);
				// }
			}

		}

	}

	private ReportServiceResponse doRequest(ReportServiceRequest rsr) {

		ReportServiceResponse response = null;
		String hostname = "clm-pun-015281";
		int port = 91;

		try {

			ReportServiceService ts = new ReportServiceServiceLocator(hostname,
					port, "/services/ReportService", false);
			ReportServiceSoapBindingStub rssbs = (ReportServiceSoapBindingStub) ts
					.getReportService();
			response = rssbs.remoteReportCall(rsr);

		} catch (Exception e) {

			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

		return response;

	}

	public ReportServiceSoapBindingStub reportMethod() // Report Call Method
	{
		String hostname = "vl-pun-atm-dv16";
		int port = 91;

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
