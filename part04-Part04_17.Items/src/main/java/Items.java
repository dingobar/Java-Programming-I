
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

	public static void main(String[] args) {
		// implement here your program that uses the class Item

		ArrayList<Item> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String input;
		while (true) {
			input = scanner.nextLine();
			if (input.equals("")) {
				break;
			} else {
				items.add(new Item(input));
			}
		}

		items.forEach((i) -> {
			System.out.println(i);
		});

	}
}
