
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name of the file:");
		String file = scanner.nextLine();
		try {
			ArrayList<String> fileContent = readFileContent(file);
			System.out.println("Search for:");
			String searchedFor = scanner.nextLine();
			searchInArray(fileContent, searchedFor);
		} catch (NoSuchFileException e) {
			System.out.println("Reading the file " + file + " failed.");
		}
	}

	private static ArrayList<String> readFileContent(String filePath) throws IOException {
		Scanner scanner2 = new Scanner(Paths.get(filePath));
		ArrayList<String> names = new ArrayList();
		while (scanner2.hasNextLine()) {
			names.add(scanner2.nextLine());
		}
		return names;
	}

	private static void searchInArray(ArrayList arr, String searchedFor) {

		if (arr.contains(searchedFor)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not found.");
		}
	}
}
