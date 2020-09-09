/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Gift {

	private final String _name;
	private final int _weight;

	public Gift(String name, int weight) {
		_name = name;
		_weight = weight;
	}

	public String getName() {
		return _name;
	}

	public int getWeight() {
		return _weight;
	}

	@Override
	public String toString() {
		return _name + " (" + _weight + " kg)";
	}

}
