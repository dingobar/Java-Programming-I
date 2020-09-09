/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Counter {

	private int _value;

	public Counter(int startValue) {
		_value = startValue;
	}

	public Counter() {
		this(0);
	}

	public int value() {
		return _value;
	}

	public void increase(int value) {
		_value += value > 0 ? value : 0;
	}

	public void increase() {
		increase(1);
	}

	public void decrease(int value) {
		_value -= value > 0 ? value : 0;
	}

	public void decrease() {
		decrease(1);
	}
}
