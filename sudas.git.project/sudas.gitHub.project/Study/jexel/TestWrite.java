package jexel;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
// This code is not working on mac. The problem is with the file extension .xls 
// Actually instead of creating a file with .xls extension MAC
//is creating a file with type .txt
public class TestWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			 WritableWorkbook workbook = Workbook.createWorkbook(new File("/Users/S_Das/Documents/Java/Company.xls"));  
           // create a worksheet  
           WritableSheet sheet = workbook.createSheet("Company", 0);
           sheet.addCell(new Label(0, 0, "test"));
			
		} catch (IOException | WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
