
public class AdvancedAstrology {

	public static void printStars(int number) {
		// part 1 of the exercise
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < number; i++) {
			sb.append('*');
		}
		System.out.println(sb.toString());
	}

	public static void printSpaces(int number) {
		// part 1 of the exercise
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < number; i++) {
			sb.append(' ');
		}
		System.out.print(sb.toString());
	}

	public static void printTriangle(int size) {
		// part 2 of the exercise
		for (int i = 1; i <= size; i++) {
			printSpaces(size - i);
			printStars(i);
		}
	}

	public static void christmasTree(int height) {
		// part 3 of the exercise
		int greenHeight = height;


		// Print the green part of the tree
		for (int i = 1; i <= greenHeight; i++) {
			printSpaces(greenHeight - i);
			printStars(1 + 2 * (i - 1));
		}

		// Print the base of the tree
		int spaces = greenHeight - 2;
		printSpaces(spaces);
		printStars(3);
		printSpaces(spaces);
		printStars(3);
	}

	public static void main(String[] args) {
		// The tests are not checking the main, so you can modify it freely.

		printTriangle(5);

		for (int i = 3; i < 10; i++) {
			christmasTree(i);
			System.out.println("");
		}
	}
}
