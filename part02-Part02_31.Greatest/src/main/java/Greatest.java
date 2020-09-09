
import java.util.Arrays;
import java.util.Collections;

public class Greatest {

	public static int greatest(int number1, int number2, int number3) {
		//write some code here
		int[] n = new int[]{number1, number2, number3};
		Arrays.sort(n);

		return n[n.length - 1];
	}

	public static void main(String[] args) {
		int result = greatest(2, 7, 3);
		System.out.println("Greatest: " + result);
	}
}
