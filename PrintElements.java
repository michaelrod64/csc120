import java.util.*;

public class PrintElements {
	public static void main(String[] args) {
		int[] numbers = {14, 5, 27, -3, 2598};
		printElements(numbers);
	}
	
		public static void printElements(int[] numbers) {
			for (int i = 0; i < numbers.length; i++) {
				System.out.println("element [" + i + "] is " + numbers[i]);
			}
		}
}