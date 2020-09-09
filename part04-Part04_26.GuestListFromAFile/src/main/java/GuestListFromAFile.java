
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name of the file:");
		String file = scanner.nextLine();

		// implement reading the file here.
		ArrayList<String> list = readNames(Paths.get(file));
		System.out.println("");

		System.out.println("Enter names, an empty line quits.");
		while (true) {
			String name = scanner.nextLine();
			if (name.isEmpty()) {
				break;
			}

			if (list.contains(name)) {
				System.out.println("The name is on the list.");
			} else {
				System.out.println("The name is not on the list.");
			}
		}

		System.out.println("Thank you!");
	}

	private static ArrayList<String> readNames(Path filePath) throws IOException {
		Scanner scanner = new Scanner(filePath);
		ArrayList<String> names = new ArrayList();
		while (scanner.hasNextLine()) {
			names.add(scanner.nextLine());
		}
		return names;
	}
}
