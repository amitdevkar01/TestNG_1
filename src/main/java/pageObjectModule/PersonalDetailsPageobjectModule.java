package pageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalDetailsPageobjectModule {

	
	public WebDriver driver;
	private By personalDetailse=By.linkText("PersonalDetails");
	
	public PersonalDetailsPageobjectModule(WebDriver driver2) {
		this.driver=driver2;
	}

	
	public WebElement personalDetails() {
		return driver.findElement(personalDetailse);
		
	}
}
