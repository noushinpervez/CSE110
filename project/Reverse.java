package project;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");

	    int c, d, n;
	    int[] a = new int[100];
	    int[] b = new int[100];
	    System.out.print("\n\nEnter number of elements in array :");
	    Scanner input = new Scanner(System.in);
	    n = input.nextInt();
	    System.out.print("\n\nEnter " + " elements\n");

	    for(c = 0; c < n; c++)
	        a[c] = input.nextInt();

	    for(c = n-1, d = 0; c >= 0; c--, d++)
	        b[d] = a[c];

	    for(c = 0; c < n; c++)
	        a[c] = b[c];

	    System.out.print("\n\nResultant array is: ");
	    for(c = 0; c < n; c++)
	    	System.out.print(a[c] + " ");

	    System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}