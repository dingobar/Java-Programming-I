
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfSmallest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			int input = Integer.valueOf(scanner.nextLine());
			if (input == 9999) {
				break;
			}

			list.add(input);
		}

		int n = Collections.min(list);

		System.out.println("Smallest number: " + n);

		printIndexPositions(list, n);
	}

	private static void printIndexPositions(ArrayList<Integer> numbers, int n) {
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == n) {
				System.out.println("Found at index: " + i);
			}
		}
	}
}
