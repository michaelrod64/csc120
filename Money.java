public class Money {
	public static void main(String[] args) {
		int quarters2 = countQuarters(177);
		System.out.println("There are " + quarters2 + " quarters.");
	}
		public static int countQuarters(int cents) {
				for (int i = cents; i >= 100; i = i - 100) {
					cents -= 100;
				}
				int quarters = cents/25;
				return quarters;
		}
}		
