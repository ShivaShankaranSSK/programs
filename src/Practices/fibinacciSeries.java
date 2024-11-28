package Practices;

public class fibinacciSeries {

	public static void main(String[] args) {
		
		
		
		int first = 0, second = 1;
		
		for(int i=0; i<10; i++)
		{
			System.out.println(first);
			int third = first + second;
			
			first = second;
			second = third;
		}
		
	}

}
