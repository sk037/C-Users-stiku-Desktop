package Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;

import Test.Base;


public class AppsnGames extends Base
{
    @FindBy(xpath="//h2[contains(text(),'Why developers are choosing Amazon Appstore')]")
	public
    WebElement pagetitle;
	
	@FindBy(xpath="//div[@class='mt-extra-large mb-extra-large']//a[@class='cta-button d-inline-flex align-items-center justify-content-center cta-blue'][contains(text(),'Create Your Free Developer Account')]")
	public WebElement link1;
	
	@FindBy(xpath="//a[contains(text(),'How to Start Building a Fire TV App')]")
	public
	WebElement link2;
	
	@FindBy(xpath="//a[contains(text(),'Test Your Android APK for Compatibility with Amazo')]")
	public
	WebElement link3;
	
	@FindBy(xpath="//img[@src='https://m.media-amazon.com/images/G/01/appstore/devportal/ebooks/GameDesign_200x200._CB464638577_.png']")
	WebElement downloadabledoc1;
	
	@FindBy(xpath="//img[@src='https://m.media-amazon.com/images/G/01/appstore/devportal/ebooks/Book_200x200._CB464638528_.png']")
	WebElement downloadabledoc2;
	
	// Footers of /apps-and-games prelogin
	
	//Resources
	@FindBy(xpath="//h3[contains(text(),'Resources')]")
	public WebElement Resources;
	
	@FindBy(xpath="//a[contains(text(),'Amazon Developer Blog')]")
	public WebElement AmazonDeveloperBlog;
	
	@FindBy(xpath="//a[contains(text(),'Technical Documentation')]")
	public WebElement TechnicalDocumentation;
	
	@FindBy(xpath="//a[contains(text(),'GameMaker Tutorials')]")
	public WebElement GameMakerTutorials;
	
	//Testing Tools
	@FindBy(xpath="//h3[contains(text(),'Testing Tools')]")
	public WebElement TestingTools;
	
	@FindBy(xpath="//a[contains(text(),'App Testing Tools')]")
	public WebElement AppTestingTools;
	
	@FindBy(xpath="//a[contains(text(),'App Testing Service')]")
	public WebElement AppTestingService;
	
	@FindBy(xpath="//a[contains(text(),'Live App Testing')]")
	public WebElement LiveAppTesting;
	
	@FindBy(xpath="//a[contains(text(),'Amazon Web App Tester')]")
	public WebElement AmazonWebAppTester;
	
	//Services & APIs
	@FindBy(xpath="//div[@class='dpfnGroup accrItem']//a[contains(text(),'Services & APIs')]")
	public WebElement ServicesAPIs;
	
	@FindBy(xpath="//a[contains(text(),'Amazon Moments')]")
	public WebElement AmazonMoments;
	
	@FindBy(xpath="//a[contains(text(),'Login with Amazon')]")
	public WebElement LoginwithAmazon;
	
	@FindBy(xpath="//a[contains(text(),'In-App Purchasing')]")
	public WebElement InAppPurchasing;
	
	@FindBy(xpath="//a[contains(text(),'Mobile Ads')]")
	public WebElement MobileAds;
	
	@FindBy(xpath="//a[contains(text(),'App Submission API')]")
	public WebElement AppSubmissionAPI;
	
	@FindBy(xpath="//a[contains(text(),'Staged Rollouts')]")
	public WebElement StagedRollouts;
	
	@FindBy(xpath="//a[contains(text(),'Developer Promotions Console')]")
	public WebElement DeveloperPromotionsConsole;
	
	@FindBy(xpath="//a[contains(text(),'Amazon Incentives API')]")
	public WebElement AmazonIncentivesAPI;
	
	@FindBy(xpath="//a[contains(text(),'Device Messaging')]")
	public WebElement DeviceMessaging;
	
	@FindBy(xpath="//a[contains(text(),'Merch by Amazon')]")
	public WebElement MerchbyAmazon;
	
	@FindBy(xpath="//a[contains(text(),'Amazon GameOn')]")
	public WebElement AmazonGameOn;
	
	//Support
	@FindBy(xpath="//h3[contains(text(),'Support')]")
	public WebElement Support;
	
	@FindBy(xpath="//a[contains(text(),'Amazon Developer Support')]")
	public WebElement AmazonDeveloperSupport;
	
	@FindBy(xpath="//a[contains(text(),'FAQs')]")
	public WebElement FAQs;
	
	@FindBy(xpath="//a[contains(text(),'Amazon Developer Forums')]")
	public WebElement AmazonDeveloperForums;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	public WebElement ContactUs;
	
	//Legal
	@FindBy(xpath="//h3[contains(text(),'Legal')]")
	public WebElement Legal;
	
	@FindBy(xpath="//a[contains(text(),'Terms & Agreements')]")
	public WebElement TermsAgreements;
	
	@FindBy(xpath="//span[@class='dplsCurrent dpsfFlyoutCurrent']")
	public WebElement Englishlocale;
	
	@FindBy(xpath="//a[@data-locale='zh_CN']")
	public WebElement Chinalocale;
	
	@FindBy(xpath="//a[@data-locale='ja_JP']")
	public WebElement Jplocale;
	
	//Social Network
	
	@FindBy(xpath="//*[contains(text(),\"Follow Us:\")]")
	public WebElement Followus;
	
	@FindBy(xpath="//*[@href=\"https://www.facebook.com/AmazonAppDev\"]")
	public WebElement Facebookicon;
	
	@FindBy(xpath="//*[@href=\"https://www.twitter.com/AmazonAppDev\"]")
	public WebElement Twittericon;
	
	@FindBy(xpath="//*[@href=\"/public/community/blog\"]")
	public WebElement Blog;
	
	@FindBy(xpath="//a[@href='/alexa']")
	public WebElement Footer1;
	
	@FindBy(xpath="//*[@alt=\"Amazon Appstore Icon\"]")
	public WebElement Footer2;
	
	@FindBy(xpath="//a[@href=\"https://aws.amazon.com\"]")
	public WebElement Footer3;
	
	@FindBy(xpath="//a[@href=\"https://developer.amazon.com/dash-services\"]")
	public WebElement Footer4;
	
	@FindBy(xpath="//a[@href=\"https://developer.amazon.com/mac-pc\"]")
	public WebElement Footer5;
	
	@FindBy(xpath="//div[@class='dpfCopyright']")
	public WebElement Copyright;
	
	@FindBy(xpath="//*[@href=\"#\"]")
	public WebElement BackToTop;
	
	//header
	
	@FindBy(xpath="//img[@src='https://m.media-amazon.com/images/G/01/mobile-apps/dex/logos/amazonAppstoreLogoDarkBG1x._V516058340_.png']")
	public WebElement Headericon;
	
	@FindBy(xpath="//*[@href=\"/apps-and-games/devices\"]")
	public WebElement Devices;
	
	@FindBy(xpath="//a[@class='dppnLink'][contains(text(),'Services & APIs')]")
	public WebElement ServiceandApis;
	
	@FindBy(xpath="//a[@class='dppnLink'][contains(text(),'Test')]")
	public WebElement Test;
	
	@FindBy(xpath="//*[@href=\"/apps-and-games/app-submission\"]")
	public WebElement Sumbit;
	
	@FindBy(xpath="//*[@href=\"/apps-and-games/sdk-download\"]")
    public WebElement SDKDownload;
	
	@FindBy(xpath="//a[@class='dppnLink'][contains(text(),'Docs')]")
	public WebElement Docs;
	
	@FindBy(xpath="//div[@class='dphRight']//a[contains(text(),'Developer Console')]")
	public WebElement DevConsole;
	
	@FindBy(xpath="//div[@class='dphRight']//a[@class='dphLink'][contains(text(),'Sign In')]")
	public WebElement Signin;
	
	@FindBy(xpath="//div[@id='navFlyout?']")
	public WebElement Flyout;
	
	@FindBy(xpath="//button[@id='searchButton']")
	public WebElement Search;
	
	public AppsnGames()
	{
		PageFactory.initElements(driver,this);
	}
}
