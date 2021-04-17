package qsp1.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement AddToCartbtn;
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	private WebElement cart;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	private WebElement GotoCart;
	
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver,this);	
		}
		public WebElement getAddbtn() {
		return addbtn;
		}
		public void addbutton() {
			addbtn.click();
		}
		public void addtocart() {
			AddToCartbtn.click();
		}
		
		public void catrbtn() {
			cart.click();
		}
		public void gtc() {
			GotoCart.click();
		}
		
	
}
