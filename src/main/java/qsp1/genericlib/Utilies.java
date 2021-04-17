package qsp1.genericlib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilies {
	
	public void dropDown(WebElement ele,String text ) {
		Select s  = new Select(ele);
		s.selectByVisibleText(text);
	}
	/**
	 * 
	 * @param driver
	 * @param ele
	 */
	public void mouseAction(WebDriver driver,WebElement ele) {
		Actions a =  new Actions(driver);
		a.moveToElement(ele).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param target
	 */
	public void doubleClick(WebDriver driver,WebElement target) {
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param X
	 * @param Y
	 */
	public void scrollBar(WebElement driver,int X,int Y) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+X+","+Y+")");
	}
	/**
	 * 
	 * @param driver
	 */
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/*
	 * 
	 */
	public void elementToBeCLicked(WebDriver driver,WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void switchingtab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}

}
