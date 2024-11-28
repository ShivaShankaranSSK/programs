package arrayPrograms;

public class LargeAndSmallNumber {

	public static void main(String[] args) {

		int[] a = {13,33,21,3,54,87};

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int min = a[0];
		int max = a[0];

		for (int num : a) {

			if(num < min) min = num;
			if(num > max) max = num;
		}
		System.out.println("Minium number is: "+min);
		System.out.println("Maximium number is: "+max);

	}
}
