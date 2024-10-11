package lab;

import java.util.Scanner;

public class ElementaryProgramming {
	
	// increment-decrement operators
	private void incrementDecrementOperators() {
		int i = 10;
		i = 10 * (++i);
		System.out.println("Result1: " + i++);
		
		i = 10;
		i = 10 * (i++);
		System.out.println("Result2: " + ++i + "\n");
	}
	
	// integer overflow
	private void integerOverflow() {
		int i = 2147483647;
		System.out.println("Normal value of i: " + i);

		i = i + 1;
		System.out.println("Overflowed value of i: " + i);
		
		i = i + 1;
		System.out.println("Increment after overflowed value of i: " + i + "\n");
	}
	
	// type casting
	private void typeCasting() {
		int i = 10;
		System.out.println("Integer: " + i);
		
		double d = 10;
		System.out.println("Double: " + d);

		i = (int)10.45;
		System.out.println("Type casted from 10.45: " + i);

		d = 5.67;
		i = (int) d;
		System.out.println("Type casted from d: " + i + "\n");
	}
	
	// display the tax with two digits after the decimal point
	private void round() {
		double tax = 2550.9475;
		
		// moving the decimal point to two decimal places right
		tax = tax * 100;
		System.out.println("Moving decimal point: " + (int)(tax * 100) / 100.0);
		
		// type casting the double value to int
		int intValue = (int) tax;
		System.out.println("Type Casting: " + intValue);
		
		// dividing the int value by 100.0
		double finalResult = intValue / 100.0;
		System.out.println("Final Result: " + finalResult + "\n");
	}
	
	// display the tax with given digits after the decimal point
	private void roundNew(double value, int decimalDigits) {
		// moving the decimal point to given decimal places right
		double updatedValue = value * Math.pow(10.0, decimalDigits);
		System.out.println("Moving decimal point: " + updatedValue);
		
		// type casting the double value to int
		int intValue = (int) updatedValue;
		System.out.println("Type Casting: " + intValue);
		
		// dividing the int value by 10.0 to the power of given digits
		double finalResult = intValue / Math.pow(10.0, decimalDigits);
		System.out.println("Final Result: " + finalResult + "\n");
	}
	
	// display the tax with given digits after the decimal point alternative
	private double roundFinal(double value, int decimalDigits) {
		double updatedValue = value * Math.pow(10.0, decimalDigits);
		
		int intValue = (int) updatedValue;
		
		double finalResult = intValue / Math.pow(10.0, decimalDigits);
		
		return finalResult;
	}
	
	// if-else block problem 1
	private void ifElseBrace1() {
		int i = 1; 
		int j = 2;
		int k = 3;
		if (i > j) 
		  if (i > k)
		    System.out.println("A");
		else 
		  System.out.println("B");
		  
		System.out.println("End of function");
		System.out.println("\n");
	}
	
	// if-else block problem 2
	private void ifElseBrace2() {
		int i = 1; 
		int j = 2;
		int k = 3;
		if (i > j) {
		  if (i > k)
		    System.out.println("A");
		}
		else 
			System.out.println("B");
		System.out.println("\n");
	}
	
	// computing BMI
	private void computeBMI() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a weight (pound): ");
		double wInPound = input.nextDouble();
		
		System.out.println("Enter a height (inches): ");
		double hInInches = input.nextDouble();
		
		// conversion of weight from pound to kg
		double wInKG = wInPound * 0.45359237;
		
		// conversion of height from inches to meter
		double hInM = hInInches * 0.0254;
		
		// calculate BMI
		double bmi = wInKG / (hInM * hInM);
		
		System.out.println("BMI: " + bmi);
		
		if (bmi >= 30.0) {
			System.out.println("Obese");
		}
		else if (bmi >= 25.0) {
			System.out.println("Overweight");
		}
		else if (bmi >= 18.5) {
			System.out.println("Normal");
		}
		else {
			System.out.println("Underweight");
		}
	}
	
	public static void main(String[] args) {
		ElementaryProgramming ep = new ElementaryProgramming();
		ep.incrementDecrementOperators();
		ep.integerOverflow();
		ep.typeCasting();
		ep.round();
		
		ep.roundNew(2.345689, 3);
		System.out.println();
		ep.roundNew(2.345689, 2);
		
		double val3 = ep.roundFinal(2.345689, 3);
		double val2 = ep.roundFinal(2.345689, 2);
		System.out.println("Tax with 3 digit decimal point: " + val3);
		System.out.println("Tax with two digit decimal point: " + val2 + "\n");
		
		ep.ifElseBrace1();
		ep.ifElseBrace2();
		ep.computeBMI();
	}
}