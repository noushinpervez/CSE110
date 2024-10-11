package labExam;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1. Add a new student");
			System.out.println("2. Add a new instructors");
			System.out.println("3. Add a new clerk");
			System.out.println("4. Show all students");
			System.out.println("5. Show all instructors");
			System.out.println("6. Show all clerks");
			System.out.println("9. Exit");
			System.out.println("--------------------------------------------");
			System.out.print("Enter an option from above choices: ");
			int selectedOption = input.nextInt();
			System.out.println();
			if(selectedOption==9) {
				System.out.println("Program is terminating.....");
				break;
			}
			switch(selectedOption) {
				case 1:
					Student si = new Student();
					si.addNew();	// using DataOutputStream
					break;
				case 2:
					Instructor ii = new Instructor();	// using DataOutputStream
					ii.addNew();
					break;
				case 3:
					Clerk ci = new Clerk();		// using BufferedOutputStream
					ci.addNew();
					break;
				case 4:
					Student so = new Student();
					so.showAll();	// using DataInputStream
					break;
				case 5:
					Instructor io = new Instructor();	
					io.showAll();	// using DataInputStream
					break;
				case 6:
					Clerk co = new Clerk();		// using BufferedInputStream
					co.showAll();
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
		}
		input.close();
	}
}