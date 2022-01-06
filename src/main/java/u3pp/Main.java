package u3pp;

import java.util.Scanner;

/**
 * YOUR COMMENTS HERE
 * 
 * @author Tryntyn Mardikian
 */

class Main {

	public static void main(String[] args) {

		//YOUR CODE HERE
        System.out.println (LeapYear.isLeapYear (1300));
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter a year (or enter STOP to end): ");
		String input = scanner.nextLine();
		System.out.println (input);

		// while (!input.toUpperCase().equals("STOP")) {
		// 	/* YOUR CODE HERE */
		// 	System.out.print("Enter a year (or enter STOP to end): ");
		// 	//YOUR CODE HERE
		// }
		// //YOUR CODE HERE
	}
}