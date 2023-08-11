package day5_inherit;

public class IDFCFirstBankNew extends Bank
{
	public IDFCFirstBankNew()
	{
		super("vinay");
		System.out.println("welcome to ifdc first bank");
		System.out.println("\n");
	}

	public static void main(String[] args) 
	{
		IDFCFirstBankNew idfc = new IDFCFirstBankNew();
		idfc.depo();
		idfc.kycvalidate();

		Bank b1 = new IDFCFirstBank();
		b1.depo();
		b1.kycvalidate();

		RBI b2 = new IDFCFirstBank();
		b2.kycvalidate();
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