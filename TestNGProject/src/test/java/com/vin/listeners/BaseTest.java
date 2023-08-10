package com.vin.listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest 
{
	public static  WebDriver driver;
	public static String screenshotsubfoldername;
	@BeforeTest
	public void setup()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
	}

	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

	public void capturescreenshot(String filename)  
	{
		if (screenshotsubfoldername == null)
		{
			LocalDateTime myDateObj = LocalDateTime.now();
			System.out.println("Before formatting: " + myDateObj);
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			screenshotsubfoldername = myDateObj.format(myFormatObj);
		}
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File SourceFile = takescreenshot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./ScreenShots/" + screenshotsubfoldername + "/" + filename);
		try
		{
			FileUtils.copyFile(SourceFile, DestFile);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
	}
}