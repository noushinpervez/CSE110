package lab5_Chapter9;

public class TestPassObject {
	
	public static void main(String[] args) {
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);
		
		// printing areas for radius 1, 2, 3, 4 and 5
		int n = 5;
		printAreas(myCircle, n);
		
		// see myCircle.radius and times
		System.out.println("\nRadius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	
	// printing a table of areas for radius
	public static void printAreas(CircleWithPrivateDataFields c, int times) {
		System.out.println("Radius\tArea");
		while(times >= 1) {
			System.out.println(c.getRadius() + "\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}