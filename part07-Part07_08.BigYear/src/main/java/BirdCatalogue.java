
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
public class BirdCatalogue {

	final ArrayList<Bird> birds;

	public BirdCatalogue() {
		this.birds = new ArrayList<>();
	}

	public void add(Bird bird) {
		birds.add(bird);
	}

	public Bird getBird(String species) {
		return birds.stream()
			.filter((b) -> b.getName().equals(species))
			.findAny()
			.orElse(null);
	}

	public ArrayList<Bird> getBirds() {
		return birds;
	}

}
