package constructors;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		/*
		 * constructor is called when an object is created used to initialize the value
		 * of instance variables it is very similar to methods constructor does not have
		 * a return type has same name as that of a class if not explicitly declared,
		 * java provides default constructor, which will initialize variables with
		 * default values
		 */
		
		Student student2 = new Student("Neeru", 123);
		student2.setPercentage(89.55);
		System.out.println(student2.getName());
		System.out.println(student2.getRollNo());
		System.out.println(student2.getPercentage());
		
		
	}

}
