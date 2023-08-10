package day3_math_string_polymorphism;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String error_message="Please use valid email. Aya is new emp in India";
		
		String expected_error_message="Please use Valid email";
		
		//true
		System.out.println(error_message.contains("valid"));
		
		//false
		System.out.println(error_message.contains("Valid"));
		
		//true
		System.out.println(error_message.equalsIgnoreCase(expected_error_message));
		
		//false
		System.out.println(error_message.equals(expected_error_message));
		
		//true
		System.out.println(error_message.startsWith("Please"));
		
		//false
		System.out.println(error_message.endsWith("Email"));
		
		// 1, 7, 6 
		System.out.println(error_message.indexOf("use"));
		
		//
		String []arr= error_message.split(" ");
		
		String []arr1= error_message.split("Aya");
		
		System.out.println(arr[0]);
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		/*
		 * Swati s;
		 * 
		 * Swati s1=new Swati();
		 */
		
		String checkout= "Final order is 212 USD";
		
		String newArr=checkout.split("is")[1];
		
		String arr2[]=newArr.split(" ");
		
		System.out.println(arr2[1]);
		
		Integer.parseInt(arr2[1]);
		
	}

}
