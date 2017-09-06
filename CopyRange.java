public class CopyRange {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6, 7};
		int[] array2 = {8, 9, 10, 11, 12, 13, 14};
		int startingIndex1 = 0;
		int startingIndex2 = 2;
		int length = 4;
		printAll(array1);
		printAll(array2);
		copyRange(array1, array2, startingIndex1, startingIndex2, length);
		printAll(array1);
		printAll(array2);
	}
	public static void printAll(int[] integers) {
		System.out.print("{");
		System.out.print(integers[0]);
		for (int i = 1; i < integers.length; i++) {
			System.out.print(", ");
			System.out.print(integers[i]);
		}
		System.out.println("}");
	}

	public static void copyRange(int[] array1, int[] array2, int startingIndex1, 
		int startingIndex2, int length) 
	{
		for (int i = startingIndex1; i < startingIndex1 + length; i++) {
			array2[startingIndex2 + (i - startingIndex1)] = array1[i];
		}
			
	}
}
	