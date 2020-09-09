/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Bird {

	private final String name;
	private final String nameLatin;
	private int observations;

	public Bird(String species, String nameLatin) {
		this.name = species;
		this.nameLatin = nameLatin;
		this.observations = 0;
	}

	public void addObservation() {
		this.observations++;
	}

	public String getName() {
		return name;
	}

	public String getNameLatin() {
		return nameLatin;
	}

	public int getObservations() {
		return observations;
	}

	@Override
	public String toString() {
		return getName()
			+ " (" + getNameLatin() + "): "
			+ getObservations()
			+ " observations";
	}

}
