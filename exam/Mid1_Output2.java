package exam;

public class Mid1_Output2 {

	public static void main(String[] args) {
		int a1[] = {34, 45};
		System.out.println(a1[1]);
		a1 = process(a1);
		System.out.println(a1[1]);
	}
	public static int[] process(int[] a2) {
		int[] a3 = {10, 100};
		a3 = a2;
		System.out.println(a3[1]);
		return a2;
	}
}