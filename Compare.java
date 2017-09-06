import java.util.*;

public class Compare {
	public static void main(String[] args)  {
		int[] first = new int[2];
		first[0] = 3;
		first[1] = 7;
		int[] second = new int[2];
		second[0] = 3;
		second[1] = 7;
		
		System.out.print("First Array: ");
		print(first);
		System.out.print("Second Array: ");
		print(second);
		
		compare(first, second);
		
	}
	
		public static void print(int[] array) {
			System.out.print(array[0]);
			for (int i = 1; i < array.length; i++) {
				System.out.print(", " + array[i]);
			}
			System.out.println();
		}
		public static void compare(int[] first, int[] second) {
			if (first.length == second.length){
				int count = 0;
				for (int i = 0; i < first.length; i++) {
					int firstValue = first[i];
					int secondValue = second[i];
					if (firstValue == secondValue) {
					count++;
					}
				}
				
				if (count == first.length) {
					System.out.println("They contain the same elements");
				}
				else {
					System.out.println("The elements are different.");
				}
			
			}
				
			else {
				System.out.println("The elements are different");
			}
		}
}
			