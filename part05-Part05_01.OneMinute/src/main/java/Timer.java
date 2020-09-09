/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Timer {

	private final ClockHand _seconds;
	private final ClockHand _hundreds;

	public Timer() {
		_seconds = new ClockHand(60);
		_hundreds = new ClockHand(100);
	}

	public void advance() {
		_hundreds.advance();
		if (_hundreds.value() == 0) {
			_seconds.advance();
		}
	}

	@Override
	public String toString() {
		return _seconds + ":" + _hundreds;
	}
}
