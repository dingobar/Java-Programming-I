
import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int count = 0;
		int total = 0;
		while (true) {
			System.out.println("Give a number:");
			num = Integer.valueOf(scanner.nextLine());
			if (num == 0) {
				break;
			} else {
				total += num;
			}
			count++;
		}
		System.out.println("Average of the numbers: " + (double) total / count);
	}
}
