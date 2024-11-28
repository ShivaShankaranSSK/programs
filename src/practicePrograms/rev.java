package practicePrograms;

import java.util.Scanner;

public class rev {
	
	public static void main(String[] args) {
		
		System.out.println("Enter any name : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("You entered : "+str);
		
		//String str = "JAVA";
		String reverse="";
		
		for(int i=0; i<str.length(); i++) // i=0; 0<4; 0++; i=1; 1<4; i+1-> str.char(1) -> A
		{
			char ch = str.charAt(i); 
			reverse = ch+reverse;            // AVAJ it will store in reverse flow
		}
		System.out.println("Reverse of the name is : "+reverse);
	}
}
