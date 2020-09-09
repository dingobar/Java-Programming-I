
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Filename:");
		String file = scan.nextLine();

		ArrayList<Person> records = readRecordsFromFile(file);
		System.out.println("Persons: " + records.size());
		System.out.println("Persons:");
		for (Person person : records) {
			System.out.println(person);

		}
	}

	public static ArrayList<Person> readRecordsFromFile(String file) {
		ArrayList<Person> content = new ArrayList();
		try ( Scanner scanner = new Scanner(Paths.get(file))) {

			while (scanner.hasNextLine()) {
				String input = scanner.nextLine();
				if (input.isEmpty()) {
					continue;
				}
				String[] temp = input.split(",");
				content.add(new Person(temp[0], Integer.valueOf(temp[1])));
			}

		} catch (IOException e) {
			System.out.println(e.toString());
		}
		return content;

	}
}
