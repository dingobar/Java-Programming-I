
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author martin
 */
public class Recipe {

	private final String name;
	private final int cookingTime;
	private final ArrayList<Ingredient> ingredients;

	public Recipe(String name, int cookingTime, ArrayList<Ingredient> ingredients) {
		this.name = name;
		this.cookingTime = cookingTime;
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public int getCookingTime() {
		return cookingTime;
	}

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	public boolean hasIngredient(String ingredient) {
		return ingredients.stream()
			.anyMatch((s) -> s.getName().equals(ingredient));
	}

	@Override
	public String toString() {
		return getName() + ", cooking time: " + getCookingTime();
	}

}
