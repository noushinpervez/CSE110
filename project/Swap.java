package project;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		swapping(a, b);
	}
	
	public static void swapping(int x, int y) {
		x = x + y - (y = x);
		System.out.println("x = " + x + " and y = " + y);
	}
}