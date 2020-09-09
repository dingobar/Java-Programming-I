/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Person {

	final private String _name;
	final private int _age;

	public Person(String name, int age) {
		_name = name;
		_age = age;
	}

	@Override
	public String toString() {
		return _name + ", age: " + _age + (_age == 1 ? " year" : " years");
	}
}
