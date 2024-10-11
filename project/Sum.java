package project;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	    int n, sum = 0, c;
	    int[] array = new int[100];  

	    System.out.print("Enter the number of integers you want to add: ");
	    Scanner input = new Scanner(System.in);
	    n = input.nextInt();

	    System.out.print("\n\nEnter " + n + " integers \n\n");

	    for(c = 0; c < n; c++) {
	        array[c] = input.nextInt();
	        sum += array[c];   
	    }
	    
	    System.out.print("\n\nSum = " + sum + "\n\n");
	    System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}