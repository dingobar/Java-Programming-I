/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Fitbyte {

	private final int _age;
	private final int _restingHeartRate;
	private final double _maximumHeartRate;

	public Fitbyte(int age, int restingHeartRate) {
		_age = age;
		_restingHeartRate = restingHeartRate;
		_maximumHeartRate = 206.3 - (0.711 * _age);
	}

	public double targetHeartRate(double percentageOfMaximum) {
		return (_maximumHeartRate - _restingHeartRate)
			* (percentageOfMaximum) + _restingHeartRate;
	}
}
