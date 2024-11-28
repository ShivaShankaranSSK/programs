package practicePrograms;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		System.out.println("Enter Second number: ");
		int second = sc.nextInt();

		System.out.println("Fibonacci Seried of "+first+" and"+second+" is: ");

		for (int i=0; i<=10; i++) {

			System.out.println(first);

			int third = first + second;

			first = second;
			second = third;
		}
	}
}
