package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.junit.Test;

public class TestNG {
	@BeforeTest
	public void test(){
		System.out.println("Before test executes");
	}
	@AfterTest
	public void test1(){
		System.out.println("After test executes");
	}
	@BeforeMethod
	public void test2(){
		System.out.println("executes before each test");
	}
	@AfterMethod
	public void test3(){
		System.out.println("executes after each test");
	}
@Test
public void BExample(){
	System.out.println("executes next");

}
@Test
public void AExample(){
	System.out.println("executes first");

}
}
