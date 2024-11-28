package cognizant_Programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter any String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("You entered: "+str);

		String reverse = "";

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			reverse = ch+reverse;
		}
		System.out.println("Reversed String is: "+reverse);
	}
}
