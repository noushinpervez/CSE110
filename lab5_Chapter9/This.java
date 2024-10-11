package lab5_Chapter9;

public class This {
	private int i = 5;
	private static double k = 0;
	
	public void setI(int i) {
		this.i = i;
		System.out.println(this.i);
	}
	
	public static void setK(double k) {
		This.k = k;
		System.out.println(This.k);
	}
	
	// others method omitted
	public static void main(String[] args) {
		This f1 = new This();
		f1.setI(10);
		
		This f2 = new This();
		f2.setI(45);
		
		This F = new This();
		F.setK(33);
	}
}