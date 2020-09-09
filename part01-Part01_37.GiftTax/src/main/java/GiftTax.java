
import java.util.AbstractMap;
import java.util.Scanner;

public class GiftTax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valueOfGift = Double.valueOf(scan.nextLine());
		double tax = calculateTax(valueOfGift);
		if (tax > 0) {
			System.out.println("Tax: " + tax);
		} else {
			System.out.println("No tax!");
		}

	}

	public static double calculateTax(double valueOfGift) {
		double[] tax = getLowerLimit(valueOfGift);
		return (tax[0] + tax[1] * (valueOfGift - tax[2]));
	}

	public static double[] getLowerLimit(double valueOfGift) {
		if (valueOfGift >= 1e6) {
			return new double[]{142100.0, 0.17, 1000e3};
		} else if (valueOfGift >= 2e5) {
			return new double[]{22100.0, 0.15, 200e3};
		} else if (valueOfGift >= 55000) {
			return new double[]{4700.0, 0.12, 55e3};
		} else if (valueOfGift >= 25000) {
			return new double[]{1700.0, 0.10, 25e3};
		} else if (valueOfGift >= 5000) {
			return new double[]{100.0, 0.08, 5e3};
		} else {
			return new double[]{0.0, 0.0, 5000};
		}
	}
}
