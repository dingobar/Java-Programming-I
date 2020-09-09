
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Person> listOfPeople = readFileContent(scanner.nextLine());

		listOfPeople.forEach((x) -> {
			System.out.println(x.toString());
		});

	}

	private static ArrayList<Person> readFileContent(String filePath) throws IOException {
		Scanner scanner = new Scanner(Paths.get(filePath));
		ArrayList<Person> content = new ArrayList();
		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			if (input.isEmpty()) {
				continue;
			}
			String[] temp = input.split(",");
			content.add(new Person(temp[0], Integer.valueOf(temp[1])));
		}
		return content;
	}
}
