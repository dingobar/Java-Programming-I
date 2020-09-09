
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Person> people = new ArrayList<>();

		while (true) {
			String input = scanner.nextLine();
			if (input.equals("")) {
				break;
			}
			String[] inputWords = input.split(",");
			Person person = new Person(inputWords[0], Integer.valueOf(inputWords[1]));
			people.add(person);
		}

		Comparator<Person> comparator = Comparator.comparing(p -> p.getName().length());
		String longestName = people.stream().max(comparator).get().getName();
		double averageBirthYear = people.stream()
			.mapToDouble(Person::getAge)
			.average()
			.orElse(Double.NaN);

		System.out.println("Longest name: " + longestName);
		System.out.println("Average of the birth years: " + averageBirthYear);

	}
}
