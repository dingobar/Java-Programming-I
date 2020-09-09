
import java.util.Scanner;

public class Cubes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input;
		int value;
		while (true) {
			input = scanner.nextLine();
			if (input.equals("end")) {
				break;
			}
			value = Integer.valueOf(input);
			System.out.println((int) Math.pow(value, 3));
		}
	}
}
