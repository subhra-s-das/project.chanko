package com.bmc.yellowfinws.qa;

import javax.xml.rpc.ServiceException;

import com.hof.mi.web.service.AdministrationServiceService;
import com.hof.mi.web.service.AdministrationServiceServiceLocator;
import com.hof.mi.web.service.AdministrationServiceSoapBindingStub;

public class AdministrationService {

	public static void main(String[] args) {

	}

	public  AdministrationServiceSoapBindingStub adminservice() {

		String hostname = "vl-pun-atm-dv11";
		int port = 8181;
		String url = "/services/AdministrationService";

		AdministrationServiceService ts = new AdministrationServiceServiceLocator(
				hostname, port, url, false);
		AdministrationServiceSoapBindingStub rssbs = null;
		try {
			
			rssbs=(AdministrationServiceSoapBindingStub) ts.getAdministrationService();
		} 
		catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return rssbs;
		
	}

}
