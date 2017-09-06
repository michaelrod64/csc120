public class Victories {
		public static void fowardSlash() { 
			System.out.println("//////////////////////");
		}
		public static void middle() {	
			System.out.println("|| Victory is mine! ||");
		}
		public static void backSlash() {
			System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		}
		public static void firstBox() {
			fowardSlash();
			middle();
			backSlash();
		}
		public static void otherBoxes() {
			middle();
			backSlash();
			
			
		}
		public static void fiveBoxes() {
			firstBox();
			otherBoxes();
			otherBoxes();
			otherBoxes();
			otherBoxes();
		}
				
	public static void main (String[] args) {
		fiveBoxes();
	}
}
	
	