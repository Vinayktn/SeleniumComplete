package day5_inherit;

public class Bank extends RBI
{
	public Bank()
	{
		System.out.println("welcome to banking services");
	}

	public Bank(String name)
	{
		System.out.println("Hello " +name+ " welcome to banking services");
	}

	public int int_rate = 8;

	public void openAccount()
	{
		System.out.println("customer can open account using phone number");
	}

	public void closeAccount()
	{
		System.out.println("customer now can close account just from application");
	}

	public void depo()
	{
		System.out.println("customer can only deposit money if they have valid source");
	}
}