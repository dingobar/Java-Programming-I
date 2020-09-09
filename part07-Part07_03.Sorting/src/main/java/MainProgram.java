
import java.util.Arrays;
import static java.util.Comparator.comparingInt;
import java.util.stream.IntStream;

/**
 *
 * @author martin
 */
public class MainProgram {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// write your test code here
		int[] array = {3, 1, 5, 99, 3, 12};

		sort(array);

		Arrays.stream(array).forEach(System.out::println);
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			swap(array, i, indexOfSmallestFrom(array, i));
		}
	}

	/**
	 *
	 * @param array
	 * @return
	 */
	public static int smallest(int[] array) {
		return Arrays.stream(array).min().orElse(0);
	}

	/**
	 *
	 * @param array
	 * @param from
	 * @return
	 */
	public static int indexOfSmallestFrom(int[] array, int from) {
		return IntStream.range(from, array.length)
			.boxed()
			.min(comparingInt((i) -> array[i]))
			.orElse(0);
	}

	/**
	 *
	 * @param array
	 * @return
	 */
	public static int indexOfSmallest(int[] array) {
		return indexOfSmallestFrom(array, 0);
	}

	/**
	 *
	 * @param array
	 * @param index1
	 * @param index2
	 */
	public static void swap(int[] array, int index1, int index2) {
		int temp;
		temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
