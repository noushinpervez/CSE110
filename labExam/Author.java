package labExam;

import java.util.Scanner;

public class Author {
	String firstName;
	String lastName;
	
	public Author(String fN, String lN) {
		setFirstName(fN);
		setLastName(lN);
	}
	
	public void setFirstName(String fN) {
		firstName = fN;
	}
	
	public void setLastName(String lN) {
		lastName = lN;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return "The name of the author is " + firstName + " " + lastName;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name of the author: ");
		String fN = input.nextLine();
		System.out.println("Enter last name of the author: ");
		String lN = input.nextLine();
		
		Author a = new Author(fN, lN);
		System.out.println(a.toString());
	}
}