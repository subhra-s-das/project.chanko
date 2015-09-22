package com.bmc.artestdata.qa;

/*
Author: Subhra S. Das
*/
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.bmc.arsys.api.ARException;
import com.bmc.arsys.api.ARServerUser;
import com.bmc.arsys.api.Entry;
import com.bmc.arsys.api.EntryListInfo;
import com.bmc.arsys.api.Value;

public class GetListOfCompanies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComList comm = new ComList();
		comm.CreateCompanies();

	}

}

class ComList {
	String formName = "COM:Company";
	int fieldId = 1000000001;

	public void CreateCompanies() {
		String entrtID;
		// create a ARServerUser object
		ARServerUser user = new ARServerUser("Demo", "bmcAdm1n", "en", "vl-pun-atm-qa12", 0);

		try {
			// get listEntry
			List<EntryListInfo> entList = user.getListEntry(formName, null, 0, 300, null, null, false, null);

			Iterator<EntryListInfo> itr = entList.iterator();

			// write to file
			File file = new File("c:/Test/arsystem.txt");
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));

			// find the entry ID
			while (itr.hasNext()) {
				entrtID = (itr.next()).getEntryID();
				// System.out.println(entrtID);

				out.write(entrtID.getBytes());
				out.write("\n".getBytes());

				// get the entry object for every entry ID | get the value
				// object for field ID | get the value from value object
				Entry entry = user.getEntry(formName, entrtID, null);
				Value v = entry.get(fieldId);
				String companyName = v.toString();
				System.out.println(companyName);

			}
			out.close();

		} catch (ARException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
