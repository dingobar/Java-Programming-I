
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintThrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Write your program here
		String lol = scanner.nextLine();

		IntStream.range(0, 3).forEach(x -> System.out.print(lol));

	}
}
