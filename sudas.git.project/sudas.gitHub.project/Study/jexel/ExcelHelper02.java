package jexel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelHelper02 {
	String content;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new ExcelHelper02().replaceNulls();
	}

	// Read column of excel sheet and remove all empty cells and write again to
	// excel
	public void replaceNulls() throws IOException {
		File f = new File("/Users/S_Das/Documents/Java/Animals.xls");
	
		try {
			Workbook workbook = Workbook.getWorkbook(new FileInputStream(f));
WritableWorkbook workbook1 = Workbook.createWorkbook(new File("/Users/S_Das/Documents/Java/sudas.xls"));
WritableSheet newSheet =workbook1.createSheet("Animals", 0);
//WritableSheet newSheet = createWorkbook.createSheet("Animals", 0);
			Sheet sheet = workbook.getSheet(0);
			int rows = sheet.getRows();
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < rows; i++) {
				Cell Cvalues = sheet.getCell(0, i);
				content = Cvalues.getContents();
				// System.out.println(content);
				list.add(content);
				// list.removeAll(Collections.singleton(null));

				if (!(content.isEmpty()))
			/*	 if(content !=null) // this will not work as cells are Empty
				 not null
				 length of NULL is nothing where as length of String.isempty
				 is '0'*/
				{
					String notEmptyCells = list.get(i);
					System.out.println(notEmptyCells);
					
					newSheet.addCell(new Label(0, i, notEmptyCells));
				}

				
				
			}

		} catch (BiffException | IOException | WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
