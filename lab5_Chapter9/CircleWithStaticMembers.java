package lab5_Chapter9;

public class CircleWithStaticMembers {
	double radius;
	// the number of objects created
	static int numberOfObjects = 0;
	
	// constructing circles
	CircleWithStaticMembers() {
		radius = 1;
		numberOfObjects++;
	}
	CircleWithStaticMembers(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	// returning numberOfObjects
	static int getNumberOfNumbers() {
		return numberOfObjects;
	}
	
	// returning area
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfObjects);
		
		// create c1
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
		
		// displaying c1 before c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + c1.numberOfObjects + ")");
		
		// creating c2
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		
		// modifying c1
		c1.radius = 9;
		
		// displaying c1 and c2 after c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + "), number of Circle objects (" + c1.numberOfObjects + ")" + " and area is " + c1.getArea());
		System.out.println("c1: radius (" + c2.radius + "), number of Circle objects (" + c2.numberOfObjects + ")" + " and area is " + c2.getArea());
	}
}