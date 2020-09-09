
import java.util.Scanner;

public class SumOfASequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First number?");
		int num = Integer.valueOf(scanner.nextLine());
		System.out.println("Last number?");
		int num2 = Integer.valueOf(scanner.nextLine());
		int total = 0;

		for (int i = num; i <= num2; i++) {
			total += i;
		}
		System.out.println("The sum is " + total);
	}
}
