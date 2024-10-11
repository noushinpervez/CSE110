package project;

import java.util.Scanner;

public class LargestandSmallest {

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	    int size, i, big, small;
	    int[] a = new int[50];  

	    System.out.print("\nEnter the size of the array: ");
	    Scanner input = new Scanner(System.in);
	    size = input.nextInt();

	    System.out.print("\n\nEnter the " + size + " elements of the array: \n\n");
	    for(i = 0; i < size; i++)
	    	a[i] = input.nextInt();

	    big = a[0]; 
	    
	    for(i = 1; i < size; i++) {
	        if(big < a[i])   
	            big = a[i]; 
	    }
	    System.out.print("\n\nThe largest element is: " + big);

	    small = a[0];
	    
	    for(i = 1; i < size; i++) {
	        if(small>a[i])   
	            small = a[i];   
	    }
	    System.out.print("\n\nThe smallest element is: " + small);
	    System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}