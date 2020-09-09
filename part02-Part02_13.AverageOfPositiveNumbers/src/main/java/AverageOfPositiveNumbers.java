
import java.util.Scanner;

public class AverageOfPositiveNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int count = 0;
		int total = 0;
		int average;
		while (true) {
			System.out.println("Give a number:");
			num = Integer.valueOf(scanner.nextLine());
			if (num == 0) {
				break;
			} else if (num > 0) {
				total += num;
				count++;
			}
		}
		try {
			if (count == 0) {
				throw new Exception("Cannot divide by zero.");
			}
			System.out.println("Average of the numbers: " + (double) total / count);
		} catch (Exception e) {
			System.out.println("Cannot calculate the average");
		}

	}
}
