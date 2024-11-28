package practicePrograms;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		System.out.println("Enter any palidrome check String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("You entered: "+str);

		String reverse = new StringBuilder(str).reverse().toString(); // 

		if(str.equals(reverse))
		{
			System.out.println("Its a Palindrome");
		}
		else
			System.out.println("Its not a Palindrome");
	}
}