package employeeList;

public class Employee {

	private String employeeName;
	private int employeeID;
	private double employeeSalary;

	public Employee(String employeeName, int employeeID, double employeeSalary) {
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public String toString() {
		return "Name: " + employeeName + "	ID: " + employeeID + " 	Salary: " + employeeSalary;
	}

}
