import java.util.*;

public class ArraySum{
	public static void main(String[] args){
		int[] values = {74, 85, 102, 99, 101, 56, 84};
		int total = sumAll(values);
		System.out.println(total);
	}
		public static int sumAll(int[] values) {
			int sum = 0;
			for (int i = 0; i < values.length; i++) {
				sum += values[i];
			}
			return sum;
		}
}