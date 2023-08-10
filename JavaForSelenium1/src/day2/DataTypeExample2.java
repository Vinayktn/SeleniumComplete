package day2;


/*
 * 
 * 		This class will explain the data type with wrapper
 * 
 */
		

public class DataTypeExample2 {

	public static void main(String[] args) {
		
		// Integer is wrapper class
		Integer num1=100;
		Integer num2=200;
		
		// allowed
		System.out.println(num1+num2);
		
		int num3=25;
		int num4=50;
		
		int result=num3+num4;
		//allowed
		System.out.println(result);
	
		// Object class can have any type of values and will convert accordingly depends on what values we assign
		Object obj1=100;  // stored as Integer
		Object obj2=12.5;	// Stored as Double
		Object obj3=true;	// Boolean
		Object obj4="Selenium"; //String
		Object obj5='a';		//Character
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
	

	}

}
