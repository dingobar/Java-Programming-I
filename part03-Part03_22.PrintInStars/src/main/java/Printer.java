
import java.util.stream.IntStream;

public class Printer {

	public static void main(String[] args) {
		// You can test the method here
		int[] array = {5, 1, 3, 4, 2};
		printArrayInStars(array);
	}

	public static void printArrayInStars(int[] array) {
		// Write some code in here
		for (int i : array) {
			StringBuilder sb = new StringBuilder();
			IntStream.range(0, i).forEach(x -> sb.append('*'));
			System.out.println(sb.toString());
		}
	}

}
