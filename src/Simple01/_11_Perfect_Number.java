package Simple01;

public class _11_Perfect_Number {
	public static void main(String args[]) {
		int no = 6, sum = 0;

		for (int i = 1; i < no; i++) {
			if (no % i == 0)
				sum += i;
		}

		if (sum == no)
			System.out.println("perfect");
		else
			System.out.println("not perfect");

	}

}
