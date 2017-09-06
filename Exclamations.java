public class Exclamations {
	public static final int HEIGHT = 20;
	
	public static void main(String[] args) {
		nestedLoop();
	}
		public static void nestedLoop() {
			for ( int i = 1; i <= HEIGHT; i++) {
				for (int j = 1; j < i; j++) {
					System.out.print("\\\\");
				}	
				for (int k = (HEIGHT * 4) -2; k > (i * 4)- 4; k--) {
						System.out.print("!");
				}
				for (int p = 1; p < i; p++) {
					System.out.print("//");
				}
				System.out.println(); 
			}
				
		}
	
}	