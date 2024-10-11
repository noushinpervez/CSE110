package lab5_Chapter9;

public class TotalArea {

	public static void main(String[] args) {
		// declaring circleArray
		CircleWithPrivateDataFields[] circleArray;
		
		// creating circleArray
		circleArray = createCircleArray();
		
		// printing circleArray and total areas of the circles
		printCircleArray(circleArray);
	}
	
	// creating an array of circle objects
	public static CircleWithPrivateDataFields[] createCircleArray() {
		CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
		
		for(int i = 0; i < circleArray.length; i++) 
			circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
		
		// returning circleArray
		return circleArray;
	}
	
	// print an array of circles and their total area
	public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		
		for(int i = 0; i < circleArray.length; i++) 
			System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
		
		System.out.println("------------------------------------------------");
		
		// computing and displaying the result
		System.out.printf("%-30s%-15s\n", "The total area of circles is", sum(circleArray));
	}
	
	// adding circle areas
	public static double sum(CircleWithPrivateDataFields[] circleArray) {
		// initializing sum
		double sum = 0;
		
		// adding areas to sum
		for(int i = 0; i < circleArray.length; i++)
			sum += circleArray[i].getArea();
		
		return sum;
	}
}