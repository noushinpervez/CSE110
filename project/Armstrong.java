package project;

public class Armstrong {

	public static void main(String[] args) {
		System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	    int sum,i,t,a;
	    System.out.print("\n\n\nThe Armstrong numbers in between 1 to 500 are : \n\n\n");

	    for(i = 1; i <= 500; i++) {
	        t = i;  
	        sum = 0;
	        while(t != 0) {
	            a = t%10;
	            sum += a*a*a;
	            t = t/10;
	        }
	        if(sum == i)
	        	System.out.print("\n\t\t\t" + i);
	    }

	    System.out.print("\n\n\n\n\t\t\tCoding is Fun !\n\n\n");
	}
}