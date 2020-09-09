
import java.util.Scanner;

public class LargerThanOrEqualTo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give the first number:");
		int number1 = Integer.valueOf(scan.nextLine());
		System.out.println("Give the second number:");
		int number2 = Integer.valueOf(scan.nextLine());

		int largest = Integer.max(number1, number2);

		if (number1 == number2) {
			System.out.println("The numbers are equal!");
		} else {
			System.out.println("Greater number is: " + largest);
		}

	}
}
