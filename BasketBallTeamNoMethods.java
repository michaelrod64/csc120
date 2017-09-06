import java.util.*;
import java.io.*;

public class BasketBallTeamNoMethods {

	public static String[] POSITION_NAMES = {"Point Gaurd", 
		"Shooting Guard", "Small Foward", "Power Forward", "Center"};
		
		
		
		
		
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input;
		int numberOfTeams;
		
		String[] teamNames; 
		String[][] playerNames;
		double[][] playerRatings;
		int[] bestPlayerIndex; 
		int[] secondBestIndex; 
		
		input = new Scanner(new File(args[0]));
		numberOfTeams = input.nextInt();
		
		teamNames = new String[numberOfTeams];
		playerNames = new String[numberOfTeams][5];
		playerRatings = new double[numberOfTeams][5];
		bestPlayerIndex = new int[5];
		secondBestIndex = new int[5];
		
		
		
		for (int i = 0; i < numberOfTeams; i++) {
			teamNames[i] = input.next();
			for (int j = 0; j < 5; j++) {
				playerNames[i][j] = input.next();
			}
			for (int k = 0; k < 5; k++) {
				playerRatings[i][k] = input.nextDouble(); 
			}
		}
		
		for (int j = 0; j < 5; j++) {
			double bestValue = 0;
			for (int i = 0; i < numberOfTeams; i++) {
				if (playerRatings[i][j] > bestValue) {
					bestValue = playerRatings[i][j];
					bestPlayerIndex[j] = i;
				}
			}
		}
	
		for (int j = 0; j < 5; j++) {
			double secondBest = 0;
			for (int i = 0; i < numberOfTeams; i++) {
				if ((playerRatings[i][j] > secondBest) && (playerRatings[i][j] <
					playerRatings[bestPlayerIndex[j]][j]) ) {
					secondBest = playerRatings[i][j];
					secondBestIndex[j] = i;
				}
			}
		}
		
		System.out.println("The all-star team: ");
		for (int position = 0; position < 5; position ++) {
			System.out.printf("%s: %s from %s with rating of %.2f%n",
			POSITION_NAMES[position],
			playerNames[bestPlayerIndex[position]][position],
			teamNames[bestPlayerIndex[position]],
			playerRatings[bestPlayerIndex[position]][position]);
		}
		System.out.println("The second-best team: ");
		for (int position = 0; position < 5; position ++) {
			System.out.printf("%s: %s from %s with rating of %.2f%n",
			POSITION_NAMES[position],
			playerNames[secondBestIndex[position]][position],
			teamNames[secondBestIndex[position]],
			playerRatings[secondBestIndex[position]][position]);
		}
	}
}

