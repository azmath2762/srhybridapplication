package qsp1.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage {
	@FindBy(xpath="//button[text()='LIKE']")
	private WebElement like;
	
	public FaceBookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void fbtn() {
		like.click();
	}

}
