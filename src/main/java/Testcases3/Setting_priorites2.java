package Testcases3;

import org.testng.annotations.Test;

public class Setting_priorites2 {
	@Test(priority = 'a')
	public void driverinitialise() {
		System.out.println("code to inialise the browser");
	}
    @Test(priority = 'A')
    public void enterurl() {
    	System.out.println("code to launch url");
    }
    @Test(priority = 'b')
    public void entercrediantial() {
    	System.out.println("code to enter Username and password");
    }
    @Test(priority ='c' )
    public void driverclosing() {
    	System.out.println("closing the browser");
    }

}
