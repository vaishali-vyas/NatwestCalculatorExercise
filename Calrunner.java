package calculatorExerciseone;

public class Calrunner {

	public static void main(String[] args) {
		System.out.println(addTwo(388.67, 169.8999d));
		System.out.println(addTwo(980.35, 298.4788d));
		System.out.println(subTwo(867, 487));
		System.out.println(subTwo(1094, 1123));
		System.out.println(mulTwo(378.12, 47));
		System.out.println(mulTwo(497, 378));
		divTwo(35, 352);

	}

	public static double addTwo(double number1, double number2) {
		return number1 + number2;
	}

	public static double subTwo(double number1, double number2) {
		return number1 - number2;

	}

	public static double mulTwo(double number1, double number2) {
		return number1 * number2;
	}

	public static void divTwo(double number1, double number2) {

		if (number1 < number2) {
			System.out.println("division can not be performed");
		} else {
			double result = number1 / number2;
			System.out.println(result);
		}

	}

} // Class body ends
