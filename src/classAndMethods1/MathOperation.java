package classAndMethods1;

public class MathOperation {

	double num1;
	double num2;

	void addNumbers() {
		System.out.println(num1 + num2);
	}

	void addTwoNumbers(double numOne, double numTwo) {
		System.out.println(numOne + numTwo);
	}

	// without arguments, has a return value

	double addingNumbers() {
		return num1 + num2;
	}

	double addingTwoNumbers(double numOne, double numTwo) {
		return numOne + numTwo;
	}
}
