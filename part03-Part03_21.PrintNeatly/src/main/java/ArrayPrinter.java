
import java.util.Arrays;

public class ArrayPrinter {

	public static void main(String[] args) {
		// You can test your method here
		int[] array = {5, 1, 3, 4, 2};
		printNeatly(array);
	}

	public static void printNeatly(int[] array) {
		// Write some code in here
		String lol = Arrays
			.stream(array)
			.mapToObj(String::valueOf)
			.reduce((a, b) -> a.concat(", ").concat(b))
			.get();
		System.out.println(lol);
	}
}
