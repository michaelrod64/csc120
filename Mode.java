import java.util.*;

public class Mode {
	public static void main(String[] args) {
		
		int [] count = tally();
		determineMode(count);
	}
	
		public static int[] tally() {
			int max = 100;
			int[] count = new int[max];
			boolean runProgram = true;
			System.out.print("Enter a series of non-negative integers. Enter -1 to see the mode: ");
			Scanner input = new Scanner(System.in);
			while(runProgram) {
		
				int next = input.nextInt();
				if (next < 0) {
					runProgram = false;
				}
				else {
					if (next > max) {
				
						int[] transfer = new int[next + 1];
						for (int i = 0; i < count.length - 1; i++) {
							transfer[i] = count[i];
							max = next;
			
						}		
						count = transfer;
					}
					count[next]++;
				}
			}
			return count;
		}
		
		public static void determineMode(int[] count) {
			int currentModeCount = 0;
	
			for (int i = 0; i < count.length - 1; i++) {
				if (count[i] > currentModeCount) {
				currentModeCount = count[i];
				}
			}
			System.out.print("The mode is: ");
			for (int i =0; i < count.length - 1; i++) {
				if (count[i] == currentModeCount) {
					System.out.print(i + " ");
				}
			}
		}
}	
	