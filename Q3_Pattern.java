
public class Q3_Pattern {

	public static void main(String[] args) {

		for (int row = 1; row <= 7; row++) {

			for (int j = 1; j < row; j++) {
				System.out.print(" ");
			}
			for (int i = row; i <= 7; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// the second triangle
		for (int row = 6; row >= 1; row--) {

			for (int j = 1; j < row; j++) {
				System.out.print(" ");
			}
			for (int i = row; i < 7; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
