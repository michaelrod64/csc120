import java.util.*;

public class KthLargest {
	public static void main(String[] args) {
		int[] values = {74, 85, 102, 99, 101, 56, 84};
		Scanner input = new Scanner(System.in);
		System.out.println("This program finds the kth largest number.");
		System.out.print("Enter k: ");
		int k = input.nextInt();
		
		int answer = kthLargest(values, k);
		System.out.print("The " + k);
		switch (k) {
		case 1: System.out.print("st ");
				break;
		case 2: System.out.print("nd ");
				break;
		case 3: System.out.print("rd ");
				break;
		default: System.out.print("th ");
		}
		System.out.print("largest number is: " + answer);
	}
	
	public static int kthLargest(int[] values, int k) {
		int[] copy = new int[values.length];
		
		for (int i = 0; i < values.length; i++) {
		copy[i] = values[i];
		}
		Arrays.sort(copy);
		return copy[copy.length - k];
	}
}