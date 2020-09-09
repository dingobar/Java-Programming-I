/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Dog {

	final private String name;
	final private String breed;
	final private int age;

	public Dog(String _name, String _breed, int _age) {
		name = _name;
		breed = _breed;
		age = _age;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

}
