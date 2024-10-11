package project;

import java.util.Scanner;

interface Triangle{
	void Area(int height, int base);
}

public class AreaofTriangle implements Triangle {
	double area;
	
	public void Area(int height, int base) {
		area = (height*base)/(float)2;
	}

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	    int h, b;
	    System.out.print("\n\nEnter the height of the Triangle: ");
	    Scanner input = new Scanner(System.in);
	    h = input.nextInt();
	    System.out.print("\n\nEnter the base of the Triangle: ");
	    b = input.nextInt();
	    input.close();
	    AreaofTriangle t = new AreaofTriangle();
	    t.Area(h, b);
	    System.out.print("\n\n\nThe area of the triangle is: " + t.area);
	    System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}