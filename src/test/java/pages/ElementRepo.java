package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementRepo {
	

	// 1. Login User name
	@FindBy(name = "username")

	private WebElement username;

	public ElementRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement Loginusername() {
		{
			return username;
		}
	}

	// 2.Login password
	@FindBy(name = "password")

	private WebElement password;

	public WebElement LoginPassword() {
		{
			return password;
		}
	}
	
	// 3, Login button
		@FindBy(xpath = "//button[@type='submit']")

		private WebElement loginbutton;

		public WebElement LoginButton() {
			{
				return loginbutton;
			}
		}
		
		// 4. Error message
				@FindBy(xpath = "//p[.='Invalid credentials']")

				private WebElement errormsg;

				public WebElement ErroeMsg() {
					{
						return errormsg;
					}
				}
}
