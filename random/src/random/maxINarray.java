package random;

public class maxINarray {

	public static void main(String[] args) {
		
		int a[] = {10, 324, 45, 90, 9808};
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
		// finding minimum
		if (min > a[i]) {
		min = a[i];
		}
		// finding maximum
		if (max < a[i]) {
			max = a[i];
		}
		}
		System.out.println("Minimum in the given array is: " + min);
		System.out.println("maximum in the given array is: " + max);
		}
		

	}



