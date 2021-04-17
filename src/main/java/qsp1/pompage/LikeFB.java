package qsp1.pompage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import qsp1.genericlib.BaseClass;

public class LikeFB extends BaseClass {
	@Test
	public void tc2() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		Login l = new Login(driver);
		q.dropDown(l.getCourse(),p.getPropertyData("data"));
		
		Testing t = new Testing(driver);
		t.fbtn();
		
		FaceBookPage f = new FaceBookPage(driver);
		f.fbtn();
				
	}

}
