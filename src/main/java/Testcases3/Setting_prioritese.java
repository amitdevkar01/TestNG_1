package Testcases3;

import org.testng.annotations.Test;

public class Setting_prioritese {
    @Test(priority = 2)
	public void driverinitialise() {
		System.out.println("code to inialise the browser");
	}
    @Test(priority = 1)
    public void enterurl() {
    	System.out.println("code to launch url");
    }
    @Test(priority = 4)
    public void entercrediantial() {
    	System.out.println("code to enter Username and password");
    }
    @Test(priority =3 )
    public void driverclosing() {
    	System.out.println("closing the browser");
    }
}
