
import java.util.ArrayList;
import java.util.stream.IntStream;

public class TodoList {

	private final ArrayList<String> tasks;

	public TodoList() {
		tasks = new ArrayList();
	}

	public void add(String task) {
		tasks.add(task);
	}

	public void print() {
		IntStream.range(1, tasks.size() + 1).forEach((i) -> {
			System.out.println(i + ": " + tasks.get(i - 1));
		});
	}

	public void remove(int number) {
		tasks.remove(number - 1);
	}
}
