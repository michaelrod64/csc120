import java.util.*;

public class OddNumbers {
	public static void main (String[] args) {
		createArray ();
	}





		public static void createArray() { 
			int max = 38;
			int min = -6;
			
			if (min % 2 == 0) {
				min = min + 1;
			}
			if (max % 2 == 0) {
				max = max - 1;
			}
			int[] odd = new int [(max - min) / 2 + 1];

			for (int i = 0; i < odd.length; i++) {
				odd[i] = min;
				System.out.println(odd[i]);
				min = min + 2;
			}
		}
	
}		
		
		
