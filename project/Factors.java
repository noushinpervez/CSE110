package project;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	    int  num, i;
	    System.out.print("Enter the number to find the factors of :  ");
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    input.close();
	    System.out.print("\n\n\nFactors of " + num + " are \n\n");

	    for(i = 1; i <= num/2; i++) {
	        if(num%i == 0)
	        	System.out.print("\t\t\t" + i + "\n");
	    }

	    System.out.print("\n\n\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}