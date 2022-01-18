package u3pp;

import java.util.Scanner;

/**
 * YOUR COMMENTS HERE
 * 
 * @author Tryntyn Mardikian
 */

class Main {

	public static void main(String[] args) {

		//Scanner scanner = new Scanner (System.in);
		//while (true)
		//{
			//System.out.println("Hi what's your name?");
			//String input = scanner.nextLine();
			//if (input.toLowerCase().equals("stop"))
			//{
				//break;	
			//}
			//System.out.println("Hello " + input);
		//}
		//scanner.close();
		
		//int input;
		//System.out.println("Hello " + input);
        //System.out.println (LeapYear.Main (int year));
		//Scanner scanner = new Scanner (System.in);
		//System.out.print("Enter a year (or enter STOP to end): ");
		//String input = scanner.nextLine();
		//System.out.println (input);
        
		Scanner scanner = new Scanner (System.in);
		 while (true) 
		 {
			System.out.print("Enter a year (or enter STOP to end): ");
			String input = scanner.nextLine();
			if (input.toUpperCase().equals("STOP"))
			{
				
				break;
			}
			int a = Integer.parseInt(input);
			System.out.println (LeapYear.isLeapYear (a));
	        if (LeapYear.isLeapYear(a) == true)
			{
				System.out.println( a + " is a leap year");
			}

			if (LeapYear.isLeapYear(a) == false)
			{
				System.out.println( a + " is not a leap year");
			}
		 }

		 // if is leap year 
		 //is false, 
		 //then it would be "is not a leap year"
		 // if is leap year is true, then it would be "is a leap year"
		 scanner.close();
		 	
	}
}