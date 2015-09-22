package com.bmc.artestdata.qa;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import com.bmc.arsys.api.ARException;
import com.bmc.arsys.api.ARServerUser;
import com.bmc.arsys.api.Entry;
import com.bmc.arsys.api.Value;

public class CreateUsersCTMpeopleForCompanies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ("Demo", "bmcAdm1n", "en", "vl-pun-atm-qa12", 0)
		createUsers createuser = new createUsers("Demo", "bmcAdm1n", "en",
				"vl-pun-atm-qa12", 0);
		createuser.create();
	}

}

class createUsers {
	String userName;
	String password;
	String locale;
	String serverName;
	int port;

	public createUsers(String userName, String password, String locale,
			String serverName, int port) {
		this.userName = userName;
		this.password = password;
		this.locale = locale;
		this.serverName = serverName;
		this.port = port;
	}

	public void create() {
		ARServerUser user = new ARServerUser(userName, password, locale,
				serverName, port);

		System.out.println("Connecting to AR Server" + user.getServer());

		try {
			user.verifyUser();

		}

		catch (ARException e) {
			String message = e.getMessage();
			System.out.println(message);
		}

		// String UserName = "REPO-USR";
		String RemedyPassword = "passowrd";

		Entry entry = new Entry(); // creating Object of Entry class

		// jexcel
		File f = new File("C:/Java_Source_Code/Company.xls");
		Workbook workbook;
		try {
			workbook = Workbook.getWorkbook(f);
			Sheet sheet = workbook.getSheet(0);
			Cell[] columns = sheet.getColumn(0);
			for (int i = 0; i < columns.length; i++) {

				Cell C1 = sheet.getCell(0, i);
				String companyName = C1.getContents();

				Cell C2 = sheet.getCell(1, i);
				String userName = C2.getContents();

				entry.put(1000000019, new Value(userName)); // firstName
				entry.put(1000000018, new Value("Automation")); // LastName
				entry.put(1000000022, new Value("2000")); // ClientType
				entry.put(1000000001, new Value(companyName)); // Company

				/*
				 * optional parameters entry.put(1, new
				 * Value("STE000000003427")); entry.put(200000012, new
				 * Value("APAC")); // Region entry.put(200000007, new
				 * Value("INDIA")); // Site group
				 */
				entry.put(1000000056, new Value("0123456789")); // PhoneNumber
				entry.put(4, new Value(userName)); // login
				entry.put(1000000048, new Value(userName + companyName
						+ ".co.in")); // Email
				entry.put(1000005507, new Value(RemedyPassword));
				entry.put(109, new Value("1"));

				//
				try {
					user.createEntry("CTM:People", entry);
				} catch (ARException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(entry);

			}

		} catch (BiffException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}