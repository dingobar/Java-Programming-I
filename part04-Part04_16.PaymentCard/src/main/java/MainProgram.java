
public class MainProgram {

	public static void main(String[] args) {
		PaymentCard paulsCard = new PaymentCard(20);
		PaymentCard mattsCard = new PaymentCard(30);

		// write code here
		//    Create Paul's card. The opening balance of the card is 20 euros
		//    Create Matt's card. The opening balance of the card is 30 euros
		//    Paul eats heartily
		paulsCard.eatHeartily();
		//    Matt eats affordably
		mattsCard.eatAffordably();
		//    The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
		System.out.println("Paul: " + paulsCard);
		System.out.println("Matt: " + mattsCard);
		//    Paul tops up 20 euros
		paulsCard.addMoney(20);
		//    Matt eats heartily
		mattsCard.eatHeartily();
		//    The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
		System.out.println("Paul: " + paulsCard);
		System.out.println("Matt: " + mattsCard);
		//    Paul eats affordably
		paulsCard.eatAffordably();
		paulsCard.eatAffordably();
		//    Paul eats affordably
		//    Matt tops up 50 euros
		mattsCard.addMoney(50);
		//    The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
		System.out.println("Paul: " + paulsCard);
		System.out.println("Matt: " + mattsCard);
	}
}
