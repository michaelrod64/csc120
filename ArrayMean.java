import java.util.*;

public class ArrayMean {
	public static void main(String[] args) {
		int[] numbers = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
		double average = average(numbers);
		System.out.println(average);
	}
	
		public static double average(int[] numbers) {
			int sum = 0;
			double mean = 0;
			int count = 0;
			for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
				
			}
			mean = (double) sum / numbers.length;
			return mean;
		}
}