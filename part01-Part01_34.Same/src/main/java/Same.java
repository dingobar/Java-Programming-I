
import java.util.Scanner;

public class Same {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Password?");
		String msg1 = String.valueOf(scan.nextLine());
		String msg2 = String.valueOf(scan.nextLine());

		if (msg1.equals(msg2)) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
	}
}
