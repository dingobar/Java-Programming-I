
import java.util.Scanner;

public class UserInterface {

	private final TodoList list;
	private final Scanner scanner;

	public UserInterface(TodoList list, Scanner scanner) {

		this.list = list;
		this.scanner = scanner;
	}

	public void start() {
		String input;
		OUTER:
		while (true) {
			input = scanner.nextLine();
			switch (input) {
				case "stop":
					break OUTER;
				case "add":
					add();
					break;
				case "remove":
					remove();
					break;
				case "list":
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
		list.add(scanner.nextLine());
	}
	
	private void remove(){
		System.out.print("To remove: ");
		int index;
		index = Integer.valueOf(scanner.nextLine());
		list.remove(index);
	}
	
	private void list(){
		list.print();
	}

}
