/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Meal {

	private final String _type;
	private final double _price;

	public Meal(String type, double price) {
		_type = type;
		_price = price;
	}

	public String getType() {
		return _type;
	}

	public double getPrice() {
		return _price;
	}
}
