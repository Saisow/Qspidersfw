package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {
	
	public String getExcelData(String sheetName,int row,int cellnum) throws Throwable {
		
		//Step1:Get the connection of physical file
		
		FileInputStream fis = new FileInputStream(IpathConstant.excelfilepath);
		
		//step2:Open the workbook in readmode
		
		Workbook wb = WorkbookFactory.create(fis);
		
		//step3:Get control of the sheet
		
		Sheet sh = wb.getSheet(sheetName);
		
		//step4:get control of row
		
		Row rn = sh.getRow(row);
		
		//step5:Get control of the cell
		
		Cell cn = rn.getCell(cellnum);
		
		//Step6:Read the cell value
		
		String cellvalue = cn.getStringCellValue();
		//System.out.println(cellvalue);
	
		return cellvalue;
		
		
		
	}

	

}
