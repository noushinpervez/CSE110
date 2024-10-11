package lab5_Chapter9;

public class SimpleCircle {
	
	// combining two classes into one
	public static void main(String[] args) {
		// creating circles with different radius
		SimpleCircle c1 = new SimpleCircle();
		System.out.println("The area of the circle of radius " + c1.r + " is " + c1.getArea() + " and perimeter is " + c1.getPerimeter());
				
		SimpleCircle c2 = new SimpleCircle(10);
		System.out.println("The area of the circle of radius " + c2.r + " is " + c2.getArea() + " and perimeter is " + c2.getPerimeter());
				
		SimpleCircle c3 = new SimpleCircle(100);
		System.out.println("The area of the circle of radius " + c3.r + " is " + c3.getArea() + " and perimeter is " + c3.getPerimeter());
				
		c2.setRadius(2); 
		System.out.println("The area of the circle of radius " + c2.r + " is " + c2.getArea() + " and perimeter is " + c2.getPerimeter());
		// modify circle radius		
		c2.r = 3;
		System.out.println("The area of the circle of radius " + c2.r + " is " + c2.getArea() + " and perimeter is " + c2.getPerimeter());
	}
	
		double r;
		// constructing two circle objects
		SimpleCircle() {
			r = 1;
		}
		SimpleCircle(double newR) {
			r = newR;
		}
		
		// method for returning area and perimeter
		double getArea() {
			return r * r * Math.PI;
		}
		double getPerimeter() {
			return 2 * Math.PI * r;
		}
		
		// setting a new radius
		void setRadius(double newR) {
			r = newR;
		}
}