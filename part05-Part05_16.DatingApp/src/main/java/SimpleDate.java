
public class SimpleDate {

	private int day;
	private int month;
	private int year;

	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void advance(int howManyDays) {
		int days;
		int months;
		int years;

		years = howManyDays / 365;
		months = (howManyDays - years * 365) / 12;
		days = howManyDays - (months * 12 + years * 365);

		year += years;
		month += months;
		day += days;

		if (day > 30) {
			day -= 30;
			month++;
		}

		if (month > 12) {
			month -= 12;
			year++;
		}
	}

	public void advance() {
		advance(1);
	}

	public SimpleDate afterNumberOfDays(int days) {
		SimpleDate newDate = new SimpleDate(day, month, year);
		newDate.advance(days);
		return newDate;
	}

	@Override
	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean before(SimpleDate compared) {
		if (this.year < compared.year) {
			return true;
		}

		if (this.year == compared.year && this.month < compared.month) {
			return true;
		}

		if (this.year == compared.year && this.month == compared.month
			&& this.day < compared.day) {
			return true;
		}

		return false;
	}

}
