package apachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) {
		new Excel().create();

	}

	public void create()
	{
		try {
			File file = new File("/Users/S_Das/apachepoi.xlsx");
			if(file.exists())
			{
				file.delete();
			}
			else 
			{
				file.createNewFile();
			}
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			FileOutputStream os = new FileOutputStream(file);
			XSSFSheet sheet = workbook.createSheet("TestSheet");
XSSFRow r1 = sheet.createRow(0);	
XSSFCell cell = r1.createCell(0, 0);

cell.setCellValue("Hello World");
		
			workbook.write(os);
			workbook.close();
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}