
public class Money {

	private final int euros;
	private final int cents;

	public Money(int euros, int cents) {
		while (cents < 0) {
			euros--;
			cents += 100;
		}

		while (cents >= 100) {
			euros++;
			cents -= 100;
		}

		if (euros < 0) {
			euros = 0;
			cents = 0;
		}

		this.euros = euros;
		this.cents = cents;
	}

	public int euros() {
		return this.euros;
	}

	public int cents() {
		return this.cents;
	}

	private int totalCents() {
		return this.cents + this.euros * 100;
	}

	public Money plus(Money addition) {
		return new Money(
			euros() + addition.euros(),
			cents() + addition.cents()
		);
	}

	public Money minus(Money decreaser) {
		return new Money(
			euros() - decreaser.euros(),
			cents() - decreaser.cents()
		);
	}

	public boolean lessThan(Money compared) {
		return totalCents() < compared.totalCents();
	}

	@Override
	public String toString() {
		String zero = "";
		if (this.cents < 10) {
			zero = "0";
		}

		return this.euros + "." + zero + this.cents + "e";
	}

}
