package com.vin.listeners;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends BaseTest implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		//		System.out.println(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName() + ".jpg");
		//		capturescreenshot(result.getMethod().getMethodName()+".jpg");


		System.out.println(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName() + ".jpg");
		capturescreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName() + ".jpg");
	}
}

