import java.util.*;

public class PasswordGenerator  {
	public static void main(String [] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the amount of characters you want for your password: ");
			int length = scanner.nextInt();
			Random random = new Random();
			String Alphabet1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String Alphabet2 = "abcdefghijklmnopqrstuvwxyz";
			String numbers = "0123456789";
			String characters = "!@#$%^&*()-=";
			String allAlphabet = Alphabet1 + Alphabet2 + numbers + characters;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < length; i++) {
				int index = random.nextInt(allAlphabet.length());
				char randomChar = allAlphabet.charAt(index);
				sb.append(randomChar);
		}
			String randomString = sb.toString();
			System.out.println("Your new password is: ");
			System.out.println(randomString);
			System.out.print("Would you like to quit or generate a new password? (Q to quit, anything else to continue): ");
			String choice = scanner.next();
			if (choice.equals("Q")) {
				break;
				
			} else {
				continue;
			}
			
		}
	}
}