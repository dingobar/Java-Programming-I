
import java.util.Scanner;

public class LiquidContainers2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Container container1 = new Container();
		Container container2 = new Container();

		while (true) {
			System.out.println("First: " + container1);
			System.out.println("Second: " + container2);

			String input = scan.nextLine();
			String[] arguments = input.split(" ");
			if (arguments[0].equals("quit")) {
				break;
			} else if (arguments[0].equals("add")) {
				container1.add(Integer.valueOf(arguments[1]));
			} else if (arguments[0].equals("move")) {
				int toMove = Integer.valueOf(arguments[1]);
				container2.add(Integer.min(container1.contains(), toMove));
				container1.remove(toMove);
			} else if (arguments[0].equals("remove")) {
				int toRemove = Integer.valueOf(arguments[1]);
				container2.remove(toRemove);
			}

		}
	}

}
