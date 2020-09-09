
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class IndexWasNotFound {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		array[0] = 6;
		array[1] = 2;
		array[2] = 8;
		array[3] = 1;
		array[4] = 3;
		array[5] = 0;
		array[6] = 9;
		array[7] = 7;

		int searching = Integer.valueOf(scanner.nextLine());

		// Implement the search functionality here
		int[] indices;
		indices = IntStream.range(0, array.length)
			.filter(i -> array[i] == searching)
			.toArray();

		if (indices.length > 0) {
			System.out.println(searching + " is at index " + indices[0] + ".");
		} else {
			System.out.println(searching + " was not found.");
		}
	}

}
