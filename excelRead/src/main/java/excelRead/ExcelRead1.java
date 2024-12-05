package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1
{
	static FileInputStream f;
	static XSSFWorkbook w;//excel workbook access
	static XSSFSheet s;//sheet access
	
	public static String getStringdata(int a,int b) throws IOException
	 {
		 f=new FileInputStream("C:\\Users\\REENA\\Desktop\\JAVA\\EXCEL files\\sample.xlsx");
		 w=new XSSFWorkbook(f);
		 s=w.getSheet("Sheet1");
		 XSSFRow r=s.getRow(a);
		 XSSFCell c=r.getCell(b);
		 return c.getStringCellValue();
	 }
	 
	 public static String getIntegerdata(int a,int b) throws IOException
	 {
		 f=new FileInputStream("C:\\Users\\REENA\\Desktop\\JAVA\\EXCEL files\\sample.xlsx");
		 w=new XSSFWorkbook(f);
		 s=w.getSheet("Sheet1");
		 XSSFRow r=s.getRow(a);
		 XSSFCell c=r.getCell(b);
		 int y=(int) c.getNumericCellValue();
		 return String.valueOf(y);
	 }
}
