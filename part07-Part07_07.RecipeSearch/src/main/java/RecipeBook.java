
import java.util.ArrayList;

public class RecipeBook {

	private final ArrayList<Recipe> recipes;

	public RecipeBook() {
		recipes = new ArrayList<>();
	}

	void add(Recipe recipe) {
		recipes.add(recipe);
	}

	public void list() {
		printArrayList(recipes);
	}

	private static <E> void printArrayList(ArrayList<E> list) {
		list.forEach(System.out::println);
	}

	public void searchByName(String name) {
		recipes.stream()
			.filter((s) -> s.getName().contains(name))
			.forEach(System.out::println);
	}

	public void searchByCookingTime(int cookingTime) {
		recipes.stream()
			.filter((i) -> i.getCookingTime() <= cookingTime)
			.forEach(System.out::println);
	}

	public void searchByIngredient(String ingredient) {
		recipes.stream()
			.filter((r) -> r.hasIngredient(ingredient))
			.forEach(System.out::println);
	}
}
