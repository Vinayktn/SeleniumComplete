package test;


import java.util.NoSuchElementException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL", "API Key/Uname"})
	@Test
	public void webloginhomeloan(String url, String key)
	{
		//selnium
		System.out.println("webloginhome");
		System.out.println(url);
		System.out.println(key);
	}


	@Test(groups= {"smoke"})
	public void mobileloginhomeloan()
	{
		//appium
		System.out.println("mobileloginhome");
	}


	@Test
	public void loginapihomeloan()
	{
		//rest api automation
		System.out.println("apiloginhome");
	}
}
