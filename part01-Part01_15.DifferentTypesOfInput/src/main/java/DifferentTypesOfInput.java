
import java.util.Scanner;

public class DifferentTypesOfInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Write your program here
		System.out.println("Give a string:");
		String msg = scan.nextLine();
		System.out.println("Give an integer:");
		int number = Integer.valueOf(scan.nextLine());
		System.out.println("Give a double:");
		double decimalnumber = Double.valueOf(scan.nextLine());
		System.out.println("Give a boolean:");
		boolean fuck = Boolean.valueOf(scan.nextLine());

		System.out.println("You gave the string " + msg);
		System.out.println("You gave the integer " + number);
		System.out.println("You gave the double " + decimalnumber);
		System.out.println("You gave the boolean " + fuck);

	}
}
