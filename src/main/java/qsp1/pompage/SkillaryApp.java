package qsp1.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryApp {

	@FindBy(xpath=" //a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement app;
	
	public SkillaryApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	public void gearsbtn() {
		gearsbtn.click();
		}
	public void demoappbtn() {
		app.click();
	}
}
