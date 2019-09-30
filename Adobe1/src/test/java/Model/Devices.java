package Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Base;


public class Devices extends Base
{
 @FindBy(xpath="//a[contains(text(),\"What's New\")]")
public
 WebElement tab1;
 
 @FindBy(xpath="//h2[contains(text(),\"What's new with Amazon devices\")]")
 public WebElement text1;
 
 @FindBy(xpath="//a[contains(text(),'Amazon Fire TV')]")
 public WebElement tab2;
 
 @FindBy(xpath="//div[contains(text(),'Develop for voice on Fire TV')]")
 public WebElement text2;
 
 @FindBy(xpath="//a[contains(text(),'Fire Tablets')]")
 public WebElement tab3;
 
 @FindBy(xpath="//h2[contains(text(),'Fire tablets')]")
 public WebElement text3;
 
 @FindBy(xpath="//span[contains(text(),'Test Your Android APK')]")
 public WebElement apkbutton;
 
 @FindBy(xpath="//h3[contains(text(),'Test your app')]")
 public WebElement text4;
 
 public Devices()
 {
	PageFactory.initElements(driver, this); 
 }
}
