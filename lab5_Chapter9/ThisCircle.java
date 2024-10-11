package lab5_Chapter9;

public class ThisCircle {
	private double radius;
	
	public ThisCircle(double radius) {
		this.radius = radius;
	}
	
	public ThisCircle() {
		this(1.0);
	}
	
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	public String toString() {
		return "radius: " + this.radius + " area: " + this.getArea();
	}
	
	public static void main(String[] args) {
		ThisCircle c1 = new ThisCircle();
		System.out.println(c1.toString());
		
		ThisCircle c2 = new ThisCircle(10.0);
		System.out.println(c2.toString());
	}
}