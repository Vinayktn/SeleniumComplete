package day5_inherit;

public class IDFCFirstBank extends Bank
{

	
	public static void main(String[] args) 
	{
		//scenario-1: creating object of child class and reference of child class
		IDFCFirstBank idfc = new IDFCFirstBank();

		System.out.println("Int rate for homeloan is " + idfc.int_rate);

		idfc.openAccount();

		idfc.depo();

		idfc.with();

		idfc.closeAccount();

		//scenario-2: creating object of base class and reference of base class
		Bank b1 = new Bank();
		b1.openAccount();
		b1.closeAccount();

		//scenario-3: creating object of child class and reference of base class
		Bank b2 = new IDFCFirstBank(); //REFERENCE MATTERS
		b2.openAccount();
		b2.closeAccount();

		//scenario-4: creating object of base class and reference of child class
		//THIS IS NOT ALLOWED IN JAVA
		//IDFCFirstBank idfc1 = new Bank();
	}

	public void depo()
	{
		System.out.println("bank allows cust to depo");
	}

	public void with()
	{
		System.out.println("bank allows customer to withdraw amount 24/7");
	}
}