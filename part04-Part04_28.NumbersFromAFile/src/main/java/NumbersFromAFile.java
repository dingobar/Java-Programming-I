
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumbersFromAFile {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.print("File? ");
		String file = scanner.nextLine();
		ArrayList<Integer> numbers = readFileContent(file);
		System.out.print("Lower bound? ");
		int lowerBound = Integer.valueOf(scanner.nextLine());
		System.out.print("Upper bound? ");
		int upperBound = Integer.valueOf(scanner.nextLine());

		int count = numbers.stream()
			.filter((n) -> n >= lowerBound)
			.filter(n -> n <= upperBound)
			.collect(Collectors.toList())
			.size();

		System.out.println("Numbers: " + count);

	}

	private static ArrayList<Integer> readFileContent(String filePath) throws IOException {
		Scanner scanner = new Scanner(Paths.get(filePath));
		ArrayList<Integer> content = new ArrayList();
		while (scanner.hasNextLine()) {
			content.add(Integer.valueOf(scanner.nextLine()));
		}
		return content;
	}

}
