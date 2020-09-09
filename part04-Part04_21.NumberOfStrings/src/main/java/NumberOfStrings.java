
import java.util.Scanner;

public class NumberOfStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		int count = 0;
		do {
			input = scanner.nextLine();
			if (!input.equals("end")) {
				count++;
			}
		} while (!input.equals("end"));
		System.out.println(count);
	}
}
