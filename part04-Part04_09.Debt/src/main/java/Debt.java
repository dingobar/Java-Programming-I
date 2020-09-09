/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Debt {

	private double _balance;
	private final double _interestRate;

	public Debt(double initialBalance, double initialInterestRate) {
		_balance = initialBalance;
		_interestRate = initialInterestRate;
	}

	public void printBalance() {
		System.out.println(_balance);
	}

	public void waitOneYear() {
		_balance *= _interestRate;
	}
}
