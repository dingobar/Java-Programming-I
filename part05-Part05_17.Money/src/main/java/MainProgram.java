
public class MainProgram {

	public static void main(String[] args) {
		// test your class here
		Money firstMoneyObject = new Money(1, 50);
		Money secondMoneyObject = new Money(0, 401);
		Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
		firstMinusSecond.euros();
		//Should be 2
		System.out.println(firstMinusSecond);
		
		System.out.println(new Money(5,219));
		System.out.println(new Money(2,-119));
	}
}
