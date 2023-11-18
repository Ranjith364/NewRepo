package Login;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class Login_Test  extends BaseClass {
	
	@Test
	public void loginToDemoshop() {
		login1.getLink().click();
		login1.getEmail().sendKeys("ranjith123@gmail.com");
		login1.getPassword().sendKeys("1232343");
		login1.getLoginbutton().click();
	}
}
