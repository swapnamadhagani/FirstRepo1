package Section3;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ReusableMethods1 {
public String propertyFetch(String key,String path) throws Throwable{
	FileInputStream fis=new FileInputStream(path);
	Properties pObj=new Properties();
	pObj.load(fis);
	String data=pObj.getProperty()
	return data;
}
public String excelFetch(String path,String sheet,int row,int cell)throws Throwable{
	FileInputStream fis=new FileInputStream("C:\\selenium30\\excel.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	DataFormatter format = new DataFormatter();
	String data=format.formatCellValue(book.getSheet("Sheet1").getRow(0).getCell(0));
	
	return data;
}
public void maximize(WebDriver driver) {
	driver.manage().window().maximize();
}
public static void main(String[] args) throws Throwable{
	ReusableMethods rn=new ReusableMethods();
	String url=rn.propertyFetch("url");
	String pwd=rn.propertyFetch("pwd");
	String un=rn.propertyFetch("un");
	String data=rn.ExcelFetchSingleData("C:\\selenium30\\excel.xlsx");
	System.out.println(url);
	System.out.println(pwd);
	System.out.println(un);
	System.out.println(data);
}
	
	
}


