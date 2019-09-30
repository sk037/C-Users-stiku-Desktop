package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class B
{
    @BeforeMethod
	public static void setup() 
    {
		
	
//	System.setProperty("webdriver.gecko.driver", "C:\\Software\\geckodriver.exe");
//	WebDriver driver=new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
    	
    WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://developer.amazon.com/");
    }
    
    @Test
    public static void test()
    {
    	System.out.println("a");
    }
}