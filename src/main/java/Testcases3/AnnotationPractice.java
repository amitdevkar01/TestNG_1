package Testcases3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationPractice {

	@Test
	public void m1() {
		System.out.println("Iam method M1");
	}
	@Test
	public void z1() {
		System.out.println("z1");
	}
	@BeforeMethod
	public void m2() {
		System.out.println("hello");
	}
	@AfterMethod
	public void m3() {
		System.out.println("aftermethod annotation is used");
	}
	@BeforeClass
	public void add() {
		System.out.println("Here before class is used");
	}
	@AfterClass
	public void sub() {
		System.out.println("After class is done");
	}
	
	
}
