package day3_math_string_polymorphism;

public class MethodOverLoadingExample 
{

	public MethodOverLoadingExample()
	{
		System.out.println("Hello");
	}
	
	public MethodOverLoadingExample(String name)
	{
		System.out.println("Hello "+name);
	}
	
	public MethodOverLoadingExample(String name,int id)
	{
		System.out.println("Hello "+name+ " Your emp id is "+id);
	}
	

	public static void main(String[] args) 
	{	
		MethodOverLoadingExample obj1=new MethodOverLoadingExample("Hemanshi",12);
		MethodOverLoadingExample obj2=new MethodOverLoadingExample("Pooja");
		MethodOverLoadingExample obj3=new MethodOverLoadingExample();
		
		obj1.click("Logout");

		obj1.click(15.6, 15);
	}
	
	public void click()
	{
		System.out.println("Click on current mouse location");
	}
	
	public void click(int x)
	{
		System.out.println("Click on element at "+x);
	}
	
	public void click(int x,int y)
	{
		System.out.println("Click on element at "+x +"and "+y);
	}
	
	public void click(String x)
	{
		System.out.println("Click on element with "+x);
	}
	
	public void click(int x,double y)
	{
		System.out.println("Click on element at "+x +"and "+y);
	}

	public void click(double y,int x)
	{
		System.out.println("Click on element at "+x +" and "+y);
	}
}
