package project;

import java.util.Scanner;

public class CelsiustoFahrenheit {
	double c;
	
	public CelsiustoFahrenheit(double c){
		setCelsius(c);
	}
	
	public void setCelsius(double c) {
		this.c = c;
	}
	
	double getFahrenheit() {
		return (1.8*c) + 32;
	}
	
	public String toString() {
		return "\n\n\nTemperature in Fahrenheit is: " + getFahrenheit();
	}

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	    double celsius;
	    System.out.print("\n\nEnter temperature in Celsius: ");
	    Scanner input = new Scanner(System.in);
	    celsius = input.nextDouble();
	    input.close();
	    CelsiustoFahrenheit d = new CelsiustoFahrenheit(celsius);
	    System.out.print(d.toString());
	    System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}