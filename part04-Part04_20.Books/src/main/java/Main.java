
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Book> books = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String name;
		int pages;
		int year;
		while (true) {
			System.out.print("Name: ");
			name = scanner.nextLine();
			if (name.isEmpty()) {
				break;
			}
			System.out.print("Pages: ");
			pages = Integer.valueOf(scanner.nextLine());
			System.out.print("Publication year: ");
			year = Integer.valueOf(scanner.nextLine());

			books.add(new Book(name, pages, year));
		}

		System.out.print("What information will be printed? ");
		String whatToPrint = scanner.nextLine();

		books.stream()
			.forEach((b)
				-> System.out.println(
				whatToPrint.equals("everything") ? b.toString() : b.getName()
			)
			);

	}
}
