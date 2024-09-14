package PersonalDetailseInfo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModule.Login_page_objects;
import pageObjectModule.PersonalDetailsPageobjectModule;
import resources.Base_class;

public class Employeecontactdetailse extends Base_class{
	
	 @Test
	 public void verify_fields_editable() throws InterruptedException, IOException {
		 driverInitialize();
		 Thread.sleep(3000);
		 
		 Login_page_objects lpo = new Login_page_objects(driver);
		 lpo.enterusername().sendKeys("Admin");
		 
		 
		 
		 Thread.sleep(3000);
		 lpo.enterpassword().sendKeys("admin123");

		 Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(3000);
		 lpo.loginclick().click();
		 lpo.clickoncontactInfo().click();
		 
		 //apply the assertion here
		 
		WebElement dashboard= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		Thread.sleep(3000);
		Assert.assertTrue(dashboard.isDisplayed());
		Thread.sleep(3000);
		System.out.println("You have succesfully login");
		
		PersonalDetailsPageobjectModule pds = new PersonalDetailsPageobjectModule(driver);
		
		pds.personalDetails().click();
		pds.personalDetails().clear();
		 
	 }


	}
	 