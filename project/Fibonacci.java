package project;

import java.util.Scanner;

public class Fibonacci {
	
	static int first = 0, second = 1, sum;
	
	static void fibonacci(int aj) {
		if(aj > 1) {
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(" "+sum);
			fibonacci(aj-1);
		}
		else
			System.out.print("\n\n\n");
	}

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	    int n;
	    System.out.print("Enter the length of the Fibonacci series: ");
	    Scanner input = new Scanner(System.in);
	    n = input.nextInt();
	    input.close();
	    System.out.print("\n\nfirst " + n + " terms of Fibonacci series are:\n\n\n");
	    System.out.print("1");
	    fibonacci(n);
	    System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}