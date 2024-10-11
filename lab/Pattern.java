package lab;

public class Pattern {
	
	public static void topRightTriangle(int maxLine) {
		for(int line = 1; line <= maxLine; line++) {
			for(int star = 0; star < line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void topLeftTriangle(int maxLine) {
		for(int line = 1; line <= maxLine; line++) {
			int nSpace = maxLine - line;
			for(int s = nSpace; s > 0; s--) {
				System.out.print(" ");
			}
			for(int star = 0; star < line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void bottomRightTriangle(int maxLine) {
		for(int line = maxLine; line > 0; line--) {
			for(int star = line; star > 0; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void bottomLeftTriangle(int maxLine, int addSpace) {
		for(int line = maxLine; line > 0; line--) {
			int nSpace = maxLine - line + addSpace;
			for(int s = 0; s < nSpace; s++) {
				System.out.print(" ");
			}
			for(int star = 0; star < line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void leftTriangle() {
		topRightTriangle(4);
		bottomRightTriangle(3);
	}
	
	public static void rightTriangle() {
		topLeftTriangle(4);
		bottomLeftTriangle(3, 1);
	}
	
	public static void topTriangle(int maxLine) {
		for(int line = 1; line <= maxLine; line++) {
			int nSpace = maxLine - line;
			for(int s = nSpace; s > 0; s--) {
				System.out.print(" ");
			}
			int ns = 2 * line - 1;
			for(int star = 0; star < ns; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void bottomTriangle(int maxLine, int addSpace) {
		for(int line = 1; line <= maxLine; line++) {
			int nSpace = addSpace + line - 1;
			for(int s = 0; s < nSpace; s++) {
				System.out.print(" ");
			}
			int ns = 2 * (maxLine - line) + 1;
			for(int star = ns; star > 0; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void diamond() {
		topTriangle(4);
		bottomTriangle(3, 1);
	}
	
	public static void main(String[] args) {
		System.out.println("Top-Right Triangle");
		topRightTriangle(4);
		System.out.println();
		
		System.out.println("Top-Left Triangle");
		topLeftTriangle(4);
		System.out.println();
		
		System.out.println("Bottom-Right Triangle");
		bottomRightTriangle(4);
		System.out.println();
		
		System.out.println("Bottom-Left Triangle");
		bottomLeftTriangle(4, 0);
		System.out.println();
		
		System.out.println("Left Triangle");
		leftTriangle();
		System.out.println();
		
		System.out.println("Right Triangle");
		rightTriangle();
		System.out.println();
		
		System.out.println("Top Triangle");
		topTriangle(4);
		System.out.println();
		
		System.out.println("Bottom Triangle");
		bottomTriangle(4, 0);
		System.out.println();
		
		System.out.println("Diamond");
		diamond();
	}
}