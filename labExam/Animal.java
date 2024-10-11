package labExam;

//superclass
class Animal {
	//private instance variable
	private String color;
	public String setColor(String color) {
		return color;
	}
	void food(double weight) {
		System.out.println(weight);
	}
	void print() {
		System.out.println("Animal Food");
	}
}
//subclass
class Cat extends Animal{
	private String color1;
	public String setColor1(String color) {
		return color1 = color;
	}
	//overloading method
	void food(int weight) {
		System.out.println(weight * 2);
	}
	//overridding method
	void print() {
		System.out.println("Fish");
	}
}
//subclass
class Dog extends Animal{
	private String color2;
	public String setColor2(String color) {
		return color2 = color;
	}
	void food(int weight) {
		System.out.println(weight * 2);
	}
	void print() {
		System.out.println("Chicken");
	}
}
