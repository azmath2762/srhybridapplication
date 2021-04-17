package qsp1.TestScripts;

import org.testng.annotations.Test;

import qsp1.genericlib.BaseClass;
import qsp1.pompage.AddToCart;
import qsp1.pompage.Login;

public class AddingToCart extends BaseClass {
	@Test
	public void tc1() {
		Login l = new Login(driver);
		q.mouseAction(driver,l.getCourseid());
		l.seleniumtraningbtn();
		
		
		AddToCart a = new AddToCart(driver);
		q.doubleClick(driver,l.getCourseid());
		a.addbutton();
		q.alertpopup(driver);
		a.addtocart();
		a.catrbtn();
	}
	
}	
    
