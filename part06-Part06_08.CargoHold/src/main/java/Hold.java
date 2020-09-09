
import java.util.ArrayList;

public class Hold {

	private final int _maxWeight;
	private final ArrayList<Suitcase> _suitcases;

	public Hold(int maxWeight) {
		_maxWeight = maxWeight;
		_suitcases = new ArrayList();
	}

	public int totalWeight() {
		return _suitcases.stream().mapToInt((i) -> i.totalWeight()).sum();
	}

	public void addSuitcase(Suitcase suitcase) {
		if ((totalWeight() + suitcase.totalWeight()) <= _maxWeight) {
			_suitcases.add(suitcase);
		}
	}

	@Override
	public String toString() {
		String noun;
		if (_suitcases.size() > 1) {
			noun = _suitcases.size() + " suitcases";
		} else if (_suitcases.size() == 1) {
			noun = "1 suitcase";
		} else {
			noun = "no suitcases";
		}
		return noun + " (" + totalWeight() + " kg)";
	}

	public void printItems() {
		_suitcases.forEach((i) -> i.printItems());
	}
}
