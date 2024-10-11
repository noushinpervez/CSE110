package project;

import java.util.*;

class Circle {
	double area;
	double ci;
	
	void getArea(int radius) {
		area = radius*radius*Math.PI;
		area = Math.round(area*1000000.0)/1000000.0;
	}
	
	void getCircumference(int radius) {
		ci = 2*Math.PI*radius;
		ci = Math.round(ci*1000000.0)/1000000.0;
	}
}

public class CircleAreaCircumference extends Circle {
	
	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
		System.out.print("\nEnter the radius of the circle: ");
	    int rad;
	    Scanner input = new Scanner(System.in);
	    rad = input.nextInt();
	    input.close();
	    Circle c = new CircleAreaCircumference();
	    c.getArea(rad);
	    c.getCircumference(rad);
	    System.out.print("\n\n\n Area of the circle is: " + c.area);
	    System.out.print("\n\n\n Circumference of the circle is: " + c.ci);
	    System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}