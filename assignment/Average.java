package assignment;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int count = 0, n = 10;
		double avg, sum = 0.0;
		
		// declaring and creating array
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");  
		Scanner input = new Scanner(System.in);  
		
		// reading integer numbers from the user
		for(int i = 0; i < n; i++) {
			array[i] = input.nextInt();  
		}
		
		// summation of all the numbers
		for(int i = 0; i < n; i++) {
			sum += array[i];
		}
		
		// average of all the numbers
		avg = sum / n;
		System.out.println("Average of " + n + " numbers: " + avg);
		
		// counting the numbers that are above the average
		for(int i = 0; i < n; i++) {
			if(array[i] > avg) {
				count++;
			}
		}
		System.out.println(count + " numbers are above the average");
	}
}