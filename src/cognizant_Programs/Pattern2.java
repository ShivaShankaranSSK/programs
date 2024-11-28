package cognizant_Programs;

public class Pattern2 {

	public static void main(String[] args) {

		int row = 8; 

		for(row=8; row>=1; row--)
		{
			for(int col=1; col<row; col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}

	}
}
