package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceLabs_Practicals
{
	@Test(dataProvider = "loginData", dataProviderClass = ExcelDataSupplier.class)
	public void TestLogin(String username, String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		try 
		{
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login-button")).click();
			String title = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
			Assert.assertEquals(title, "Swag Labs");
			Thread.sleep(5000);
		}
		
		catch (AssertionError e)
		{
			// Handle the failed login case
			System.out.println("Login failed. Closing the browser.");
		}
		
		finally 
		{
			driver.quit();
		}
	}
}