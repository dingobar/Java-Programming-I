
import java.util.ArrayList;

public class SimpleCollection {

	private final String name;
	private final ArrayList<String> elements;

	public SimpleCollection(String name) {
		this.name = name;
		this.elements = new ArrayList<>();
	}

	public void add(String element) {
		this.elements.add(element);
	}

	public ArrayList<String> getElements() {
		return this.elements;
	}

	@Override
	public String toString() {
		if (elements.isEmpty()) {
			return "The collection " + name + " is empty.";
		} else {
			int size = elements.size();
			StringBuilder sb = new StringBuilder();
			sb.append("The collection ")
				.append(name)
				.append(" has ")
				.append(elements.size())
				.append(" element")
				.append(elements.size() > 1 ? "s" : "")
				.append(":\n");
			elements.forEach((i) -> {
				sb.append(i).append("\n");
			});
			return sb.toString().replaceAll("\n+$", "");
		}
	}

}
