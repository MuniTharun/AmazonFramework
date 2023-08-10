package test12;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_Innvocation {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	@Test(priority=1 , invocationCount=2)
	public void TestA() {
		System.out.println("Test A");
	}
	@Test(priority=2 , invocationCount=3)
	public void TestB() {
		System.out.println("Test B");
	}
	@Test(priority=3, invocationCount=1)
	public void TestC() {
		System.out.println("Test C");
	}
	@Test(priority=4, invocationCount=5)
	public void TestD() {
		System.out.println("Test D");
	}
	@Test (priority =5)
	public void TestE() {
		System.out.println("Test E");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	
}
