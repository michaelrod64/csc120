public class WriteBinary {
	public static void main(String[] args) {
		writeBinary(44);
	}
	public static void writeBinary(int n) {
		if (n < 0) {
			System.out.print("-");
			writeBinary(-n);
		}
		if (n <= 1) {
			System.out.print(n);
		}
		else {
			writeBinary(n / 2);
			System.out.print(n % 2);
		}
	}
}