
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 3;
		array[2] = 5;
		array[3] = 7;
		array[4] = 9;

		int index = 0;
		while (index < array.length) {
			System.out.println(array[index]);
			index++;
		}
		System.out.println("");

		// Implement here
		// asking for the two indices
		// and then swapping them
		int i = Integer.valueOf(scanner.nextLine());
		int j = Integer.valueOf(scanner.nextLine());
		swapIndices(array, i, j);

		System.out.println("");
		for (int n : array) {
			System.out.println(n);
		}
	}

	private static void swapIndices(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
