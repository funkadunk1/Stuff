import java.util.*;

public class NumberGuess {
	public static void main(String [] args) {
		int guesses = 1;
		int answer = 1;
		while (guesses <= 5) {
			Scanner nObj = new Scanner(System.in);
			System.out.println("Guess the number!");
			int choice = nObj.nextInt();
			if (choice != answer && guesses < 5) {
				System.out.println("Wrong answer! Try again!");
				guesses++;
			} 
			else if (guesses == 5) {
				System.out.println("You ran out of guesses!");
				break;
			}
			else {
				System.out.println("You won!");
				break;
			}
		}
	}
}