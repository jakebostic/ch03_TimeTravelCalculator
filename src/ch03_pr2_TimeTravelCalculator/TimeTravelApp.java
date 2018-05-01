package ch03_pr2_TimeTravelCalculator;

import java.util.Scanner;

public class TimeTravelApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Time Travel Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter miles: ");
			int m = sc.nextInt();
			System.out.println("Enter miles per hour: ");
			int mph = sc.nextInt();
			
		}
		
		
		
		
		sc.close();
		System.out.println("Bye!");

	}
}
