package Testcases3;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Setting_prorites_enable_attribute {
	@Test(enabled = false)
	public void driverinitialise() {
		System.out.println("code to inialise the browser");
	}
    @Test(enabled = true)
    public void enterurl() {
    	System.out.println("code to launch url");
    }
    @Test
    public void entercrediantial() {
    	System.out.println("code to enter Username and password");
    }
    @Test
    public void driverclosing() {
    	System.out.println("closing the browser");
    }

}
