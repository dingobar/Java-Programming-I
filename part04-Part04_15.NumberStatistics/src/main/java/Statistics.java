
public class Statistics {

	private int _count;
	private int _sum;

	public Statistics() {
		// initialize the variable numberCount here
		_count = 0;
		_sum = 0;
	}

	public void addNumber(int number) {
		// write code here
		_count++;
		_sum += number;
	}

	public int getCount() {
		// write code here
		return _count;
	}

	public int sum() {
		return _sum;
	}

	public double average() {
		return 1.0 * _sum / (_count == 0 ? 1 : _count);
	}
}
