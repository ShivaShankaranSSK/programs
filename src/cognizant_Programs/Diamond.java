package cognizant_Programs;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for the number of rows
		System.out.print("Enter the number of rows for the diamond (e.g., 5): ");
		int rows = scanner.nextInt(); 

		// Print the top half of the diamond
		for (int i = 1; i <= rows; i++) { // rows = 5

			// Print spaces
			for (int j = rows; j > i; j--) {  // j = 5; 5>1; j-- = 4; 
				System.out.print(" "); // "     "
			}

			// Print stars
			for (int k = 1; k<=(2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Print the bottom half of the diamond
		for (int i = rows - 1; i >= 1; i--) {
			// Print spaces
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}


