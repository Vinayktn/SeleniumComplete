package test;


import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 
{
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
	}
	

	@Test
	public void Demo() 
	{
		System.out.println("hello");
		//Assert.assertTrue(false);

	}
	
	
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("i am the no-1 from last");
	}

	
	@Test
	public void secondtest()
	{
		System.out.println("bye");
	}
}
