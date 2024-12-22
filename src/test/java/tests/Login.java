package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.ElementRepo;
import utils.Baseclass;

public class Login extends Baseclass {
	
	@Test
	
	public static void LoginTest() {
		
		ElementRepo repo = new ElementRepo(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		repo.Loginusername().sendKeys("Admin");
		repo.LoginPassword().sendKeys("admin123");
		repo.LoginButton().click();
		
		
	}
}
