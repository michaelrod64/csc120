public class WriteSequence {
	public static void main(String[] args) {
		writeSequence(1);
		System.out.println();
		writeSequence(2);
		System.out.println();
		writeSequence(3); 
		System.out.println();
		writeSequence(4); 
		System.out.println();
		writeSequence(5); 
		System.out.println();
		writeSequence(6);
		System.out.println();
		writeSequence(7); 
		System.out.println();
		writeSequence(8); 
		System.out.println();
		writeSequence(9); 
		System.out.println();
		writeSequence(10);
	}
	public static void writeSequence(int n) {
		if (n > 0) {
			System.out.print((n + 1)/ 2);
			writeSequence(n - 2);
			if (n != 1) {
				System.out.print((n + 1) / 2);
			}
		}
	}
}
