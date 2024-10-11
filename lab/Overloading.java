package lab;

public class Overloading {

	public static void main(String[] args) {
		C a = new C();
		D b = new D();
		D c = new C();
		
		a.p(10);
		a.p(10.0);
		
		b.p(1);
		b.p(1.0);
		
		c.p(13);
		c.p(13.0);
	}
}

class D {
	public void p(double i) {
		System.out.println(i * 2);
	}
}

class C extends D {
	// this method overloads the method in B
	public void p(int i) {
		System.out.println(i);
	}
}