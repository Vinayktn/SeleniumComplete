package day3_math_string_polymorphism;

import p1.Selenium;

public class ImportDemo {

	public static void main(String[] args) 
	{	
		Selenium s=new Selenium();
		
		s.automate();
		
		s.automateAPI();
		
		Selenium.crossBrowser();
		
		Selenium.crossPlatform();
		
		System.out.println(Selenium.version);
	}

}
