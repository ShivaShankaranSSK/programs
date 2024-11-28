package cognizant_Programs;

public class Prog2 {

	/*  Find the length of the String (length), 
	 * Loop from length - 1 to 0 (for length-1 0), Get the character of the position - one at a time: right -> left (charAt(i)), 
	 * Concatenate the character (+ / concat), print
	 * 
	 */
	
	public static void main(String[] args) {
		
		String str = "COGNIZANT";
		
		int length = str.length();
		
		String reverse = "";
		
		for(int i=length-1; i>=0; i--)
		{
			char ch = str.charAt(i);
			reverse = reverse+ch;
			
		}
		System.out.println(reverse);
		
	}

}
