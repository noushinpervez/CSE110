package project;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int a, b, c, s = 0;
		System.out.print("Enter a number:\t");
	    Scanner input = new Scanner(System.in);
	    a = input.nextInt();
	    input.close();
	    c = a;

	   while(a > 0) {
	      b = a%10;
	      s = (s*10)+b;
	      a = a/10;
	   }

	   if(s == c)
		   System.out.print("The number " + c + " is a palindrome");
	   else
		   System.out.print("The number " + c + " is not a palindrome");
	}
}