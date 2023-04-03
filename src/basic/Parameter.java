package basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameter {

	public static String getExelData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		
        FileInputStream file = new FileInputStream("F:\\Book1.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell ).getStringCellValue();
		
		return value;
	}

}
