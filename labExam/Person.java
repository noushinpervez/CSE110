package labExam;

import java.util.Scanner;

public abstract class Person {
	String name;
	String email;
	int phone;
	
	Scanner input;

	public void addNew() {
		input = new Scanner(System.in);
		System.out.println("Enter new Information");
		System.out.print("Name: ");
		name = input.nextLine();
		System.out.print("Email: ");
		email = input.nextLine();
		System.out.println("Phone: ");
		phone = input.nextInt();
	}
	
	public abstract void insert();
	public abstract void showAll();
}