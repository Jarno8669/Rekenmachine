package Calculator;
public class CalculatorMain {
public static void main(String[] args) {
	Calculator MainCalculator = new Calculator();
	
	// +
	System.out.println("Dit is de + methode.");
	System.out.println(MainCalculator.add(2, 1));
	System.out.println();

	// -
	
		System.out.println("Dit is de - methode.");
	System.out.println(MainCalculator.subtract(2, 1));
	System.out.println();
	
	// *
	System.out.println("Dit is de * methode.");
	System.out.println(MainCalculator.multply(3, 3));
	System.out.println();
	
	// :
	System.out.println("Dit is de : methode.");
	System.out.println(MainCalculator.devide(30, 2));
	System.out.println();
	
	// 5^5
	System.out.println("Dit is de 5^5 methode.");
	System.out.println(MainCalculator.square(5));
	System.out.println();
	
	// 5^8
	System.out.println("Dit is de 5^8 methode.");
	System.out.println(MainCalculator.exponentiation(9, 7));
	System.out.println();
}
}
