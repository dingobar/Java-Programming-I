
import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {

	private final ArrayList<Item> _items;
	private final int _maxWeight;

	public Suitcase(int maxWeight) {
		_maxWeight = maxWeight;
		_items = new ArrayList();
	}

	public void addItem(Item item) {
		if ((totalWeight() + item.getWeight()) <= _maxWeight) {
			_items.add(item);
		}
	}

	public int totalWeight() {
		return _items.stream().mapToInt((i) -> i.getWeight()).sum();
	}

	@Override
	public String toString() {
		String noun;
		if (_items.size() > 1) {
			noun = _items.size() + " items";
		} else if (_items.size() == 1) {
			noun = "1 item";
		} else {
			noun = "no items";
		}
		return noun + " (" + totalWeight() + " kg)";
	}

	public void printItems() {
		_items.forEach(System.out::println);
	}

	public Item heaviestItem() {
		return _items.stream()
			.max(Comparator.comparingInt((p) -> p.getWeight()))
			.orElse(null);
	}
}
