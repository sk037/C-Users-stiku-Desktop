package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityFunctions.TestUtil;

public class Base 
{ 
	public static WebDriver driver;
	public static Properties prop;
//	Main() throws IOException, InterruptedException
//	{
//	try {
//		prop = new Properties();
//		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/Config/config.properties");
//		prop.load(ip);
//	    } catch (FileNotFoundException e) {
//		e.printStackTrace();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//}
	

	public static void Initialization(int i) throws IOException, InterruptedException
	{
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/Config/config.properties");
		prop.load(ip);
		
		String browser=prop.getProperty("Chromebrowser");
//		System.out.println(browser);
//		String url=prop.getProperty("Gamma url");
//		System.out.println(url);
		
		System.getProperty("webdriver.chrome.driver",browser);
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//FileInputStream fis=new FileInputStream("C:\\DRIVE\\MY FOLDER\\Adobe1\\src\\test\\java\\Testdata\\AEM_urls.xlsx");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/java/Testdata/AEM_urls.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		//System.out.println(rowcount+1);
		
		if(i==0)
		{
			
		String a=sheet.getRow(i).getCell(0).toString()	;
		driver.navigate().to("https://developer.integ.amazon.com" + a);
		}
		
		else if(i==1)
		{
			
		String a=sheet.getRow(i).getCell(0).toString()	;
		driver.navigate().to("https://developer.integ.amazon.com" + a);
		}
		
	}
}
