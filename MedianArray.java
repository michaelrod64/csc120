import java.util.*;

public class MedianArray {
	public static void main(String[] args) {
		int[] values = {1, 2, 3, 4,};
		double median =  median(values);
		
		System.out.printf("The Median is: %.1f", median);
	}
		public static double median(int[] values) {
			int[] copy = new int[values.length];
		
			for (int i = 0; i < values.length; i++) {
			copy[i] = values[i];
			}
			Arrays.sort(copy);
			if (copy.length % 2 == 1) {
				return copy[(copy.length - 1)/2];
			}
			else { 
				return ((double)copy[(copy.length/2)] + (copy[copy.length/2 - 1])) / 2;
			}
		
		}
}