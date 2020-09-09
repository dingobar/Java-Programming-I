/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Gauge {

	private int _value;

	public Gauge() {
		_value = 0;
	}

	public void increase() {
		if (_value < 5) {
			_value++;
		}
	}

	public void decrease() {
		_value = _value-- < 0 ? 0 : _value--;
	}

	public boolean full() {
		return _value == 5;
	}

	public int value() {
		return _value;
	}
}
