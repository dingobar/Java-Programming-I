/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Multiplier {

	final private int _number;

	public Multiplier(int number) {
		_number = number;
	}

	public int multiply(int number) {
		return number * _number;
	}
}
