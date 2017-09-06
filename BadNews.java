public class BadNews {
	public static final int MAX_ODD = 21;

 	public static void writeOdds() {
 		// print each odd number
 		for (int i = 1; i <= ((MAX_ODD + 1) / 2); i++) {
 			int count = 2 * i - 1;
			System.out.print(count + " ");
 			
 		}
 		System.out.println();
 	}

	public static void writeOdds2() {
 		
 		for (int i = 1; i <= ((MAX_ODD + 3) / 4 ); i++) {
 			int count = 2 * i - 1;
			System.out.print(count + " ");
		}
		System.out.println();
	}

 	public static void main(String[] args) {
 		// write all odds up to 21
 		writeOdds();
 		writeOdds2();
	}
}