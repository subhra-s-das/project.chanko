package jexel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;



public class ExcelHelper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ExcelHelper01().ExcelUtility();
	}

	//Exercise. Declare a fruit array. Take all the fruit elements in Array list.
	//assign the array list to a map 
	public void ExcelUtility()
	{
		/*String Fruits [] = new String[4]; 
		Fruits[0]="Apple";
		Fruits[1]="Banana";
		this is one way of implementing an array*/
		
		File f = new File("/Users/S_Das/Documents/Java/ListOfAnimals.xls");
		try {
//			WritableWorkbook workbook = Workbook.createWorkbook(new File("/Users/S_Das/Documents/Java/ListOfAnimals.xls"));
			Workbook workbook = Workbook.getWorkbook(new FileInputStream(f));
			Sheet sheet = workbook.getSheet(0);
			int rows = sheet.getRows();
			for (int i=0;i<rows;i++)
			{
			Cell Cvalues = sheet.getCell(1, i);
			String content = Cvalues.getContents();
			System.out.println(content.replace('\n', '\r'));
			}
			
		} catch (IOException | BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
}



