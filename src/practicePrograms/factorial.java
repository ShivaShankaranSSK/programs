package practicePrograms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		System.out.println("Enter number to calculate factorial: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int factorial = 1;

				for(int i=1; i<=number; i++)
				{
					factorial = factorial*i;

					/*
					 * i=1; fact=1*1 = 1
					 * i=2; fact=1*2 = 2; 
					 * i=3; fact=2*3 = 6;
					 * i=4; fact=6*4 = 24; 
					 * i=5; fact=24*5 = 120;
					 * 
					 * factorial = 120;
					 */
				}
		System.out.println("Factorial of "+number+" is: "+factorial);
	}
}
