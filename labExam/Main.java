package labExam;

class Main{
	public static void main(String[] args) {
		Cat c = new Cat();
		c.print();
		c.food(20);
		c.food(20.43);
		System.out.println(c.setColor1("White"));
		
		Dog d = new Dog();
		d.print();
		d.food(40);
		d.food(40.43);
		System.out.println(d.setColor2("Brown"));
	}
}
