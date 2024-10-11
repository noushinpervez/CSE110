package assignment;

import java.util.Scanner;

public class SumOfUnspecifiedNumber {

	public static void main(String[] args) {
		int num, sum = 0;
		do {
			System.out.println("Enter the number: ");
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			sum += num;
		}
		while(num != 0); {
			System.out.println("The sum of all the numbers is " + sum);
		}
	}
}