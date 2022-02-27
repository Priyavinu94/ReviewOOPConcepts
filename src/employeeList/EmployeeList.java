package employeeList;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeList {

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList =  new ArrayList<Employee>();
		
		Employee emp1 = new Employee("Priya", 123, 2500.00);
		employeeList.add(emp1);
		
		Employee emp2 = new Employee("Vinod", 129, 3500.00);
		employeeList.add(emp2);
		
		Employee emp3 = new Employee("Divya", 243, 4653.30);
		employeeList.add(emp3);
		
		
		//print employee information at a particular index
		System.out.println("Employee List\n");
		for (Employee employee : employeeList) {
			System.out.println(employee.toString());
		}
		
		
		//add new employee to the list at index 1, and printing the info
		Employee emp4 =  new Employee("Rajeev", 421, 8970.00);
		employeeList.add(1, emp4);
		employeeList.get(employeeList.indexOf(emp4)).toString();
		
		//remove an employee from the list
		employeeList.remove(employeeList.indexOf(emp1));
		
		System.out.println("\nNew employee List\n");
		for (Employee employee : employeeList) {
			System.out.println(employee.toString());
		}
		
		//check if there exists an employee having ID 243 in the list and displays the info if exists
		System.out.println(" \nCheck if an employee exists in the list with ID 243");
		boolean isEmployeeInList = false;
		for (Employee employee : employeeList) {
			if (employee.getEmployeeID()==243) {
				isEmployeeInList = true;
				System.out.println(employee.toString());
				break;
			}
		}
		System.out.println(isEmployeeInList? "" : "Employee ID not found");
		
		
	}

}
