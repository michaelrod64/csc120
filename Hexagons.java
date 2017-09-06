public class Hexagons {
		public static void top() {
			System.out.println("  _______");
			System.out.println(" /       \\");
			System.out.println("/         \\");
		}
		public static void middle() {
			System.out.println("_\"_'_\"_'_\"_");
			System.out.println();
		}
		public static void bottom() {
			System.out.println("\\         /");
			System.out.println(" \\_______/");	
		}

	public static void main (String[] args) {
		top();
		bottom();
		middle();
		top();
		bottom();
		middle();
		bottom();
		top();
		middle();
		bottom();
	}
}