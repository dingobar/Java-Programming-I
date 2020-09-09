
public class PaymentTerminal {

	private double money;  // amount of cash
	private int affordableMeals; // number of sold affordable meals
	private int heartyMeals;  // number of sold hearty meals

	public PaymentTerminal() {
		// register initially has 1000 euros of money
		money = 1000;
	}

	public double eatAffordably(double payment) {
		// an affordable meal costs 2.50 euros
		// increase the amount of cash by the price of an affordable mean and return the change
		// if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
		double price = 2.50;
		Meal affordableMeal = new Meal("affordable", 2.50);
		return pay(payment, affordableMeal);
	}

	public double eatHeartily(double payment) {
		// a hearty meal costs 4.30 euros
		// increase the amount of cash by the price of a hearty mean and return the change
		// if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
		Meal heartyMeal = new Meal("hearty", 4.30);
		return pay(payment, heartyMeal);

	}

	private double pay(double payment, Meal meal) {
		if (payment >= meal.getPrice()) {
			money += meal.getPrice();
			if (meal.getType().equals("hearty")) {
				heartyMeals++;
			} else {
				affordableMeals++;
			}

			return payment - meal.getPrice();
		} else {
			return payment;
		}
	}

	public boolean eatAffordably(PaymentCard card) {
		// an affordable meal costs 2.50 euros
		// if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
		// otherwise false is returned
		return pay(card, new Meal("affordable", 2.50));
	}

	public boolean eatHeartily(PaymentCard card) {
		// a hearty meal costs 4.30 euros
		// if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
		// otherwise false is returned
		return pay(card, new Meal("hearty", 4.30));
	}

	private boolean pay(PaymentCard card, Meal meal) {
		if (card.balance() >= meal.getPrice()) {
			card.takeMoney(meal.getPrice());
			if (meal.getType().equals("hearty")) {
				heartyMeals++;
			} else {
				affordableMeals++;
			}
			return true;
		}
		return false;
	}

	public void addMoneyToCard(PaymentCard card, double sum) {
		if (sum > 0) {
			money += sum;
			card.addMoney(sum);
		}

	}

	@Override
	public String toString() {
		return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
	}
}
