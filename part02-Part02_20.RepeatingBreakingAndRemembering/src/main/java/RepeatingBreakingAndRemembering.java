
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

	public static void main(String[] args) {

		// This exercise is worth five exercise points, and it is 
		// gradually extended part by part.
		// If you want, you can send this exercise to the server
		// when it's just partially done. In that case the server will complain about 
		// the parts you haven't done, but you'll get points for the finished parts.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give numbers:");
		int lol = 0;
		int total = 0;
		int count = 0;
		int nEven = 0;

		while (true) {
			lol = Integer.valueOf(scanner.nextLine());
			if (lol == -1) {
				break;
			}
			count ++;
			total += lol;
			nEven += lol % 2 == 0 ? 1 : 0;
		}
		System.out.println("Thx bye!");
		System.out.println("Sum: " + total);
		System.out.println("Numbers: " + count);
		System.out.println("Average: " + (double) total / count);
		System.out.println("Even: " + nEven);
		System.out.println("Odd: " + (count - nEven));
	}
}
