/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class PaymentCard {

	private double _balance;

	public PaymentCard(double initialBalance) {
		_balance = initialBalance;
	}

	@Override
	public String toString() {
		return "The card has a balance of " + _balance + " euros";
	}

	public void eatAffordably() {
		_balance -= _balance >= 2.60 ? 2.60 : 0;
	}

	public void eatHeartily() {
		_balance -= _balance >= 4.60 ? 4.60 : 0;
	}

	public void addMoney(double amount) {
		amount = Double.max(amount, 0);
		_balance += amount;
		if (_balance > 150) {
			_balance = 150;
		}
	}
}
