package constructors;

public class Student {

	String name;
	int rollNo;
	double percentage;
	
	Student(){	//no-arg constructor
		System.out.println("This is the constructor");
		this.name = "Kamal";
	}
	
	Student(String name){
		this.name = name;
	}
	
	Student(String name, int rollNo){	//parameterized constructor
		this.name = name;
		this.rollNo = rollNo;
	}
	
		
	public Student(String name, int rollNo, double percentage) {
		this.name = name;
		this.rollNo = rollNo;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	boolean isPass(double totalPercentage) {
		if (totalPercentage > 35) {
			return true;
		}
		return false;
	}
	
}
