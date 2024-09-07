package Seleniumviamaven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingexceldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//Excel File - Workbook - Sheets - Rows - cells - steps to be followed
		
		FileInputStream file = new FileInputStream("C:\\Users\\91956\\eclipse-workspace\\Basicknowledge\\Testdata\\Testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("number of rows" + totalRows);
		System.out.println("number of cells" + totalCells);
		
		for(int r =0; r<=totalRows;r++)
			
		{
			XSSFRow currentRow= sheet.getRow(r);
			
		

		for(int c =0 ; c<totalCells;c++)
			
		{
		  
		XSSFCell cell = currentRow.getCell(c);
		System.out.print(cell.toString() + "\t");
		}
	     System.out.println();
		}
		
		workbook.close();
		file.close();
}
	
}
