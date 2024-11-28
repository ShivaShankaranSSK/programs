package reverseString;

public class stringReverse {

	public static void main(String[] args) {
		
		String str = "Cognizant";
		String reverse = "";

		for(int i=0; i<str.length(); i++)
		{
		  char ch = str.charAt(i);
		  reverse = ch+reverse;
		}
		System.out.println(reverse);
	}

}
