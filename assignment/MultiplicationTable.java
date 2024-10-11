package assignment;

public class MultiplicationTable {

	public static void main(String[] args) {
		for(int i = 2; i <= 5; i++) {
			for(int j = 2; j <= 5; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			}
			System.out.println();
		}
	}
}