
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

	public static void main(String[] args) {
		// we create a scanner for reading the file
		Path lol = Paths.get("data.txt");
		try ( Scanner scanner = new Scanner(lol)) {

			// we read the file until all lines have been read
			while (scanner.hasNextLine()) {
				// we read one line
				String row = scanner.nextLine();
				// we print the line that we read
				System.out.println(row);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
