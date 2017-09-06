public class ReverseIntegers {
	public static void main(String[] args) {
		int[] integers = {13, 27, 92, -6, 45};
		
		printAll(integers);
		integers = reverse(integers);
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

	public static int[] reverse(int[] integers) {
		int[] substitute = new int[integers.length];
		for (int i = 0; i < integers.length; i++) {
			 substitute[i] = integers[integers.length - 1 - i];
			 System.out.print(substitute[i]);
		}
		integers = substitute;
		return integers;
	}
}
	