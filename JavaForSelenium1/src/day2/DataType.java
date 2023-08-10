package day2;

/*
 * 
 * 		This example will show you usage of diff data types in Jav
 * 
 */

public class DataType {

	public static void main(String[] args) {
		
		
		//within range
		byte num1=125;
		System.out.println(num1);
		
		//downcasting and it has to be explicit
		byte marks=(byte)130;
		System.out.println(marks);
		
		short newMarks=25000;
		System.out.println(newMarks);
		
		int phoneNumber=12121212;
		System.out.println(phoneNumber);
		
		// add l at last
		long anotherNumber=9234579879l;
		System.out.println(anotherNumber);
		
		
		byte n1=100;
		//upcasting and java will do implicitly
		short n2=n1;
		System.out.println(n2);
		
		//Infinity
		System.out.println(2.0 / 0 );
		
		//Nan
		System.out.println(2.0 % 0 );
		
		char myChar='a';
		System.out.println(myChar);
		
		// maps to ascii table
		char myNewChar=85;
		System.out.println(myNewChar);
		
		boolean status=false;
		System.out.println(status);
		
		// default floating value is double and add f at last
		float marks1=12.5f;
		System.out.println(marks1);
		
		double marks2=50.0;
		System.out.println(marks2);
		
	}

}
