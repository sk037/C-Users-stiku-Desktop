package TestScript;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.SearchAndAddToCart;
import io.appium.java_client.LocksDevice;
import io.appium.java_client.android.AndroidDriver;

public class TestSearchAndAddToCart extends BaseTest
{
	SearchAndAddToCart s1;
	
	@Test
	public void ScreenOrientation()
	{
		((LocksDevice) driver).lockDevice();
		((LocksDevice) driver).unlockDevice();
		driver.rotate(ScreenOrientation.LANDSCAPE);

		driver.rotate(ScreenOrientation.PORTRAIT);
	}
	
    @Test(priority=1)
    public void Search01() throws InterruptedException
    {
	   s1=new SearchAndAddToCart(driver);
	   WebElement we=s1.search;
	   WebDriverWait wait=new WebDriverWait(driver, 30);
	   wait.until(ExpectedConditions.visibilityOf(we));
	   //tapping on search text box
       we.click();
	   System.out.println("clicked");
	   //Asserting the search text box
	   Assert.assertTrue(s1.searchedText.isDisplayed());
    }
    
    @Test(priority=2)
    public void SearchText02() throws InterruptedException
    {
    	WebElement we2=s1.searchedText;
    	//Searching for 65-inch TV
    	we2.sendKeys("65-inch TV");
    	WebElement searchButton=s1.srchBtn;
    	searchButton.click();
    	//Verifying the resultant screen once search option from soft keyboard in pressed
    	Assert.assertTrue(s1.saveIcon.isDisplayed());
    }
    
   @Test(priority=3)
    public void SelectProduct03()
    {
    	WebElement item=s1.selectedItem;
    	WebDriverWait wait=new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.visibilityOf(item));
    	//Selecting TV from the list of options
    	item.click();
    	//Verifying user should be redirected to "buy it now" interface.
    	Assert.assertTrue(s1.buyItNowbtn.isDisplayed());
    }
   
    @Test(priority=4)
    public void ItemDetails04()
    {
    	//Item name is fetched
    	WebElement name =s1.tvName;
    	WebDriverWait wait1=new WebDriverWait(driver, 40);
    	wait1.until(ExpectedConditions.visibilityOf(name));
    	System.out.println(name.getText());
    	
    	//Item cost is fetched
    	WebElement productPrice =s1.price;
    	WebDriverWait wait2=new WebDriverWait(driver, 40);
    	wait2.until(ExpectedConditions.visibilityOf(productPrice));
    	System.out.println(productPrice.getText());

    	//Scroll and fetch the Item description
    	String automatorString1 = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""
    				+ "ITEM DESCRIPTION" + "\"));";
        ((AndroidDriver) driver).findElementByAndroidUIAutomator(automatorString1);

        WebElement productDescpt =s1.description;
    	WebDriverWait wait3=new WebDriverWait(driver, 40);
    	wait3.until(ExpectedConditions.visibilityOf(productDescpt));
    	System.out.println(productDescpt.getText());
    	//Verifying user should remain in "buy it now" interface.
        Assert.assertTrue(s1.buyItNowbtn.isDisplayed());
    }

   @Test(priority=5)
   public void AddToCart05() throws InterruptedException
    {
	   // Scroll to ADD TO CART button
	    String automatorString = "new UiScrollable(new UiSelector().resourceId(\"\"com.ebay.mobile:id/persistent_buttons_container\"" + 
    	        "\")).scrollIntoView(new UiSelector().text(\"ADD TO CART\"));";
	    ((AndroidDriver) driver).findElementByAndroidUIAutomator(automatorString);
    	
	    //Click on addtocart button
    	WebElement button=s1.addToCartbtn;
    	button.click();
    	
        //Click on viewincart button once it gets visible
    	WebElement a=s1.viewInCart;
    	WebDriverWait wait=new WebDriverWait(driver, 40);
    	wait.until(ExpectedConditions.visibilityOf(a));
        a.click();
        //Verify user should be redirected to Shopping Cart on clicking viewincart button 
        Assert.assertEquals("Shopping cart", s1.shoppingCart.getText());
     }
  
  @Test(priority=6)
  void VerifyItemName06()
  {
	  //Shopping cart's Item name is fetched and compared selected item name 
      WebElement cpn=s1.cartProductName;
	  WebDriverWait wait=new WebDriverWait(driver, 40);
  	  wait.until(ExpectedConditions.visibilityOf(cpn));
  	 // System.out.println(cpn.getText());
	  Assert.assertEquals("SEALOC LAN-LG6S-65 65 inch 4K UHD LANAI Weather Resistant LG 6-Series smart TV", cpn.getText());
  }
  
  @Test(priority=7)
  void VerifyProductCost07()
  {
	  //Shopping cart's Item cost is fetched and compared selected item cost
	  WebElement cpp=s1.cartProductPrice;
	  WebDriverWait wait1=new WebDriverWait(driver, 40);
  	  wait1.until(ExpectedConditions.visibilityOf(cpp));
  	  // System.out.println(cpp.getText());
	  Assert.assertEquals("$3,399.00",cpp.getText()); 
	  
	  String a="US$ 3399";
	  String[] b=a.split(" ");
	  String[] c= {"0","1189"};
	  String d=c[1]+b[1];
	  Integer [] a1 = new Integer[2];
	  a1[1]= Integer.parseInt(b[1]);   
	  Integer [] e1 = new Integer[2];
	  e1[1]= Integer.parseInt(c[1]);
	  Integer [] sum = new Integer[2];
	  sum[1]=a1[1]+e1[1];
	  //Final payable Amount including shipping charge 
      System.out.println("Final Amount "+"="+ " US$ " + sum[1] + ".78");
	  
  }
 
}

