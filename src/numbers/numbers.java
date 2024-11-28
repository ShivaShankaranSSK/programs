package numbers;

import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		
		
		System.out.println("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		for(int i=a; i<=b;i++)
		{
			System.out.println("Answer is: "+i);
		}
	}
}
