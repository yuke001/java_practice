package Simple01;

public class _02_Odd_Even {

	public static void main(String args[]) {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
		System.out.println();

		System.out.println("***** 10 to 1 ***********");

		for (int i = 10; i > 0; i--) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
	}

}
