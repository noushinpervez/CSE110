package lab5_Chapter9;

public class Date {

	public static void main(String[] args) {
		// return the date and time as a string
		java.util.Date date = new java.util.Date();
		System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliseconds");
		System.out.println(date.toString());
	}
}