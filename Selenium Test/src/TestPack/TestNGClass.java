package TestPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	
	
	
	
	
	
	

}
