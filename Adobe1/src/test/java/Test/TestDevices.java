package Test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Model.Devices;


public class TestDevices extends Base
{
	Devices dvc;
	
	public TestDevices() throws IOException, InterruptedException 
	{
		super();
		// TODO 
	//Auto-generated constructor stub
	}
	@BeforeMethod
	public void setUp() throws Exception
	{
		Initialization(1);
		dvc=new Devices();
	}
	
	@Test
	public void Whatsnewtab01() throws InterruptedException, AWTException
	{
      WebElement Whatsnw=dvc.tab1;
      //Thread.sleep(600);
      Whatsnw.click();
      //Thread.sleep(400);
      WebElement textverf01=dvc.text1;

      String text=textverf01.getText();
      System.out.println("Tab Name ="+text);
     // Thread.sleep(200);
      Assert.assertEquals(text, "What's new with Amazon devices");
      driver.close();
	}
	
	@Test
	public void AmazonFTVtab02() throws InterruptedException, AWTException
	{
      WebElement amzftv=dvc.tab2;
     // Thread.sleep(400);
      amzftv.click();
     // Thread.sleep(2000);
      System.out.println("option clicked");
//      JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("window.scrollBy(0,700)");

//      System.out.println("hey");
      WebElement textverf02=dvc.text2;
      String text=textverf02.getText();
      System.out.println("Tab Name ="+text);
     // Thread.sleep(1000);
      Assert.assertEquals(text, "Develop for voice on Fire TV");
      driver.close();
	}
	@Test
	public void Firetabletstab03() throws InterruptedException, AWTException
	{
      WebElement firetablet=dvc.tab3;
     // Thread.sleep(600);
      firetablet.click();
    //  Thread.sleep(400);
      WebElement textverf03=dvc.text3;
      String text=textverf03.getText();
      System.out.println("Tab Name ="+text);      
     // Thread.sleep(1000);
      Assert.assertEquals(text, "Fire tablets");
      driver.close();
	}
	@Test
	public void TesturandroidAPKtab04() throws InterruptedException, AWTException
	{ 
      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement androidapk=dvc.apkbutton;
      //Thread.sleep(600);
      androidapk.click();
     // Thread.sleep(400);
      WebElement textverf04=dvc.text4;
    //  Thread.sleep(200);
      String text=textverf04.getText();
      System.out.println("Button Name ="+text);      
     // Thread.sleep(1000);
      Assert.assertEquals(text, "Test your app");
      driver.close();
	}
	
}
