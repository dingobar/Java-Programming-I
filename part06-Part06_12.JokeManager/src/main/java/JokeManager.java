
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

	private final ArrayList<String> jokes;
	private final Random randomizer;

	public JokeManager() {
		jokes = new ArrayList();
		randomizer = new Random();
	}

	public void addJoke(String joke) {
		jokes.add(joke);
	}

	public String drawJoke() {
		try {
			return jokes.get(randomizer.nextInt(jokes.size()));
		} catch (Exception e) {
			return "Jokes are in short supply.";
		}

	}

	public void printJokes() {
		jokes.forEach(System.out::println);
	}
}
