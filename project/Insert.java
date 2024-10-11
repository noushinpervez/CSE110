package project;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	    
		int position, c, n, value;
	    int[] array = new int[100];

	    System.out.print("\n\nEnter number of elements in array:");
	    Scanner input = new Scanner(System.in);
	    n = input.nextInt();

	    System.out.print("\n\nEnter " + n + " elements\n");
	    for(c = 0; c < n; c++)
	        array[c] = input.nextInt();

	    System.out.print("\n\nEnter the location where you want to insert new element:  ");
	    position = input.nextInt();

	    System.out.print("\n\nEnter the value to insert: ");
	    value = input.nextInt();
	    
	    for(c = n-1; c >= position-1; c--)
	    	array[c+1] = array[c];

	    array[position - 1] = value;    

	    System.out.print("\n\nResultant array is: ");
	    
	    for(c = 0; c <= n; c++) 
	    	System.out.print(array[c] + " ");

	    System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}