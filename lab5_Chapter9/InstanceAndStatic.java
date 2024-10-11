package lab5_Chapter9;

public class InstanceAndStatic {
	
	int i = 5;
	static int k = 2;
	
	public static void main(String[] args) {
		InstanceAndStatic a = new InstanceAndStatic();
		int j = a.i;
		a.m1();
	}
	
	public void m1() {
		i = i + k + m2(i, k);
		System.out.println(i);
	}
	public static int m2(int i, int j) {
		return (int)(Math.pow(i, j));
	}
}