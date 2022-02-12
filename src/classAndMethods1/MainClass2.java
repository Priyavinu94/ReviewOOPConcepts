package classAndMethods1;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FindLargest obj = new FindLargest();

//		System.out.println("Enter 3 numbers");
//		obj.num1 = sc.nextInt();	- storing the entered values in to the instance variable of class FindLargest
//		obj.num2 = sc.nextInt();
//		obj.num3 = sc.nextInt();

		int largest = obj.findLargest();	//method returns int value and storing in the variable
		System.out.println("The largest number is :" + largest);
		
		int largest2 = obj.findLargestAmongTwo(20, 30);	//calling method with parameters
		System.out.println("largest among two : "+ largest2);
		
		System.out.println("Enter 2 numbers");
		int numOne = sc.nextInt();
		int numTwo = sc.nextInt();
		int largest3 = obj.findLargestAmongTwo(numOne, numTwo);	//calling method with parameters
		System.out.println("largest among two : "+ largest3);
		
	
		
	}

}
