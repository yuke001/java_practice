package Simple01;

public class _09_FizzBuzz {

	public static void fizzbuzz() {
		for (int i = 1; i <= 20; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}

	}

	public static void main(String args[]) {

		int no = 2;

		if (no % 3 == 0 && no % 5 == 0) {
			System.out.println(no + " is Fizzbuzz");
		} else if (no % 3 == 0) {
			System.out.println("fizz");
		} else if (no % 5 == 0) {
			System.out.println("buzz");
		} else {
			System.out.println("none");
		}

		System.out.println();

		fizzbuzz();
	}

}
