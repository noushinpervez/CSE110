package project;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");

	    int number;
	    System.out.print("Please enter a number:\n");
	    Scanner input = new Scanner(System.in);
		number = input.nextInt();
		input.close();
		
	    if(number < 100)
	    	System.out.print("Number is less than 100!\n");
	    else if(number == 100)
	    	System.out.print("Number is 100!\n");
	    else
	    	System.out.print("Number is greater than 100!\n");

	    System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}