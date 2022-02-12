package classAndMethods1;

public class MainClass {

	public static void main(String[] args) {

		// Classname object_referencename = new Classname();
		Student obj = new Student(); // creating an object or instantiating the class
		// when an object is created, all instance variables are initialized

		obj.name = "Kamal"; // calling instance variables using object reference
		obj.age = 24;
		obj.percentage = 90.5;

		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.percentage);

		obj.study("Priya"); // call method by object reference

		MathOperation math = new MathOperation(); // instantiating MathOperation Class
		math.addNumbers(); // void method with no arguments
		math.addTwoNumbers(45, 55); // void method with arguments
		math.addingNumbers(); // return type double, no arguments

		double sum = math.addingNumbers();
		double sum2 = math.addingTwoNumbers(34.5, 34.6);
		System.out.println("Sum = " + sum);
		System.out.println("Sum2 = " + sum2);
	}

}
