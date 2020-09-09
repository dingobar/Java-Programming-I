
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			int input = Integer.valueOf(scanner.nextLine());
			if (input == -1) {
				break;
			}

			list.add(input);
		}

		System.out.print("Search for? ");
		int n = Integer.valueOf(scanner.nextLine());
		
		printIndexPositions(list, n);
	}

	private static void printIndexPositions(ArrayList<Integer> numbers, int n) {
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == n) {
				System.out.println(n + " is at index " + i);
			}
		}
	}
}
