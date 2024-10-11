package assignment;

public class Loop {

	public static void main(String[] args) {
		// using while loop
		int i = 1;
		while(i * i <= 100) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
		
		// using do-while loop
		i = 1;
		do {
			System.out.print(i * i + " ");
			i++;
		}
		while(i * i <= 100); {
			System.out.println();
		}
		
		// using for loop
		for(i = 1; i * i <= 100; i++) {
			System.out.print(i * i + " ");
		}
	}
}