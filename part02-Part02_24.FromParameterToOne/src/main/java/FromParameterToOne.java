
public class FromParameterToOne {

	public static void main(String[] args) {

	}

	public static void printFromNumberToOne(int number) {
		number = Math.abs(number);
		for (int i = number; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
