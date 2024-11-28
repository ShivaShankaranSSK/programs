package practicePrograms;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {

		System.out.println("Enter any String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("You Entered: "+str);

		String reverse="";

		for(int i=0; i<str.length(); i++) // i=0; 0<4; 0++;
		{
			char ch = str.charAt(i); 
			reverse = ch+reverse;
		}
		System.out.println("Reverse of the name is : "+reverse);
	}
}