package test;


import org.testng.annotations.Test;

public class DP_DifferentClass 
{

	@Test(dataProvider = "dp1", dataProviderClass = datasupplier.class)
	public void testlogin(String s)
	{
		System.out.println(s);
		System.out.println("------------------------------------------------------------------------");
	}	



	@Test(dataProvider = "dp2", dataProviderClass = datasupplier.class)
	public void testlogin(Integer i)
	{
		System.out.println(i);
		System.out.println("------------------------------------------------------------------------");
	}	

	

	@Test(dataProvider = "dp3", dataProviderClass = datasupplier.class)
	public void testlogin(Object[] o)
	{
		for(int i = 0; i<o.length; i++)
		{
			System.out.println(o[i]);
		}
		System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");	}	
}
