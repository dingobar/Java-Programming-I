
import java.util.Scanner;

public class LiquidContainers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int container1 = 0;
		int container2 = 0;

		while (true) {
			System.out.println("First: " + container1 + "/100");
			System.out.println("Second: " + container2 + "/100");

			String input = scan.nextLine();
			String[] arguments = input.split(" ");
			if (arguments[0].equals("quit")) {
				break;
			} else if (arguments[0].equals("add")) {
				container1 += Integer.max(
					Integer.valueOf(arguments[1]),
					0
				);
				container1 = container1 > 100 ? 100 : container1;
			} else if (arguments[0].equals("move")) {
				int toMove = Integer.max(
					Integer.valueOf(arguments[1]),
					0
				);
				toMove = toMove > container1 ? container1 : toMove;

				container2 = Integer.min(
					container2 + toMove, 100
				);
				container1 = Integer.max(container1 - toMove, 0);
			} else if (arguments[0].equals("remove")) {
				int toRemove = Integer.max(
					Integer.valueOf(arguments[1]),
					0
				);

				container2 = Integer.max(container2 - toRemove, 0);
			}

		}
	}

}
