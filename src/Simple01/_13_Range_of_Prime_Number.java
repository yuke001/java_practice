package Simple01;

public class _13_Range_of_Prime_Number {

	public static void main(String[] args) {

		for (int j = 5; j <= 50; j++) {
			int no = j;
			boolean flag = true;

			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(no + " ");
			}
		}

	}

}
