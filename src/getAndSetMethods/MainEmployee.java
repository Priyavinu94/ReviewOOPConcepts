package getAndSetMethods;

import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		Employee emp2 = new Employee();

		System.out.println("Directly calling the variable using object reference");
		emp.name = "Neeru";
		System.out.println("Name :" + emp.name);

		System.out.println("Calling method to update the variable Name");
		emp.setName("Kamal");
		System.out.println("Name :" + emp.getName());
		
		Scanner sc = new Scanner(System.in);
		
		//updating and retrieving value of salary variable
		System.out.println("Setting the salary");
		
		System.out.println("Enter the salary");
		double empSalary = sc.nextDouble();	//setting the user input value
		emp.setSalary(empSalary);
		System.out.println("The employee salary is " + emp.getSalary());	//retrieving using get method
		
		System.out.println("Enter employee ID");
		emp.setEmpId(sc.nextInt());	//setting user input 
		System.out.println("Updated Salary is " + emp.getEmpId());	//retrieving the set value
	}

}
