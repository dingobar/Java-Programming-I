
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("File to read: ");
		String filename = scanner.nextLine();
		RecipeBook recipes = readRecipes(new File(filename));
		System.out.println("\nCommands:\n"
			+ "list - lists the recipes\n"
			+ "stop - stops the program\n"
			+ "find name - searches recipes by name\n" 
			+ "find cooking time - searches recipes by cooking time\n"
			+ "find ingredient - searches recipes by ingredient\n"
			+ "\n");
		

		String command;
		inputLoop:
		while (true) {
			System.out.print("Enter command: ");
			command = scanner.nextLine();
			switch (command) {
				case "list":
					recipes.list();
					break;
				case "find name":
					System.out.print("Searched word: ");
					String name = scanner.nextLine();
					recipes.searchByName(name);
					break;
				case "find cooking time":
					System.out.print("Max cooking time: ");
					int time = Integer.valueOf(scanner.nextLine());
					recipes.searchByCookingTime(time);
					break;
				case "find ingredient":
					System.out.print("Ingredient: ");
					String ingredient = scanner.nextLine();
					recipes.searchByIngredient(ingredient);
				default:
					break inputLoop;
			}
			System.out.println("");
		}
		

	}

	public static RecipeBook readRecipes(File file) {
		try {
			Scanner sc = new Scanner(file);
			RecipeBook recipes = parseTextToRecipeBook(sc);
			return recipes;
		} catch (FileNotFoundException e){
			return null;
		}
	}
	
	private static RecipeBook parseTextToRecipeBook(Scanner sc){
		String name;
		int duration;
		String ingredientInput;
		RecipeBook recipes = new RecipeBook();

		while (sc.hasNextLine()) {
			name = sc.nextLine();
			duration = Integer.valueOf(sc.nextLine());
			ArrayList<Ingredient> ingredients = new ArrayList<>();
			do {
				ingredientInput = sc.nextLine();
				ingredients.add(new Ingredient(ingredientInput));
			} while (!ingredientInput.isEmpty() && sc.hasNextLine());
			recipes.add(new Recipe(name, duration, ingredients));
		}
		return recipes;
	}
	

}
