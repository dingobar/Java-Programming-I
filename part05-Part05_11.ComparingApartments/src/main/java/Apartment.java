
public class Apartment {

	private int rooms;
	private int squares;
	private int princePerSquare;

	public Apartment(int rooms, int squares, int pricePerSquare) {
		this.rooms = rooms;
		this.squares = squares;
		this.princePerSquare = pricePerSquare;
	}

	public int getSquares() {
		return squares;
	}

	public boolean largerThan(Apartment compared) {
		return squares > compared.getSquares();
	}

	public int getPrice() {
		return squares * princePerSquare;
	}

	public int priceDifference(Apartment compared) {
		return Math.abs(getPrice() - compared.getPrice());
	}

	public boolean moreExpensiveThan(Apartment compared) {
		return getPrice() > compared.getPrice();
	}

}
