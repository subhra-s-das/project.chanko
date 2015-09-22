package jexel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class CompareColumns {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareC C = new CompareC();
		C.Compare1();
	}
}

/*
 * This is a code compare two columns between excel sheet Here I am comparing
 * column A and column B. This is similar to index search
 * 
 * BUG: this code has an issue right now. For NULL between the column cell it is
 * returning true
 */

class CompareC {
	File file = new File("/Users/S_Das/Documents/Java/Test.xls");
	String col1Content;
	String col2Content;

	public void Compare1() {
		try {
			Workbook workbook = Workbook.getWorkbook(new FileInputStream(file));
			Sheet sheet = workbook.getSheet(0);
			int rowNum = sheet.getRows();
			ArrayList<String> list1 = new ArrayList<String>();

			for (int i = 0; i < rowNum; i++) {
				Cell col1 = sheet.getCell(0, i);
				Cell col2 = sheet.getCell(1, i);
				col1Content = col1.getContents();
				col2Content = col2.getContents();
				list1.add(i, col1Content);
				// System.out.println("col2Content "+col2Content);
			}

			for (int i = 0; i < rowNum; i++) {
				Cell col1 = sheet.getCell(0, i);
				Cell col2 = sheet.getCell(1, i);
				col1Content = col1.getContents();
				col2Content = col2.getContents();

				/*
				 * if (!(col2Content.isEmpty())) {
				 * System.out.println(sheet.getCell(1, i).getRow() + " " +
				 * sheet.getCell(1, i).getColumn() + " " + "empty"); }
				 */

				if (list1.contains(col2Content) && (!(col2Content.isEmpty()))) {
					System.out.println(col2Content + " present in column A");
				}

				else if ((!(col2Content.isEmpty()))) {
					System.out
							.println(col2Content + " not present in column A");
				}

			}

		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}