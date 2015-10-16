package com.bmc.artestdata.qa;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class CreateCompaniesInXL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateCompanies create = new CreateCompanies();
		create.create();

	}

}

class CreateCompanies {
	int totalCompanies = 100;

	public void create() {

		try {
			// create a workbook
			WritableWorkbook workbook = Workbook.createWorkbook(new File(
					"C:/Java_Source_Code/Company.xls"));
			// create a worksheet
			WritableSheet sheet = workbook.createSheet("Company", 0);
			int i;
			ArrayList<Integer> list;
			Integer random;
			for (i = 0; i <= totalCompanies; i++)

			{
				list = new ArrayList<Integer>();
				list.add(i);
				Collections.shuffle(list);
				for (int j = 0; j < list.size(); j++) {

					random = list.get(j);
					// write cell within sheet
					// to change the cell change below
					// Automation.Company_
					sheet.addCell(new Label(0, i, "Bhushan_Com" + 0 + random));
					sheet.addCell(new Label(1, i, "Bhushan_Auto" + 1 + random));
				}

			}

			System.out.println(totalCompanies + "Companies and Users created");

			workbook.write();

			workbook.close();
			// in.close();
		} catch (IOException | WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}