package getAndSetMethods;

public class Employee {
	
	String name;
	int empId;
	double salary;
	
	//get method -- to get or retrieve the value of a variable
	//set method -- to update the value of a variable
	
	String getName() {
		return name;
	}
	void setName(String name){
		this.name = name;
	}
	
	int getEmpId() {
		return empId;
	}
	
	void setEmpId(int newEmpId) {
		empId = newEmpId;
	}
	
	double getSalary() {
		return salary;
	}
	
	void setSalary(double newSalary) {
		salary = newSalary;
	}
}
