
public class Person {

	private String name;
	private SimpleDate birthday;
	private int height;
	private int weight;

	public Person(String name, SimpleDate birthday, int height, int weight) {
		this.name = name;
		this.birthday = birthday;
		this.height = height;
		this.weight = weight;
	}

	// implement an equals method here for checking the equality of objects
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Person)) {
			return false;
		}

		if (this == other) {
			return true;
		}

		Person comparedPerson = (Person) other;

		return name.equals(comparedPerson.name)
			&& birthday.equals(comparedPerson.birthday)
			&& height == comparedPerson.height
			&& weight == comparedPerson.weight;
	}
}
