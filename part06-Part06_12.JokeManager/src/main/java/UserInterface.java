
import java.util.Scanner;

public class UserInterface {

	private final JokeManager list;
	private final Scanner scanner;

	public UserInterface(JokeManager list, Scanner scanner) {

		this.list = list;
		this.scanner = scanner;
	}

	public void start() {
		String input;
		OUTER:
		while (true) {
			input = scanner.nextLine();
			switch (input) {
				case "X":
					break OUTER;
				case "1":
					add();
					break;
				case "2":
					draw();
					break;
				case "3":
					list();
					break;
				default:
					break;
			}
			System.out.println("Unknown input!");
		}
	}
	
	private void add(){
		System.out.print("To add: ");
		list.addJoke(scanner.nextLine());
	}
	
	private void draw(){
		System.out.println(list.drawJoke());
	}
	
	private void list(){
		list.printJokes();
	}
	

}
