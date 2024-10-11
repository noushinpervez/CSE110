package assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char operator;
		double num1, num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		num1 = input.nextDouble();
		
		System.out.println("Enter second number: ");
		num2 = input.nextDouble();
		
		System.out.println("Enter an operator ('+', '-', '.', '/'): ");
		operator = input.next().charAt(0);
		
		javaCalculator(num1, num2, operator);
	}
	
		public static void javaCalculator(double num1, double num2, char operator) {
		double result = 0.0;
		
		switch(operator) {
			case '+':
				result = num1 + num2; // addition
				break;
			case '-':
				result = num1 - num2; // subtraction
				break;
			case '.':
				result = num1 * num2; // multiplication
				break;
			case '/':
				result = num1 / num2; // division
				break;
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
}