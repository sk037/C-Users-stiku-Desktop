package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import TestScript.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BaseTest
{
  @AndroidFindBy(id="com.ebay.mobile:id/button_sign_in")
  private WebElement Signin;
  
  @AndroidFindBy()
  private WebElement Emailid;


public LoginPage()
{
	PageFactory.initElements(driver, this);
}
}


