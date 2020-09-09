
import java.util.ArrayList;

public class Menu {

	private final ArrayList<String> meals;

	public Menu() {
		meals = new ArrayList<>();
	}

	// implement the required methods here
	public void addMeal(String meal) {
		if (!meals.contains(meal)) {
			meals.add(meal);
		}
	}

	public void printMeals() {
		meals.stream().forEach(System.out::println);
	}

	public void clearMenu() {
		meals.clear();
	}
}
