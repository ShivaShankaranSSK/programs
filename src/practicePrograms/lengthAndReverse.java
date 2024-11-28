package practicePrograms;
import java.util.Scanner;

public class lengthAndReverse {

	public static void main(String[] args) {

		System.out.println("Enter any Text: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		System.out.println("You entered: "+text);
		
		int length = text.length();
		
		String reverse = "";
		
		for(int i = length-1; i>=0 ; i-- )
		{
			char ch = text.charAt(i);
			reverse=reverse+ch;
		}
		System.out.println(reverse);
	}

}
