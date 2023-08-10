package p1;

public class Selenium {
	
	public static int version=4;
	
	public static void crossBrowser()
	{
		System.out.println("Selenium support all major browsers");
	}
	
	public static void crossPlatform()
	{
		System.out.println("Selenium support all major OS");
	}
	
	
	// non static method you can call only using objects
	public void automate()
	{
		System.out.println("Selenium can automate only web apps");
	}
	
	
	public void automateAPI()
	{
		System.out.println("Selenium internally used http client which helps us to make API call");
	}
}
