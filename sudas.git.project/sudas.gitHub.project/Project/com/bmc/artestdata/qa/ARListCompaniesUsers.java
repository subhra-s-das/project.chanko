package com.bmc.artestdata.qa;

import java.util.Collection;

import java.util.Iterator;
import java.util.List;

import com.bmc.arsys.api.ARException;
import com.bmc.arsys.api.ARServerUser;
import com.bmc.arsys.api.Entry;
import com.bmc.arsys.api.EntryListFieldInfo;
import com.bmc.arsys.api.EntryListInfo;
import com.bmc.arsys.api.Form;
import com.bmc.arsys.api.Value;

public class ARListCompaniesUsers {

	public static void main(String[] args) {
new ARListCompaniesUsers().readUsersCompanies();
	}

public void readUsersCompanies()
{
	ARServerUser user = new ARServerUser("Demo", "bmcAdm1n", "en",
			"vl-pun-atm-qa12", 0);
	
	try {
//		Form form = user.getForm("CTM:People");
//		List<EntryListFieldInfo> formEntry = form.getEntryListFieldInfo();
//		Iterator<EntryListFieldInfo> formItr = formEntry.iterator();
//		while(formItr.hasNext())
//		{
//			System.out.println(formItr.next().getFieldId());
//		}
		
		List<EntryListInfo> entList = user.getListEntry("CTM:People", null, 0, 300, null, null, false, null);
		Iterator<EntryListInfo> entryItr = entList.iterator();
		while(entryItr.hasNext())
		{
			String entryID = entryItr.next().getEntryID();// this returns the entry ID
			Entry entry = user.getEntry("CTM:People", entryID, null);
			Value value = entry.get(1000000001);
			System.out.println(value.getValue().toString());
			
			
			
			
		}
		
		
	} catch (ARException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
	
	
}
