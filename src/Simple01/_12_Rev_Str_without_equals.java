package Simple01;

public class _12_Rev_Str_without_equals {

	public static boolean rev(String s) {
		
		int si = 0 , ei = s.length()-1 ;
		
		while(si < ei ) {
			if(s.charAt(si) != s.charAt(ei)) {
				return false ;
			}
			si++;
			ei--;
		}
		return true ;
		
	}

	public static void main(String[] args) {
		String str = "level";

		if (rev(str)) {
			System.out.println("pal");
		} else {
			System.out.println("not pal");
		}

	}

}
