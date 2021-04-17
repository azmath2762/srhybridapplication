package qsp1.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(id="course")
	private WebElement courseid;
	
	public WebElement getCourseid() {
		return courseid;
	}
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraning ; 
	
	@FindBy(xpath="//select[@class='chosen-select']")
	private WebElement course;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void seleniumtraningbtn() {
		seleniumtraning.click();
	}
	public void dropDown() {
		course.click();
	}
	public WebElement getCourse() {
		return course;
	}
}
