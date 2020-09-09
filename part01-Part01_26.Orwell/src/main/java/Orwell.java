
import java.util.Scanner;

public class Orwell {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give a number:");
		// Write your program here
		int year = Integer.valueOf(scan.nextLine());

		if (year == 1984) {
			System.out.println("Orwell");
		}
	}
}
