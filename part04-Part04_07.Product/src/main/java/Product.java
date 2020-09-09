/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Product {

	final private String _name;
	final private double _price;
	final private int _quantity;

	public Product(String name, double price, int quantity) {
		_name = name;
		_price = price;
		_quantity = quantity;
	}
	
	public void printProduct(){
		System.out.println(_name + ", price " + _price + ", " + _quantity + " pcs");
	}

}
