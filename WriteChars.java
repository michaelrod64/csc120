public class WriteChars {
	public static void main(String[] args) {
		writeChars(10);
	}
	public static void writeChars(int n) {
		if (n == 1) {
			System.out.print("*");
		} else if (n == 2) {
			System.out.print("**");
		} else {
			System.out.print("<");
			writeChars(n - 2);
			System.out.print(">");
		}
	}
}