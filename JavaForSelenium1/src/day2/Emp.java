package day2;

/*
 * 
 * 		This class explains what is methods and class.
 * 		We will also see how to access method using Object
 * 
 */

public class Emp {

	public static void main(String[] args) {
		
		/*	Syntax to create object
		 * 	Class-name object=new Class-name();
		 * 
		 */
		Emp aya=new Emp();
		aya.work();
		aya.lunchBreak();
		aya.leave();
		
		Emp fathima=new Emp();
		fathima.leave();
		
		Emp kalyan=new Emp();
		kalyan.work();
		kalyan.isSingle();
	
	
	}
	
	/*	
	 * 	Syntax to create method
	 * 
	access-modifier return-type method-name()
			{
		
			}
	*/
	
	public void leave()
	{
		System.out.println("Emp can take leaves");
	}
	
	public void lunchBreak()
	{
		System.out.println("Emp can take break");
	}
	
	public void work()
	{
		System.out.println("Emp has to work 8 hours");
	}
	
	public boolean isSingle()
	{
		return false;
		
	}
	

}
