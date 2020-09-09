
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintInRange {

	public static void main(String[] args) {
		// Try your method here
	}

	public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
		List<Integer> numbersInRange = numbers.stream()
			.filter(x -> x >= lowerLimit && x <= upperLimit)
			.collect(Collectors.toList());

		numbersInRange.forEach((i) -> {
			System.out.println(i);
		});
	}

}
