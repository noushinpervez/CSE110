package lab5_Chapter9;

/* if a local variable has the same name as a class's variable, 
 * the local variable takes precedence and the class's variable 
 * with the same name is hidden */

public class F {
	private int x = 0; // instance variable
	private int y = 0;
	
	public F() {
	}
	
	public void p() {
		int x = 1; // local variable
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
	public static void main(String[] args) {
		F f = new F();
		f.p();
	}
}