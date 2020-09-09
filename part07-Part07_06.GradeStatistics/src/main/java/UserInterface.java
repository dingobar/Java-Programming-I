
import java.util.Scanner;

public class UserInterface {

	private final Scanner scanner;

	public UserInterface(Scanner scanner) {
		this.scanner = scanner;
	}

	public void start() {
		int input;
		Exam exam = new Exam();
		while (true) {
			input = readInputInteger();
			if (input == -1) {
				break;
			}
			exam.add(new ExamResult(input));
		}

		exam.printGradeStatistics();
	}

	private int readInputInteger() {
		try {
			return Integer.valueOf(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid input!");
			return -1;
		}
	}

}
