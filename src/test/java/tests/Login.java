package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.ElementRepo;
import utils.Baseclass;
import utils.ExcelUtils;

public class Login extends Baseclass {
	
	@DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        ExcelUtils excel = new ExcelUtils("./src/test/resources/DemoOrrangeTestData.xlsx", "LoginData");
        int rowCount = excel.getRowCount();
        Object[][] data = new Object[rowCount - 1][2]; // Adjust for header row

        for (int i = 1; i < rowCount; i++) {
            data[i - 1][0] = excel.getCellData(i, 0); // Username
            data[i - 1][1] = excel.getCellData(i, 1); // Password
        }
        return data;
    }
	
	@Test(dataProvider = "loginData")
    public void validateLogin(String username, String password) {
        // Enter username and password
		ElementRepo repo = new ElementRepo(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		repo.Loginusername().sendKeys(username);
		repo.LoginPassword().sendKeys(password);
		repo.LoginButton().click();

        // Validation
        String expectedError = "Invalid credentials";
        if (!username.equals("Admin") || !password.equals("admin123")) {
            Assert.assertEquals(repo.ErroeMsg().getText(), expectedError, "Error message mismatch!");
        } else {
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login failed for valid credentials!");
        }

        // Reset for the next test
        driver.navigate().refresh();
    }
}
