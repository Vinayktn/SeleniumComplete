package test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {


	@Parameters({"URL", "APIKey/Uname"})
	@Test(timeOut = 4000)
	public void weblogincarloan(String urlname, String Key)
	{
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(Key);

	}


	@Test(enabled = false)
	public void mobilelogincarloan()
	{
		//appium
		System.out.println("mobilelogincar");
	}


	@BeforeClass
	public void beforeclass()
	{
		System.out.println("I will execute before all the methods of this day3 class");
		System.out.println("____________________________________________________________");
	}


	@Test(groups= {"smoke"})
	public void mobilesignincarloan()
	{
		//appium
		System.out.println("mobilesignincarloan");
	}

	@BeforeMethod
	public void beforeeverymethod()
	{
		System.out.println("I will execute before every test mehod in day3 class");
	}


	@AfterMethod
	public void aftereverymethod()
	{
		System.out.println("I will execute after every test mehod in day3 class");
	}


	@Test(dataProvider = "getdata")
	public void mobilesigoutcarloan(String Username, String Password)
	{
		//appium
		System.out.println("mobilesigoutcarloan");
		System.out.println(Username);
		System.out.println(Password);
	}


	@AfterClass
	public void afterclass()
	{
		System.out.println("____________________________________________________________");
		System.out.println("I will execute after all the methods of this day3 class");
	}


	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no-1");
	}

	@DataProvider
	public Object[][] getdata()
	{
		//1st combination - Uname - Pwd - credithistory-1
		//2nd cmbination - Uname - Pwd - credithistory-2
		//3rd combination - Uname - Pwd - credithistory-3
		Object[][] data = new Object[3][2];

		//1st set
		data[0][0] = "firstsetUname";
		data[0][1] = "firstsetUname";

		//2nd set
		data[1][0] = "secondsetUname";
		data[1][1] = "secondsetUname";

		//3rd set
		data[2][0] = "thirdsetUname";
		data[2][1] = "thirdsetUname";
		return data;
	}


	@Test(dependsOnMethods = {"weblogincarloan", "mobilesigoutcarloan"})
	public void apicarloan()
	{
		//rest api automation
		System.out.println("apilogincar");
	}
}