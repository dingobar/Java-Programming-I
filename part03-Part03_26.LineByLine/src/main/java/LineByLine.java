
import java.util.Arrays;
import java.util.Scanner;

public class LineByLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.nextLine();
			if (input.equals("")) {
				break;
			}

			Arrays.stream(input.split(" ")).forEach(s -> System.out.println(s));
		}

	}
}
