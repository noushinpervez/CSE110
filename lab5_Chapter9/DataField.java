package lab5_Chapter9;

public class DataField {
	String name;
	int age;
	boolean isScienceMajor;
	char gender;
	
	public static void main(String[] args) {
		// printing default values for each data types initialized in data field
		DataField s = new DataField();
		System.out.println("Name? " + s.name);
		System.out.println("Age? " + s.age);
		System.out.println("is Science Major? " + s.isScienceMajor);
		System.out.println("Gender? " + s.gender);
	}
}