package test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderusage {

	@Test(dataProvider = "dp1")
	//	public void testlogin(String s)
	//	{
	//		System.out.println(s);
	//	}
	//	public void testlogin(String[] s)
	//	{
	//		System.out.println(s[0]  + "<<<<<<<<>>>>>>>" + s[1]);
	//	}

	//	public void testlogin(String[] s)
	//	{
	//		for(int i = 0; i<s.length; i++)
	//		{
	//			System.out.println(s[i]);
	//		}
	//		System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
	//	}

	public void testlogin(String[] s)
	{
		System.out.println(s[0] + "<<<<<<<<<<<>>>>>>>>>>" + s[1]);
	}

	//using single dimensional array
	@DataProvider(indices = {0, 1})
	public Iterator<String[]> dp1()
	{
		//		String[] data = new String[]
		//				{
		//						"abc",
		//						"def",
		//						"ghi"
		//				};

		//		Integer[] data = new Integer[]
		//				{
		//						1,
		//						2,
		//						3
		//				};

		//		Object[] data = new Object[]
		//				{
		//						1,
		//						"Vinay",
		//						3
		//				};

		//		String[][] data = new String[][]
		//				{
		//			{"hyr", "123"},
		//			{"Vinay", "324"},
		//			{"ear", "ihu"}
		//				};
		//				return data;


		//		//Jagged array
		//		String[][] data = new String[][]
		//				{
		//			{"hyr", "123", "12", "23.23"},
		//			{"Vinay", "324"},
		//			{"ear", "ihu", "vinay"}
		//				};
		//				return data;


		//Using Collections
		//		List<String> data = new ArrayList<>();
		//		data.add("hjojewfei");
		//		data.add("iefff");
		//		return data.iterator();


		List<String[]> data = new ArrayList<>();
		data.add(new String[] {"hjojewfei", "uiu"});
		data.add(new String[] {"iefff", "ieffffeff"});
		return data.iterator();
	}
}