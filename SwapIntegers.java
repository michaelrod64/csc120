public class SwapIntegers {
	public static void main(String[] args) {
		int[] integers = {74, 85, 102, 99, 101, 56, 84};
		printAll(integers);
		swap(integers, 1, 3);
		printAll(integers);
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

	public static void swap(int[] integers, int numberOne, int numberTwo) {
		int storeFirstElement = integers[numberOne];
		integers[numberOne] = integers[numberTwo];
		integers[numberTwo] = storeFirstElement;
	}
}
	
		