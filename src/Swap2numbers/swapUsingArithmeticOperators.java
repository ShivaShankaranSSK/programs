package Swap2numbers;

public class swapUsingArithmeticOperators {

	public static void main(String[] args) {
		int a = 10, b = 20;

		System.out.println("Before Swapping : "+a+"   "+b);
		//Logic 1 
		a=a+b; // now a value is 30
		b=a-b; // now a value 30, b value 20 so a-b is 10. 
		a=a-b; // now a value 30 and b value 10, so a-b is 20. 
		System.out.println("After Swapping: "+a+"  " +b); 

		//Logic2
		System.out.println("Before Swapping : "+a+"   "+b);
		a=a*b; // a=10*20=200; a=200;
		b=a/b; // b=200/20; b=10;
		a=a/b; // a=200/10; a=20;
		System.out.println("After Swapping: "+a+"  " +b);

	}
}
