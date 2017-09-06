public class PrintStrings2 {
	public static void main(String[] args) {
		printStrings("abc", 5);
	}
	public static void printStrings(String letters, int repetitions) {
		for (int i = 1; i <= repetitions; i++) { 
			System.out.print(letters);
		}
	}
}
		