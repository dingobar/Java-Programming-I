
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class AgeOfTheOldest {

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

		Comparator<Person> comparator = Comparator.comparing(Person::getAge);
		Person oldestPerson = people.stream().max(comparator).get();
		
		System.out.println("Age of the oldest: " + oldestPerson.getAge());

	}
}
