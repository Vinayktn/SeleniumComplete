package day2;

public class Employee 
{
	static String CEO="Paul";
	String name;
	String email;
	int empId;
	
	/*			Rules of Constructor
	 * 	Cons has the same name as clasName
	 * 	Cons does not have return type not even void
	 * 	Cons will be automatically when you create object
	 */
	public Employee(String empName,String empEmail,int employeeID)
	{
			name=empName;
			email=empEmail;
			empId=employeeID;
	}
	
	
	public static void main(String[] args) 
	{
		Employee shwetha=new Employee("shwetha", "abc@gmail.com", 1);
		
		shwetha.work();
		
		Employee parveen=new Employee("parveen", "parveen@gmail.com", 2);
		
		Employee hemankshi=new Employee("hemankshi", "hemankshi@gmail.com", 3);
		
		parveen.lunchBreak();
		
		hemankshi.leave();
		
	}
	
	public void leave()
	{
		System.out.println(CEO);
		System.out.println(name);
		System.out.println(email);
		System.out.println(empId);
		System.out.println("Emp can take leaves");
	}
	
	public void lunchBreak()
	{
		System.out.println(CEO);
		System.out.println(name);
		System.out.println(email);
		System.out.println(empId);
		System.out.println("Emp can take break");
	}
	
	public void work()
	{
		System.out.println(CEO);
		System.out.println(name);
		System.out.println(email);
		System.out.println(empId);
		System.out.println("Emp has to work 8 hours");
	}
	
	public boolean isSingle()
	{
		return false;
		
	}
	

}
