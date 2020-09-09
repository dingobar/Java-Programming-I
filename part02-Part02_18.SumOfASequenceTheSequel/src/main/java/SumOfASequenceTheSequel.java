
import java.util.Scanner;

public class SumOfASequenceTheSequel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.println("Give a number:");
		int num = Integer.valueOf(scanner.nextLine());

		System.out.println("Factorial: " + factorial(num));
	}

	private static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
