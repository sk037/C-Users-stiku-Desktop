package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Model.AppsnGames;


public class TestAppsnGames extends Base
{
	AppsnGames ang;

	/*TestAppsnGames() throws IOException, InterruptedException 
	{
		super();
		// TODO 
	//Auto-generated constructor stub
	} */
  
	@BeforeTest
	public void setUp() throws Exception
	{
		Initialization(0);
		ang=new AppsnGames();
	}
	
	/*@Test(priority = 1)
	public void CreateDevAccount() throws InterruptedException, AWTException
	{
		WebElement link=ang.link1;
		Actions newtab=new Actions(driver);
		//Thread.sleep(400);
        newtab.contextClick(link).build().perform();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        //Thread.sleep(400);
        r.keyPress(KeyEvent.VK_ENTER);
        
        System.out.println("New tab opened");
        //Thread.sleep(400);
        
        Set<String> window=driver.getWindowHandles();
        Iterator<String> iter=window.iterator();
        String firsttab=iter.next();
        String nexttab=iter.next();
        
  
       // Thread.sleep(500);
        driver.switchTo().window(nexttab);
        
        String pageTitle=driver.getTitle();
        System.out.println("Page title = "+driver.getTitle());
        Assert.assertEquals(pageTitle, "Amazon Developer Sign-In");
        //Thread.sleep(1000);
        driver.close();
        //Thread.sleep(1000);
        driver.switchTo().window(firsttab);
       // driver.close();
	}
	
	@Test
	public void HowToStartBuildingFireTVApp() throws InterruptedException, AWTException
	{
		WebElement link=ang.link2;
		Actions newtab=new Actions(driver);
		//Thread.sleep(400);
        newtab.contextClick(link).build().perform();
        //Thread.sleep(400);

        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
       // Thread.sleep(400);
        r.keyPress(KeyEvent.VK_ENTER);
        
        System.out.println("New tab opened");
       // Thread.sleep(1000);
        Set<String> window=driver.getWindowHandles();
        Iterator<String> iter=window.iterator();
        String firsttab=iter.next();
        Thread.sleep(2000);
        String nexttab=iter.next();
        driver.switchTo().window(nexttab);
       // Thread.sleep(500);
        String pageTitle=driver.getTitle();
        System.out.println("Page title = " +driver.getTitle());
        Assert.assertEquals(pageTitle, "Getting Started Developing Apps and Games for Fire TV | Amazon Fire TV");
        //Thread.sleep(1000);
        driver.close();
        //Thread.sleep(1000);
        driver.switchTo().window(firsttab);
        //driver.close();
	}

	
	@Test
	public void TestYourAndroidAPKforCompatibilityWithAmazon() throws InterruptedException, AWTException
	{
		WebElement element=ang.link3;
		Actions action=new Actions(driver);
		//Thread.sleep(400);
		//WebElement element=driver.findElement(By.xpath("//div[contains(text(),'Test your Android APK for compatibility with Amazo')]"));
		//Thread.sleep(400);
		action.contextClick(element).build().perform();
		//Thread.sleep(400);
	    Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        //Thread.sleep(600);
        r.keyPress(KeyEvent.VK_ENTER);
        System.out.println("New tab opened");
       // Thread.sleep(1000);	
		
		Set<String> window=driver.getWindowHandles();
        Iterator<String> iter=window.iterator();
        String firsttab=iter.next();
        //Thread.sleep(2000);
        String nexttab=iter.next();
        driver.switchTo().window(nexttab);
       // Thread.sleep(400);
        String pageTitle=driver.getTitle();
        System.out.println("Page title = " +driver.getTitle());
        Assert.assertEquals(pageTitle, "App Testing Service | Mobile App Testing | Amazon Developer Portal");
       // Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(firsttab);
       // Thread.sleep(400);	
       // driver.close();
	} */
	
//	@Test(priority=1)
//	void pageHeading()
//	{
//		//WebElement ph=driver.findElement(By.xpath("//h2[@class='hero-no-cta-title']"));
//		WebElement pagetitle=ang.pagetitle;
//		String pagehead = pagetitle.getText();
//		System.out.println("Page Header =  "+pagehead);
//		Assert.assertEquals(pagehead, "Why developers are choosing Amazon Appstore");
//		//driver.close();
//	}
//	
//	@Test(priority=3)
//	void AmazonDeveloperBlog()
//	{
//		String blog=ang.AmazonDeveloperBlog.getAttribute("href");
//		System.out.println(blog);
//		Assert.assertEquals("https://developer.integ.amazon.com/blogs/appstore/", blog);
//	}
//	
//	@Test(priority=4)
//	void TechnicalDocumentation()
//	{
//		String doc=ang.TechnicalDocumentation.getAttribute("href");
//		System.out.println(doc);
//		Assert.assertEquals("https://developer.integ.amazon.com/documentation", doc);
//	}
//	
//	@Test(priority=5)
//	void GameMakerTutorials()
//	{
//		String tutorials=ang.GameMakerTutorials.getAttribute("href");
//		System.out.println(tutorials);
//		Assert.assertEquals("https://developer.integ.amazon.com/docs/gamemaker/overview.html", tutorials);
//	}
//	
//	@Test(priority=2)
//	void Resources()
//	{
//		String res=ang.Resources.getText();
//		System.out.println(res);
//		Assert.assertEquals("Resources", res);
//	}
//	
//	@Test(priority=6)
//	void TestingTools()
//	{
//		String Tes=ang.TestingTools.getText();
//		System.out.println(Tes);
//		Assert.assertEquals("Testing Tools", Tes);
//	}
//	
//	@Test(priority=7)
//	void AppTestingTools()
//	{
//		String ATT=ang.AppTestingTools.getAttribute("href");
//		System.out.println(ATT);
//		Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games/test", ATT);
//	}
//	
//	@Test(priority=8)
//	void AppTestingService()
//	{
//		String ATS=ang.AppTestingService.getAttribute("href");
//		System.out.println(ATS);
//		Assert.assertEquals("https://developer.integ.amazon.com/app-testing-service/tya/dashboard.html", ATS);
//	}
//	
//	@Test(priority=9)
//	void LiveAppTesting()
//	{
//		String LAT=ang.LiveAppTesting.getAttribute("href");
//		System.out.println(LAT);
//		Assert.assertEquals("https://developer.integ.amazon.com/docs/app-testing/live-app-testing-getting-started.html", LAT);
//	}
//	
//	@Test(priority=10)
//	void AmazonWebAppTester()
//	{
//		String LWAT=ang.AmazonWebAppTester.getAttribute("href");
//		System.out.println(LWAT);
//		Assert.assertEquals("https://developer.integ.amazon.com/docs/html5-web-apps/webapp-app-tester.html", LWAT);
//	}
//	
//	@Test(priority=11)
//	void ServicesAPIs()
//	{
//		String SA=ang.ServicesAPIs.getAttribute("href");
//		System.out.println(SA);
//		Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games/services-and-apis", SA);
//	}
//	
//	@Test(priority=12)
//	void AmazonMoments()
//	{
//		String AM=ang.AmazonMoments.getAttribute("href");
//		System.out.println(AM);
//		Assert.assertEquals("https://developer.integ.amazon.com/moments", AM);
//	}
//	
//	@Test(priority=13)
//	void LoginwithAmazon()
//	{
//		String LWA=ang.LoginwithAmazon.getAttribute("href");
//		System.out.println(LWA);
//		Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games/login-with-amazon", LWA);
//	}
//	
//	@Test(priority=14)
//	void InAppPurchasing()
//	{
//		String iap=ang.InAppPurchasing.getAttribute("href");
//		System.out.println(iap);
//		Assert.assertEquals("https://developer.integ.amazon.com/docs/in-app-purchasing/iap-overview.html", iap);
//	}
//	
//	@Test(priority=15)
//	void MobileAds()
//	{
//		String MA=ang.MobileAds.getAttribute("href");
//		System.out.println(MA);
//		Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games/mobile-ads", MA);
//	}
//	
//	@Test(priority=16)
//	void AppSubmissionAPI()
//	{
//		String ASA=ang.AppSubmissionAPI.getAttribute("href");
//		System.out.println(ASA);
//		Assert.assertEquals("https://developer.integ.amazon.com/docs/app-submission-api/overview.html", ASA);
//	}
//	
//	@Test(priority=17)
//	void StagedRollouts()
//	{
//		String SR=ang.StagedRollouts.getAttribute("href");
//		System.out.println(SR);
//		Assert.assertEquals("https://developer.integ.amazon.com/docs/app-submission/release-updates-in-staged-rollouts.html", SR);
//	}
//	
//	@Test(priority=18)
//	void DeveloperPromotionsConsole()
//	{
//		String DPC=ang.DeveloperPromotionsConsole.getAttribute("href");
//		System.out.println(DPC);
//		Assert.assertEquals("https://developer.integ.amazon.com/docs/reports-promo/promo-overview.html", DPC);
//	}
//	
//	@Test(priority=19)
//	void AmazonIncentivesAPI()
//	{
//		String AIA=ang.AmazonIncentivesAPI.getAttribute("href");
//		System.out.println(AIA);
//		Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games/incentives-api", AIA);
//	}
//	
//	@Test(priority=20)
//	void DeviceMessaging()
//	{
//		String DM=ang.DeviceMessaging.getAttribute("href");
//		System.out.println(DM);
//		Assert.assertEquals("https://developer.integ.amazon.com/docs/adm/overview.html", DM);
//	}
//	
//	@Test(priority=21)
//	void MerchbyAmazon()
//	{
//		String MBA=ang.MerchbyAmazon.getAttribute("href");
//		System.out.println(MBA);
//		Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games/merch", MBA);
//	}
//	
//	@Test(priority=23)
//	void AmazonGameOn()
//	{
//		String AGO=ang.AmazonGameOn.getAttribute("href");
//		System.out.println(AGO);
//		Assert.assertEquals("https://developer.integ.amazon.com/gameon", AGO);
//	}
//	
//	@Test(priority=24)
//	void Support()
//	{
//		String su=ang.Support.getText();
//		System.out.println(su);
//		Assert.assertEquals("Support", su);
//	}
//	
//	@Test(priority=25)
//	void AmazonDeveloperSupport()
//	{
//		String ads=ang.AmazonDeveloperSupport.getAttribute("href");
//		System.out.println(ads);
//		Assert.assertEquals("https://developer.integ.amazon.com/support", ads);
//	}
//	
//	@Test(priority=26)
//	void FAQs()
//	{
//		String faq=ang.FAQs.getAttribute("href");
//		System.out.println(faq);
//		Assert.assertEquals("https://developer.integ.amazon.com/docs/app-submission/faq-landing.html", faq);
//	}
//	
//	@Test(priority=27)
//	void AmazonDeveloperForums()
//	{
//		String forums=ang.AmazonDeveloperForums.getAttribute("href");
//		System.out.println(forums);
//		Assert.assertEquals("https://forums.developer.amazon.com/", forums);
//	}
//	
//	@Test(priority=28)
//	void ContactUs()
//	{
//		String contact=ang.ContactUs.getAttribute("href");
//		System.out.println(contact);
//		Assert.assertEquals("https://developer.integ.amazon.com/support/contact-us", contact);
//	}
//	
//	@Test(priority=29)
//	void Legal()
//	{
//		String legal=ang.Legal.getText();
//		System.out.println(legal);
//		Assert.assertEquals("Legal", legal);
//	}
//	
//	@Test(priority=30)
//	void TermsAgreements()
//	{
//		String terms=ang.TermsAgreements.getAttribute("href");
//		System.out.println(terms);
//		Assert.assertEquals("https://developer.integ.amazon.com/terms-and-agreements", terms);
//	}
//	
//	@Test(priority=31)
//	void Locale()
//	{
//		//ang.language.click();
//		//Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games", ang.Englishlocale.getAttribute("href"));
//		Assert.assertEquals("https://developer.integ.amazon.com/zh/apps-and-games", ang.Chinalocale.getAttribute("href"));
//		Assert.assertEquals("https://developer.integ.amazon.com/ja/apps-and-games", ang.Jplocale.getAttribute("href"));
//	}
//	
//	@Test(priority=32)
//	void Followus() throws AWTException, InterruptedException
//	{ 
//		System.out.println(ang.Followus.getText());
//		System.out.println(ang.Facebookicon.getAttribute("href"));
//		System.out.println(ang.Twittericon.getAttribute("href"));
//		System.out.println(ang.Blog.getAttribute("href"));
//		
//		Assert.assertEquals("Follow Us:", ang.Followus.getText());
//		Assert.assertEquals("https://www.facebook.com/AmazonAppDev", ang.Facebookicon.getAttribute("href"));
//		Assert.assertEquals("https://www.twitter.com/AmazonAppDev", ang.Twittericon.getAttribute("href"));
//		Assert.assertEquals("https://developer.integ.amazon.com/public/community/blog", ang.Blog.getAttribute("href"));
//	}
	
	@Test(priority=33)
	void Footer() throws InterruptedException, AWTException
	{
		//ang.Footer1.click();
		// ang.Footer1.getScreenshotAs(target)
		 System.out.println(ang.Footer1.getAttribute("href"));
		 //System.out.println(ang.Footer2.getText());
		 System.out.println(ang.Footer3.getAttribute("href"));
		 System.out.println(ang.Footer4.getAttribute("href"));
		 System.out.println(ang.Footer5.getAttribute("href"));
		 System.out.println(ang.Copyright.getText());
		 
		 Actions action=new Actions(driver);
		 action.contextClick(ang.Footer2).build().perform();
		 
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(400);
		 r.keyPress(KeyEvent.VK_ENTER);
		 
		 Set<String> window=driver.getWindowHandles();
		 Iterator<String> Iter=window.iterator();
		 String parent=Iter.next();
		 String child=Iter.next();
		 Thread.sleep(400);
		
		 String appsngamesurl=driver.switchTo().window(child).getCurrentUrl();
		 System.out.println(appsngamesurl);
		 Thread.sleep(400);
		 driver.close();
		 driver.switchTo().window(parent);
		// driver.close();

	    Assert.assertEquals("https://developer.integ.amazon.com/alexa",ang.Footer1.getAttribute("href"));
		Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games", appsngamesurl);
		Assert.assertEquals("https://aws.amazon.com/", ang.Footer3.getAttribute("href"));
		Assert.assertEquals("https://developer.amazon.com/dash-services", ang.Footer4.getAttribute("href"));
		Assert.assertEquals("https://developer.amazon.com/mac-pc", ang.Footer5.getAttribute("href"));
		Assert.assertEquals("© 2010-2019, Amazon.com, Inc. or its affiliates. All Rights Reserved.", ang.Copyright.getText());
	}
	
//	@Test(priority=34)
//	void BackToTop()
//	{
//		Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games#", ang.BackToTop.getAttribute("href"));
//	}
//	
//	@Test(priority=35)
//	void Appstoreicon() throws AWTException, InterruptedException
//	{
////		 Actions action=new Actions(driver);
////		 action.contextClick(ang.Headericon).build().perform();
////		 
////		 Robot r=new Robot();
////		 r.keyPress(KeyEvent.VK_DOWN);
////		 Thread.sleep(400);
////		 r.keyPress(KeyEvent.VK_ENTER);
////		 
////		 Set<String> window=driver.getWindowHandles();
////		 Iterator<String> Iter=window.iterator();
////		 String parent=Iter.next();
////		 String child=Iter.next();
////		 Thread.sleep(400);
////		
////		 String iconurl=driver.switchTo().window(child).getCurrentUrl();
////		 driver.close();
////		 System.out.println(iconurl);
////		 Thread.sleep(400);
////		 driver.switchTo().window(parent);
////		 Thread.sleep(2000);
//
//		Assert.assertTrue(ang.Headericon.isDisplayed());
//
//	}
//	
//	@Test(priority=36)
//	void Device() throws AWTException, InterruptedException
//	{
//	 
//	 Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games/devices", ang.Devices.getAttribute("href"));
//	 
//	}
//    @Test(priority=37)
//	void ServicesApis() throws AWTException, InterruptedException
//	{
//		 Actions action1=new Actions(driver);
//		 action1.contextClick(ang.ServiceandApis).build().perform();
//		 
//		 Robot r1=new Robot();
//		 r1.keyPress(KeyEvent.VK_DOWN);
//		 Thread.sleep(400);
//		 r1.keyPress(KeyEvent.VK_ENTER);
//		 
//		 Set<String> window1=driver.getWindowHandles();
//		 Iterator<String> Iter1=window1.iterator();
//		 String parent1=Iter1.next();
//		 String child1=Iter1.next();
//		 Thread.sleep(400);
//		
//		 String SerApisurl=driver.switchTo().window(child1).getCurrentUrl();
//		 driver.close();
//		 System.out.println(SerApisurl);
//		 Thread.sleep(400);
//		 driver.switchTo().window(parent1);
//		 
//		 Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games/services-and-apis", SerApisurl);
//	}
//	
//	@Test(priority=38)
//	void Test() throws AWTException, InterruptedException
//	{
//		 Actions action2=new Actions(driver);
//		 action2.contextClick(ang.Test).build().perform();
//		 
//		 Robot r2=new Robot();
//		 r2.keyPress(KeyEvent.VK_DOWN);
//		 Thread.sleep(400);
//		 r2.keyPress(KeyEvent.VK_ENTER);
//		 
//		 Set<String> window2=driver.getWindowHandles();
//		 Iterator<String> Iter2=window2.iterator();
//		 String parent2=Iter2.next();
//		// Thread.sleep(1000);
//		 String child2=Iter2.next();
//
//		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		 String Testurl=driver.switchTo().window(child2).getCurrentUrl();
//		 driver.close();
//		 System.out.println(Testurl);
//		 Thread.sleep(400);
//		 driver.switchTo().window(parent2);
//		 
//		 Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games/test", Testurl);
//	}
//	
//	@Test(priority=39)
//	void SubmitSDKdownload() throws AWTException, InterruptedException
//	{
//	 Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games/app-submission", ang.Sumbit.getAttribute("href"));
//	 Assert.assertEquals("https://developer.integ.amazon.com/apps-and-games/sdk-download", ang.SDKDownload.getAttribute("href"));
//	 
//	}
//	
//	@Test(priority=40)
//	void Docs() throws AWTException, InterruptedException
//	{
//		 Actions action3=new Actions(driver);
//		 action3.contextClick(ang.Docs).build().perform();
//		 
//		 Robot r3=new Robot();
//		 r3.keyPress(KeyEvent.VK_DOWN);
//		 Thread.sleep(400);
//		 r3.keyPress(KeyEvent.VK_ENTER);
//		 
//		 Set<String> window3=driver.getWindowHandles();
//		 Iterator<String> Iter3=window3.iterator();
//		 String parent3=Iter3.next();
//		 //Thread.sleep(1000);
//		 String child3=Iter3.next();
//
//		 //Thread.sleep(1000);
//		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		 String Docsurl=driver.switchTo().window(child3).getCurrentUrl();
//		 driver.close();
//		 System.out.println(Docsurl);
//		 Thread.sleep(400);
//		 driver.switchTo().window(parent3);
//		 
//		 Assert.assertEquals("https://developer.integ.amazon.com/documentation", Docsurl);
//	}
//	
//	@Test(priority=41)
//	void Devconsole() throws AWTException, InterruptedException
//	{
//        System.out.println(ang.DevConsole.getText());
//		Assert.assertTrue(ang.DevConsole.isDisplayed());
//	}
//	
//	@Test(priority=42)
//	void Signin() throws AWTException, InterruptedException
//	{
//		System.out.println(ang.Signin.getText()); 
//		Assert.assertTrue(ang.Signin.isDisplayed());
//	}
//	
//	@Test(priority=43)
//	void Flyout()
//	{
//		System.out.println(ang.Flyout.getText());
//		Assert.assertTrue(ang.Flyout.isDisplayed());
//	}
//	
//	@Test(priority=44)
//	void Search()
//	{
//		System.out.println(ang.Search.getText());
//		Assert.assertTrue(ang.Search.isDisplayed());
//	}
//	
   @AfterTest
	void teardown()
	{
		driver.quit();
	}
	
}
