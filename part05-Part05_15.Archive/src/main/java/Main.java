
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id;
		String name;
		ArrayList<Item> items = new ArrayList();
		while (true) {
			System.out.println("Identifier? (empty will stop)");
			id = scanner.nextLine();
			if (id.isEmpty()) {
				break;
			}
			System.out.println("Name? (empty will stop)");
			name = scanner.nextLine();
			if (name.isEmpty()) {
				break;
			}
			Item item = new Item(id, name);
			if (!(items.contains(item))) {
				items.add(item);
			}
		}
		System.out.println("");
		System.out.println("==Items==");
		items.forEach((i) -> {
			System.out.println(i);
		});

	}
}
