
import java.util.Arrays;
import java.util.Scanner;

public class AVClub {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.nextLine();
			if (input.equals("")) {
				break;
			}

			Arrays.stream(input.split(" "))
				.filter(s -> s.contains("av"))
				.forEach(s -> System.out.println(s));

		}
	}
}
