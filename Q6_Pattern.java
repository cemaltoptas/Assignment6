
public class Q6_Pattern {

	public static void main(String[] args) {

		int row = 5;
		for (int i = 1; i <= row; i++) {

			int total = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(total + " ");
				total = total + row - j;
			}
			System.out.println();
		}
	}
}
