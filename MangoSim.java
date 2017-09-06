import java.io.*;
import java.util.*;
import java.lang.Integer;
public class MangoSim {
	
	public static void printValue(int width, int v) {
		System.out.printf("%" + width + "s", String.format("$%,d.%02d", (v/100), (v%100)));
	}
	
	public static void main (String[] args) throws FileNotFoundException {
		Scanner input; 
		input = new Scanner(new File(args[0]));
		int nYears = 0; 
		nYears = Integer.parseInt((args[1]));
		int nTrees = input.nextInt();
		Mango[] theTrees = new Mango[nTrees];
		int[][] theTotalHarvests = new int[nTrees][nYears + 1];
		int max;
		int maxIndex;
		
		for(int i = 0; i < nTrees; i++) {
			theTrees[i] = new Mango(input.next(), input.nextInt(), input.nextInt());
		}
		
		for (int i = 0; i < nTrees; i++) {
			theTotalHarvests[i][0] = 0;
		}
		max = 0;
		maxIndex = -1;
		for (int i = 0; i < nTrees; i++) {
			for (int j = 1; j < nYears + 1; j++) {
				theTrees[i].process();
				theTotalHarvests[i][j] = theTotalHarvests[i][j - 1] + theTrees[i].getHarvest();
				if (theTotalHarvests[i][j] > max){
					maxIndex = i;
					max = theTotalHarvests[i][j];
				}
			}
		}
		
		System.out.printf("%16s", "kind");
		for (int j=1; j<=nYears + 1; j++) {
			System.out.printf("%11s", String.format("Yr%2d", j));
		}
		System.out.println();
		for (int i=0; i<nTrees; i++) {
			System.out.printf("%-16s", theTrees[i].getKind());
			for (int j=-1; j<nYears; j++) {
				printValue(11, theTotalHarvests[i][j + 1]);
			}
			System.out.println();
		}
		System.out.printf("The most profitable is %s with the total profit "
          + "of ", theTrees[maxIndex].getKind());
		printValue(11, max);
		System.out.println();
	}
}
	
		
		
		