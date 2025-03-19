package Simple01;

public class _04_Reverse_String {

	public static void main(String args[]) {

		String s = "hello" , rev="" ; 
		
		for( int i = s.length() - 1 ; i >= 0 ; i--) {
			rev += s.charAt(i) ;
		}
		
		System.out.println(rev);

	}

}
