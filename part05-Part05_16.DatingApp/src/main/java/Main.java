
public class Main {

	public static void main(String[] args) {
		// test your program here!
		SimpleDate d = new SimpleDate(1, 1, 2020);
		d.advance(1000*365);
		System.out.println(d);
	}
}
