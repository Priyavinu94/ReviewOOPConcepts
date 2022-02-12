package classAndMethods1;

public class FindLargest {

	int num1, num2, num3;

	// with return type, no arguments

	int findLargest() {
		if (num1 > num2) {
			if (num1 > num3) {
				return num1;
			} else {
				return num3;
			}
		} else {
			if (num2 > num3) {
				return num2;
			} else {
				return num3;
			}
		}
	}

	int findLargestAmongTwo(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
}
