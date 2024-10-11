package lab5_Chapter9;

public class Student {
	private int id;
	private String name;
	private java.util.Date dateCreated;
	
	public Student(int ssn, String newName) {
		id = ssn;
		name = newName;
		dateCreated = new java.util.Date();
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public static void main(String[] args) {
		Student student = new Student(111223333, "John");
		java.util.Date dateCreated = student.getDateCreated();
		dateCreated.setTime(200000); // dateCreated field is changed
		System.out.println("Id: " + student.getId() + "\nName: " + student.getName() + "\nDate Created: " + student.getDateCreated());
	}
}