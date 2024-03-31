import java.util.*;

public class Calculator {
	public static void main(String [] args) {
		while (true) {
			Scanner SkD = new Scanner(System.in);
			System.out.println("Addition, Subtraction, Multiplication or Division? (A, S, M, D or Q to quit)");
			String user = SkD.next();
			
			if (user.equals("A") || (user.equals("a"))) {
				System.out.println("You've selected Addition");
				Scanner DVD = new Scanner(System.in);
				System.out.println("First Integer:");
				double choice1 = DVD.nextDouble();
				System.out.println("Second Integer:");
				double choice2 = DVD.nextDouble();
				addition(choice1, choice2);
			}
			else if (user.equals("S") || (user.equals("s"))) {
				System.out.println("You've selected Subtraction");
				Scanner DVD = new Scanner(System.in);
				System.out.println("First Integer:");
				double choice1 = DVD.nextDouble();
				System.out.println("Second Integer:");
				double choice2 = DVD.nextDouble();
				subtraction(choice1, choice2);
				
			}
			else if (user.equals("M") || (user.equals("m"))) {
				System.out.println("You've selected Multiplication");
				Scanner DVD = new Scanner(System.in);
				System.out.println("First Integer:");
				double choice1 = DVD.nextDouble();
				System.out.println("Second Integer:");
				double choice2 = DVD.nextDouble();
				multiplication(choice1, choice2);
				
			}
			else if (user.equals("D") || (user.equals("d"))) {
				System.out.println("You've selected Division");
				Scanner DVD = new Scanner(System.in);
				System.out.println("First Integer:");
				double choice1 = DVD.nextDouble();
				System.out.println("Second Integer:");
				double choice2 = DVD.nextDouble();
				divide(choice1, choice2);
			}
			
			else if (user.equals("Q") || (user.equals("q"))) {
				System.out.println("Goodbye!");
				System.exit(0);
			}
			
			else {
				System.out.println("Result not found.");
			}
		}
		}
		
		public static void divide(double choice1, double choice2) {
			double answer = choice1 / choice2;
			if (answer == (int) answer) {
				System.out.println("Answer: " + (int) answer);
			} else {
				System.out.println("Answer: " + answer);
			}
				
			
		}
		
		public static void addition(double choice1, double choice2) {
			double answer = choice1 + choice2;
			if (answer == (int) answer) {
				System.out.println("Answer: " + (int) answer);
			} else {
				System.out.println("Answer: " + answer);
			}
			
		}
		
		public static void multiplication(double choice1, double choice2) {
			double answer = choice1 * choice2;
			if (answer == (int) answer) {
				System.out.println("Answer: " + (int) answer);
			} else {
				System.out.println("Answer: " + answer);
			}
			
		}
		public static void subtraction(double choice1, double choice2) {
			double answer = choice1 - choice2;
			if (answer == (int) answer) {
				System.out.println("Answer: " + (int) answer);
			} else {
				System.out.println("Answer: " + answer);
			}
			
		}
		
	}