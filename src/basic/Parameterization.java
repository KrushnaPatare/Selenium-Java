package basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("F:\\Book1.xlsx");//to establish connection between computer file and java eclipse.
		
		// WorkbookFactory.create(file) to replicate the file deta from compuer to java.

		String value = WorkbookFactory.create(file).getSheet("credentials").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
	}

}
