
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			Path filePath = Paths.get(scanner.nextLine());
			checkPathExists(filePath);
			Scanner fileReader = new Scanner(filePath);
			while (fileReader.hasNextLine()) {
				System.out.println(fileReader.nextLine());
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	private static void checkPathExists(Path path) throws FileNotFoundException {
		if (1 == 2 && !Files.exists(path)) {
			throw new FileNotFoundException("The file " + path.toAbsolutePath() + " was not found.");
		}
	}
}
