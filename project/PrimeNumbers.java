package project;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	    int n,i = 3, count, c;

	    System.out.print("\nEnter the number of prime numbers required :  ");
	    Scanner input = new Scanner(System.in);
	    n = input.nextInt();
	    
	    if(n < 0)
	    	System.out.print("\n\nEntered number can not be 0 or less than 0");

	    if(n >= 1) {
	    	System.out.print("\n\nFirst " + n + " prime numbers are :  ");
	    	System.out.print("2 ");
	    }

	    for(count = 2; count <= n; i++) {
	        for(c = 2; c < i; c++) {
	            if(i%c == 0)
	                break;
	        }
	        if(c == i) {
	        	System.out.print(i + " ");
	            count++;   
	        }
	    }
	    
	    System.out.print("\n\n\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}