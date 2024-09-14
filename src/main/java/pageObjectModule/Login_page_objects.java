package pageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page_objects {
	
	public WebDriver driver;
	private By username=By.name("username");
	private By Password =By.name("password");
	private By login = By.xpath("//button[@type='submit']");
	private By contactInfo = By.cssSelector("a[class='oxd-main-menu-item active toggle']");
	
	public Login_page_objects(WebDriver driver2) {
		this.driver= driver2;
		
	}
	public WebElement enterusername() {
		return driver.findElement(username);
		
	}
	public WebElement enterpassword() {
		return driver.findElement(Password);
		
	}
	public WebElement loginclick() {
		return driver.findElement(login);
		
	}
	public WebElement clickoncontactInfo() {
		return  driver.findElement(contactInfo);
		
	}

}
