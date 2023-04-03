package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) throws IOException {
	
		File src = new File("F:\\WorkSpace\\SwagLabs\\src\\test\\resources\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = xsf.getSheet("writeToExel");
		
		sheet.getRow(1).getCell(1).setCellValue("Mike Testing");

		FileOutputStream fos = new FileOutputStream(src);
		
		xsf.write(fos);
		
		xsf.close();
		
	}

}
