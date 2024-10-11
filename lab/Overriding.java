package lab;

public class Overriding {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		B c = new A();
		
		a.p(10);
		a.p(10.0);
		
		b.p(1);
		b.p(1.0);
		
		c.p(13);
		c.p(13.0);
	}
}

class B {
	public void p(double i) {
		System.out.println(i * 2);
	}
}

class A extends B {
	// this method overrides the method in B
	public void p(double i) {
		super.p(i);
		System.out.println(i * 10);
	}
}