package lab5_Chapter9;

public class CircleWithPrivateDataFields {
	private double radius = 1;
	// number of objects created
	private static int numberOfObjects = 0;
	
	public CircleWithPrivateDataFields() {
		numberOfObjects++;
	}
	
	CircleWithPrivateDataFields(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	// setting a new radius
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public static void main(String[] args) {
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		// increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects());
	}
}