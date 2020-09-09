
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author martin
 */
public class UserInterface {

	private final Scanner sc;
	private final BirdCatalogue birdCatalogue;

	public UserInterface(Scanner sc) {
		this.sc = sc;
		this.birdCatalogue = new BirdCatalogue();
	}

	public void start(Scanner scan) {
		outer: while (true) {
			String command = commandPrompt();
			switch (command){
				case "Add":
					addBird();
					break;
				case "Observation":
					addObservation();
					break;
				case "All":
					allBirds();
					break;
				case "One":
					oneBird();
					break;
				default:
					break outer;
			}
		}
	}

	private String commandPrompt() {
		System.out.print("? ");
		return sc.nextLine();
	}
	
	private void addBird(){
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Name in Latin: ");
		String nameLatin = sc.nextLine();
		
		birdCatalogue.add(new Bird(name, nameLatin));
		
	}
	
	private void addObservation(){
		System.out.print("Bird? ");
		String name = sc.nextLine();
		
		Bird bird = birdCatalogue.getBird(name);
		
		try{
			bird.addObservation();
		} catch (NullPointerException e){
			System.out.println("Not a bird!");
		}
	}
	
	private void oneBird(){
		System.out.print("Bird? ");
		String name = sc.nextLine();
		
		Bird bird = birdCatalogue.getBird(name);
		
		if (bird!=null){
			System.out.println(bird);
		} else {
			System.out.println("Not a bird!");
		}
	}
	
	private void allBirds(){
		birdCatalogue.getBirds().forEach(System.out::println);
	}
}
