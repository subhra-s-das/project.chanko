package com.bmc.artestdata.qa;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

//import oracle.net.aso.f;

import com.bmc.arsys.api.ARException;
import com.bmc.arsys.api.ARServerUser;
import com.bmc.arsys.api.Entry;
import com.bmc.arsys.api.EntryListInfo;
import com.bmc.arsys.api.Field;

public class ListFormFieldID {

	public static void main(String[] args) {
		new FieldList().FieldID();

	}

}

class FieldList {

	String formName = "COM:Company";
	String entryId;

	public void FieldID()

	{

		ARServerUser user = new ARServerUser("Demo", "bmcAdm1n", "en",
				"vl-pun-atm-qa12", 0);

		// Getting a list of FIELD ID for a particular form
		List<Field> fieldList;
		try {
			fieldList = user.getListFieldObjects(formName);

			Iterator<Field> fiterator = fieldList.iterator();
			while (fiterator.hasNext()) {
				int Field_ID = fiterator.next().getFieldID();
				System.out.println("Field ID : " + Field_ID);
				String fieldName = fiterator.next().getName();
				System.out.println("Field Name : " + fieldName);
			}

		} catch (ARException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}