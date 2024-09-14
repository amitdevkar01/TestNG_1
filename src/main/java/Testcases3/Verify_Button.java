package Testcases3;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModule.Login_page_objects;
import resources.Base_class;

public class Verify_Button extends Base_class {
	
 @Test
 public void verify_login_button() throws InterruptedException, IOException {
	 driverInitialize();
	 Thread.sleep(3000);
	 
	 Login_page_objects lpo = new Login_page_objects(driver);
	 lpo.enterusername().sendKeys("Admin");
	 
	 
	 
//	 driver.findElement(By.name("Username")).sendKeys("Amit");
	 Thread.sleep(3000);
	 lpo.enterpassword().sendKeys("admin123");

//	 driver.findElement(By.name("Password")).sendKeys("Amit!jhf");
	 Thread.sleep(3000);
     driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(3000);
	 
	 //apply the assertion here
	 
//	 String titleExpected ="OrangeHRM";
//	 String titleActual = driver.getTitle();
//	 
//	 Assert.assertEquals(titleExpected, titleActual);
//	 System.out.println("You have succesfully login");
//	 

	 
	WebElement dashboard= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
	Thread.sleep(3000);
	Assert.assertTrue(dashboard.isDisplayed());
	Thread.sleep(3000);
	System.out.println("You have succesfully login");
	 
	 
 }


}
 

