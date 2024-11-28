package practicePrograms;

import java.util.Scanner;

public class revString {

	public static void main(String[] args) {
		
		System.out.println("Enter any String to Reverse: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("You have entered: "+name);
		String reverse = "   ";
		char ch;
		
		for(int i=0; i<name.length(); i++)  //  i=0; i will print till 3; i++ i=1
		{
			ch = name.charAt(i); // ch = ABCD.i =  A; 
			reverse = ch+reverse;
		}
		System.out.println("Reverse of the String is: "+reverse);
	}
}
