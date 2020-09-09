
import java.time.Year;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int year = Integer.valueOf(scan.nextLine());
		boolean leapYear = Year.of(year).isLeap();
		
		if (leapYear) {
			System.out.println("The year is a leap year.");
		} else {
			System.out.println("The year is not a leap year.");
		}
	}
}
