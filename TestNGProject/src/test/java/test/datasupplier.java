package test;


import org.testng.annotations.DataProvider;

public class datasupplier 
{
	@DataProvider
	public String[] dp1() 
	{
		String[] data = new String[]
				{
						"vinay",
						"heihf",
						"ifif"		
				};
		return data;
	}


	@DataProvider
	public Integer[] dp2() 
	{
		Integer[] data = new Integer[]
				{
						12,
						123,
						6789		
				};
		return data;
	}


	@DataProvider
	public Object[][] dp3() 
	{
		Object[][] data = new Object[][]
				{
			{123,"vinay"},
			{"heihf"},
			{123, 123, 6789, "ifif"}	
				};
				return data;
	}
}