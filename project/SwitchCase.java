package project;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");

	    char ch;
	    System.out.print("Input a Character :  ");
	    Scanner input = new Scanner(System.in);
	    ch = input.next().charAt(0);
	    input.close();
	    
	    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	    	switch(ch) {
	        	case 'a':
	        	case 'A':
	        	case 'e':
	        	case 'E':
	        	case 'i':
	        	case 'I':
	        	case 'o':
	        	case 'O':
	        	case 'u':
	        	case 'U':
	        		System.out.print("\n\n" + ch + " is a vowel.\n\n");
	        		break;
	        	default:
	        		System.out.print("\n\n" + ch + " is not a vowel.\n\n");
	    	}
	    }
	    else
	    	System.out.print("\n\n" + ch + " is not a alphabet.\n\n");
	    
	    System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}