package luv2code.com;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		double arr[] = new double[] {1.01, 1.991, 2.99, 1.32, 1.4};
		
		Arrays.sort(arr);
		int firstIndex = 0, total = 0;
		int lastIndex = arr.length - 1;
		
		while(firstIndex <= lastIndex) {
			total++;
			if(arr[lastIndex] + arr[firstIndex] <= 3) {
				firstIndex++;
			}
			lastIndex--;
		}
		
		System.out.println("Minimum trap: " + total);

	}

}
