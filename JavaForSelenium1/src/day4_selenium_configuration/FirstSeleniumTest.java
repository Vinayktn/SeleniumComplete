package day4_selenium_configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest 
{
	public static void main(String[] args)
	{
		System.setProperty("WebDriver.chrome.driver",  "\\chromedriver_win32 (6)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title is: " + driver.getTitle());
		System.out.println("Url is: " + driver.getCurrentUrl());
		System.out.println("\n");
		driver.quit();

		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://in.search.yahoo.com/?fr2=inr");
		System.out.println("Title is: " + driver1.getTitle());
		System.out.println("Url is: " + driver1.getCurrentUrl());
		System.out.println("\n");
		driver1.quit();

		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		System.out.println("Title is: " + driver2.getTitle());
		System.out.println("Url is: " + driver2.getCurrentUrl());
		System.out.println("\n");
		driver2.quit();
	}
}