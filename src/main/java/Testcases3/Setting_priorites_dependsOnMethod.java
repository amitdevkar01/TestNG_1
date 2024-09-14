package Testcases3;

import org.testng.annotations.Test;

public class Setting_priorites_dependsOnMethod {

	@Test
	public void driverinitialise() {
		System.out.println("code to inialise the browser");
	}
    @Test(dependsOnMethods = "driverinitialise")
    public void enterurl() {
    	System.out.println("code to launch url");
    }
   
}
