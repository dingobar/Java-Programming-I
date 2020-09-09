
import java.util.Scanner;

public class TextUI {

	private final SimpleDictionary simpledictionary;
	private final Scanner scanner;

	public TextUI(Scanner scanner, SimpleDictionary simpledictionary) {
		this.simpledictionary = simpledictionary;
		this.scanner = scanner;
	}

	public void start() {
		String input;
		while (true) {
			System.out.print("Command: ");
			input = scanner.nextLine();
			if (input.equals("end")) {
				break;
			} else if (input.equals("add")) {
				this.add();
			} else if (input.equals("search")) {
				this.search();
			}

			System.out.println("Unknown command");
		}
	}

	private void add() {
		String word;
		String translation;
		System.out.print("Word: ");
		word = scanner.nextLine();
		System.out.print("Translation: ");
		translation = scanner.nextLine();
		simpledictionary.add(word, translation);
	}

	private void search() {
		String word;
		String translation;
		System.out.print("To be translated: ");
		word = scanner.nextLine();
		translation = simpledictionary.translate(word);

		if (translation == null) {
			System.out.println("Word " + word + " was not found");
		} else {
			System.out.println("Translation: " + translation);
		}

	}

}
