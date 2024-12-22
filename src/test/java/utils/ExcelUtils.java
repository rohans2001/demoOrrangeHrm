package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	 XSSFWorkbook workbook;
	    XSSFSheet sheet;

	    public ExcelUtils(String excelPath, String sheetName) {
	        try {
	            FileInputStream fis = new FileInputStream(excelPath);
	            workbook = new XSSFWorkbook(fis);
	            sheet = workbook.getSheet(sheetName);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public String getCellData(int rowNum, int colNum) {
	        DataFormatter formatter = new DataFormatter();
	        return formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
	    }

	    public int getRowCount() {
	        return sheet.getPhysicalNumberOfRows();
	    }
}
