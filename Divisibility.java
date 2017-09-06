public class Divisibility {
	public static void main(String[] args) {
		Divisibility2(5, 2);
	}
		public static void Divisibility2(int a, int b) {
			if (b == 0) {
				System.out.println("The answer is undefined");
			}
			
			else if (a % b == 0) {
				System.out.println(a + " is divisible by " + b + " yay!");
			}
			else {
				System.out.println(a + " is not divisible by " + b + " boo!");
			}
		}	
}