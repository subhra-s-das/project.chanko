package com.bmc.artestdata.qa;

/*
 Author: Subhra S. Das
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import com.bmc.arsys.api.ARException;
import com.bmc.arsys.api.ARServerUser;
import com.bmc.arsys.api.Entry;
import com.bmc.arsys.api.Value;

public class CreateComCompanierAR {

	public static void main(String[] args) {

		ARSystem connection = new ARSystem();
		connection.getCompany();
		connection.CreateITSMCompanies();

	}

}

class comType {
	String type;

	public String getCompany() {
		// Type of companies
		// create a 1D Array
		String companyType[] = { "Operating company", "Service Provider",
				"Customer", "Vendor" };

		ArrayList<String> list = new ArrayList<String>();
		// System.out.println(companyType.length);

		for (int i = 0; i < companyType.length; i++) {
			list.add(i, companyType[i]);
		}

		Collections.shuffle(list);
		String type = list.get(0);

		return type;
	}
}

class ARSystem extends comType {

	// method to get list of companies from input file
	/*
	 * load workbook load sheet load cells get the content of cell
	 */

	public void CreateITSMCompanies() {

		ARServerUser user = new ARServerUser("Demo", "bmcAdm1n", "en",
				"vl-pun-atm-qa12", 0);
		File f = new File("C:/Java_Source_Code/Company.xls");
		try {
			Workbook workbook = Workbook.getWorkbook(f);
			Sheet sheet = workbook.getSheet(0);

			// String hostID = user.getLocalHostID();
			System.out.println("Connected to " + user.getServer());

			Cell[] columns = sheet.getColumn(0);
			for (int i = 0; i < columns.length; i++) {
				// System.out.println(columns[i].getContents());

				Cell cell = sheet.getCell(0, i);
				String CompanyName = cell.getContents();
				// System.out.println(CompanyName);

				Entry entry = new Entry();

				entry.put(1000000001, new Value(CompanyName)); // company Name
				entry.put(1000000006, new Value(super.getCompany())); // Type
				entry.put(1000000000, new Value("Created By Automation")); // description

				System.out.println(entry.toString());
				user.createEntry("COM:Company", entry);

			}

		} catch (IOException | BiffException | ARException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}