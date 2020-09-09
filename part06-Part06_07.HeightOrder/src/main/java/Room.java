
import java.util.ArrayList;
import java.util.Comparator;

public class Room {

	ArrayList<Person> _people;

	public Room() {
		_people = new ArrayList();
	}

	public void add(Person person) {
		_people.add(person);
	}

	public boolean isEmpty() {
		return _people.isEmpty();
	}

	public ArrayList<Person> getPersons() {
		return _people;
	}

	public Person shortest() {
		return _people.stream()
			.min(Comparator.comparingInt((p) -> p.getHeight()))
			.orElse(null);
	}

	public Person take() {
		Person shortestPerson = shortest();
		_people.remove(shortestPerson);
		return shortestPerson;
	}
}
