package exam;

public class Mid1_Output1 {

	public static void main(String[] args) {
		System.out.println("do-while loop: ");
		do {
			System.out.println("javabuzz");
		} while(false);
		
		System.out.println("for loop: ");
		for(int i = 0, j = 4; i < 4 && j < 7; i++, j--) {
			System.out.println("(i,j) = (" + i + "," + j + ")");
		}
	}
}