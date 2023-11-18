package Register;

import org.testng.annotations.Test;
import GenericUtilities.BaseClass;

public class Register_Test  extends BaseClass{
	
	@Test
	public void RegisterToDemoWebshop() {
		regpage.getRegisterlink().click();
		regpage.getGender().click();
		regpage.getFirstname().sendKeys("gandala");
		regpage.getLastname().sendKeys("ranith");
		regpage.getEmail().sendKeys("gandalaranjith36@gmail.com");
		regpage.getPassword().sendKeys("ranf333");
		regpage.getConfirmpassword().sendKeys("ranf333");
		regpage.getRegisterbutton().click();
	}
}
