package project;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");

		int n, sum = 0, remainder;

		System.out.print("Enter the number you want to add digits of:  ");
		Scanner input = new Scanner(System.in);
	    n = input.nextInt();
	    input.close();

		while(n != 0) {
	        remainder = n%10;
	        sum += remainder;
	        n = n/10;
	    }

		System.out.print("\n\nSum of the digits of the entered number is  =  " + sum + "\n\n");
		System.out.print("\n\n\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}