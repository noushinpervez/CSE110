package labExam;

import java.util.Scanner;

public class Book {
	String title;
	String author;
	double price;
	
	public Book(String t, String a, double p) {
		setTitle(t);
		setAuthor(a);
		setPrice(p);
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "The name of the book is " + title + "\nThe author is " + author + "\nThe price of the book is " + price;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the title of the book: ");
		String t = input.nextLine();
		System.out.println("Enter the author name of the book: ");
		String a = input.nextLine();
		System.out.println("Enter the price of the book: ");
		double p = input.nextDouble();
		
		Book myBook = new Book(t, a, p);
		System.out.println(myBook.toString());
	}
}