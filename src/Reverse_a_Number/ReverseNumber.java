package Reverse_a_Number;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println("Enter Any Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("You Entered: "+num);

		int reverse = 0; 

		while(num!=0)
		{
			reverse = reverse*10 + num%10; // 1. reverse = 0*10+567"8"%10 = 567.8 so we need to take reminder value 8. rev= 8; 
			num=num/10; // now 567 will be assigned to num. 567/10=567; 
			/* 2. again 567!=0, reverse = 8*10=80+567%10=7=80+7=87; rev=87; 
			 Here 7 is a reminder so its eliminated, now 56 is a num value and 56/10=56; num= 56;
			 3. rev=87*10=870 +56%10=6-> reminder value rev=870+6=876;
			 num=5/10; 
			 4. rev=876*10=8760+5%10=5=8760+5=8765; 
			 now num=0 -> program ended...
			*/
		}

		System.out.println("Reverse number is: "+reverse);
	}

}
