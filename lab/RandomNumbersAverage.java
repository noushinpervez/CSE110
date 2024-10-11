package lab;

public class RandomNumbersAverage {

	public static void main(String[] args) {
		int size = 20;
		double avg, result = 0.0;
		int[] myList = new int[size]; 
		
		for (int i = 0; i < size; i++) {
			myList[i] = (int) (Math.random() * 100);
		}
		
		System.out.println("Printing the numbers in myList array: ");
		for (int i = 0; i < size; i++) {
		  	System.out.print(myList[i] + " "); 
		  	result += myList[i];
		}
		System.out.println();
		
		System.out.println("Summation of random numbers: " + result);
		avg = result / size;
		System.out.println("Average of random numbers: " + avg);
		System.out.println("Above the average numbers are: ");
		
		for (int i = 0; i < size; i++) {
	  		if (myList[i] > avg) {
			  	System.out.print(myList[i] + " "); 
	  		}
		}
	}
}