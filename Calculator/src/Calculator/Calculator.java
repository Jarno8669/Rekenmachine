 package Calculator;

public class Calculator {

	// Add opdracht

	public static int add(int number1, int number2) {

		int antwoord = number1 + number2;
		return antwoord;
	}

	// Subtract opdracht

	public static int subtract(int number1, int number2) {
		int antwoordsubtract = number1 - number2;
		return antwoordsubtract;
	}

	// Multiply opdracht

	public static int multply(int number1, int number2) {
		int antwoordmultply = 0;

		int a2 = 0;
		for (int m = 1; m <= number1; m++) {
			;

			for (int m2 = 2; m2 <= number2; m2++) {
				a2++;
			}

		}
		antwoordmultply = number1 + a2;
		return antwoordmultply;
	}

// Devide opdracht	

	public static int devide(int number1, int number2) {
		int antwoorddevide = 0;
		int na2 = 0;
		for (int nu1 = 1; nu1 <= number1;) {
			;
			nu1 = nu1 + number2;
			na2++;
		}
		antwoorddevide = na2;
		return antwoorddevide;
	}

	// Square opdracht Kwadraat ²

	public static int square(int number1) {
		Calculator MainCalculator = new Calculator();
		return Calculator.multply(number1, number1);
	}

//Exponentiation opdracht

	public static int exponentiation(int number1, int number2) {
		int e2 = number1;
		int antwoordexponentiation = 0;
		Calculator MainCalculator = new Calculator();
		for (int e1 = 2; e1 <= number2; e1++) {
			number1 = Calculator.multply(number1, e2);

		}
		antwoordexponentiation = number1;
		return antwoordexponentiation;
	}
}
