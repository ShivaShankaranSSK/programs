package practicePrograms;

import java.util.Scanner;

public class reverse {
	
	public static void main(String[] args) {
		
		System.out.println("Enter any String: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("You entered: "+name);
//		String name="SHIVA";
		
		String reverse="";
		
		for(int i=0; i<name.length();i++)
		{
			char ch = name.charAt(i);
			reverse = ch+reverse;
		}
		System.out.println("Reverse of "+name+" is: "+reverse);		
	}
}
