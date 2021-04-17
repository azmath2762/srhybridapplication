package qsp1.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {

	@FindBy(xpath="//i[@class='fa fa-facebook']")
	private WebElement fb;
	
	public Testing(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void fbtn() {
		fb.click();
	}
}
