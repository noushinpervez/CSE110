package lab5_Chapter9;

class Circle {
	// data field
	double radius;
	
	// constructing two circle objects
	Circle() {
		radius = 1.0;
	}
	Circle(double newRadius) {
		radius = newRadius;
	}
	
	// method for returning area and perimeter
	double getArea() {
		return radius * radius * Math.PI;
	}
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	// setting a new radius
	void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public static void main(String[] args) {
		// creating circles with different radius
		Circle c1 = new Circle();
		System.out.println("The area of the circle of radius " + c1.radius + " is " + c1.getArea() + " and perimeter is " + c1.getPerimeter());
		
		Circle c2 = new Circle(10);
		System.out.println("The area of the circle of radius " + c2.radius + " is " + c2.getArea() + " and perimeter is " + c2.getPerimeter());
		
		Circle c3 = new Circle(100);
		System.out.println("The area of the circle of radius " + c3.radius + " is " + c3.getArea() + " and perimeter is " + c3.getPerimeter());
		
		c2.setRadius(2); 
		System.out.println("The area of the circle of radius " + c2.radius + " is " + c2.getArea() + " and perimeter is " + c2.getPerimeter());
		
		c2.radius = 3;
		System.out.println("The area of the circle of radius " + c2.radius + " is " + c2.getArea() + " and perimeter is " + c2.getPerimeter());
	}
}