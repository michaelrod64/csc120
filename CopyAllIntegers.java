public class CopyAllIntegers {
	public static void main(String[] args) {
		int[] array1 = {2, 1, 4, 3, 6, 5};
		
		System.out.print("array1: ");
		printAll(array1);
		int[] array2 = copyAll(array1);
		System.out.print("array1: ");
		printAll(array1);
		System.out.print("array2: ");
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

	public static int[] copyAll(int[] array1) {
		int[] array2 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			 array2[i] = array1[i];
		}
		return array2;
	}
}