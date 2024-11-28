package Reverse_a_Number;

import java.util.Scanner;

public class usingStringBuffer {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Any Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("You Entered: "+num);
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		
	}

}
