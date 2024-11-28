package Swap2numbers;

public class swap {

	public static void main(String[] args) {
		int a = 10, b=20;

		System.out.println("Before Swaping : "+a+"   "+b);

		int t=a; // a value 10 assigned to t
		a=b; // b value 20 assigned to a
		b=t; // t value 10 assigned to b
		
		System.out.println("After Swaping: "+a+"  " +b);
	}
}
