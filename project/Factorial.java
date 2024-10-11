package project;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int aj) {
		if(aj==1 || aj==0)
	        return 1;
	    else
	        return (aj*fact(aj-1));
	}

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	    int num, f;
	    System.out.print("\n\nEnter a number: ");
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    input.close();
	    f = fact(num);
		System.out.print("\n\nFactorial of " + num + " is  " + f + "\n\n");
	    System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}