package qsp1.genericlib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData implements AutoConstant {
	public String getExcelData(String Sheetname,int rownum,int cellnum ) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream f = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(f);
		return wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}

}
