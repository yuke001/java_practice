package Simple01;

public class _05_String_palindrome {
	
	public static void main(String args[]) {
		
		String s = "level" , rev="" ;
		
		for(int i = s.length()-1 ; i >= 0 ; i--) {
			rev += s.charAt(i) ; 
		}
		
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(s)) {
			System.out.println(s+" is palidrome");
		}
		else {
			System.out.println(s +" is not pal");
		}
	}

}
