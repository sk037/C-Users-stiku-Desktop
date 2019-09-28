package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestScript.BaseTest;
//import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchAndAddToCart extends BaseTest
{
 
	@FindBy(id="com.ebay.mobile:id/search_box")
	public WebElement search;

	@FindBy(id="com.ebay.mobile:id/search_src_text")
	public WebElement searchedText;
	
	@FindBy(xpath="//*[@resource-id='com.ebay.mobile:id/cell_collection_item'][2]")
	public WebElement selectedItem;
	
	@FindBy(xpath="(//*[@content-desc=\"Add to search query\"])[10]")
	public WebElement srchBtn;
	
	@FindBy(xpath="//*[@resource-id=\"com.ebay.mobile:id/textview_item_name\"]")
	public WebElement tvName;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id=\"com.ebay.mobile:id/textview_item_price\"]")
	public WebElement price;
	
	@FindBy(xpath= "//*[@resource-id=\"com.ebay.mobile:id/description_snippet_textview\"]")
	public WebElement description;

	@FindBy(id ="com.ebay.mobile:id/button_add_to_cart")
	public WebElement addToCartbtn;
	
	@FindBy(xpath="//*[@text=\"VIEW IN CART\"]")
	public WebElement viewInCart;
	
	@FindBy(id = "com.ebay.mobile:id/action_view_icon")
	public WebElement addToCarticon;
	
	@FindBy(xpath= "//*[@text=\"Shopping cart\"]")
	public WebElement shoppingCart;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView\r\n" + 
			"")
	public WebElement cartProductName;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView\r\n" + 
			"")
	public WebElement cartProductPrice;
	
	@FindBy(xpath="//*[@text=\"SAVE\"]")
	public WebElement saveIcon;
	
	@FindBy(xpath="//*[@text=\"BUY IT NOW\"]")
	public WebElement buyItNowbtn;
	
	public SearchAndAddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}

