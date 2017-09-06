import java.util.*;
import java.io.*;
import java.awt.*;
public class MasterMind {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName = askName(input);
		boolean firstTry = true;
		boolean success = false;
		int[] answerArray = getAnswerArray();
		
		while (!success) {
			int userNumber = promptAndInput(input, firstTry);
			int[] inputArray =  getInputArray(userNumber);
				success = calculateAndPrint(answerArray, inputArray);
				firstTry = false;
		}
		System.out.println("Congratulations, " + userName + "! You guessed the number!");
	}
	
	
	
			
			public static boolean calculateAndPrint(int[] answerArray, int[] inputArray) {
				int correct = 0;
				int correctNumber = 0;
				boolean found1st = false;
				boolean found2nd = false;
				boolean found3rd = false; 
				boolean found4th = false;

				for (int i = 0; i <= 3; i++) {
					if (answerArray[i] == inputArray[i]) {
						correct++;
						switch(i) {
							case 0: found1st = true;
									break;
							case 1: found2nd = true;
									break;
							case 2: found3rd = true;
									break;
							case 3: found4th = true;
						}
					}
				}
						for (int k = 0; k <= 3; k++) {
							for (int j = 0; j <= 3; j++) {
								
								if (k == 0 && found1st) {
									k++;
									j++;
								}
								if (k == 1  && found2nd) {
									k++;
									j++;
								}
								if (k == 2  && found3rd) {
									k++;
									j++;
								}
								if (k == 3  && found4th) {
									break;
								}
								
								if (answerArray[k] == inputArray[j]) {
									if (!(k == 3 && found4th)) {
										correctNumber++;
									}
								 //ends second for-loop early if a matching number is found
									   //otherwise, a guess with one "2" would result in 4
									   //"correctNumber"s if the answer was "2222"
								}
							}
						}
			
						
			
				
				if (correct == 1) {
				System.out.println(correct + " digit is correct and in the correct place");
				}
				else {
				System.out.println(correct + " digits are correct and in the correct place.");
				}
				if (correctNumber == 1) {
					System.out.println(correctNumber + "digits are correct, but in the incorrect place.");
					System.out.println();
				}
				else {
					System.out.println(correctNumber + " digits are correct, but in the incorrect place.");
					System.out.println();
				}
				
				switch(correct) {
					case 0: System.out.println("Guess Again!");
							break;
					case 1: System.out.println("Hey! You got one! :p");
							break;
					case 2: System.out.println("Getting warmer...");
							break;
					case 3: System.out.println("Almost there...");
							break;
					case 4: return true;
				}
				
				return false;
	
			}
		public static String askName(Scanner input) {
			System.out.println();
			System.out.println("Hello! What is your name?");
			System.out.print("Enter your name: ");
			String userName = input.next();
			System.out.println();
			return userName;
		}
		
		public static int promptAndInput(Scanner input, boolean firstTry) {
			if (firstTry) {
			System.out.println("I'm thinking of a four digit number. Try and guess it!");
			}
			System.out.print("Enter number: ");
			
				
			int userNumber = input.nextInt();
			while (!((userNumber >= 1000) && (userNumber <= 9999))) {
				System.out.println("Incorrect input");
				System.out.print("Please enter a four-digit number: ");
				userNumber = input.nextInt();
			}
			return userNumber;
		}
		
		public static int[] getAnswerArray() {
		
			int hiddenNumber = getRandomInteger(1000, 9999);
			
			int[] answerArray = new int[4];
			for (int i = 3; i >= 0; i--) {
				answerArray[i] = hiddenNumber % 10;
				hiddenNumber = hiddenNumber / 10;
		}
		
			return answerArray;
		}
		
		public static int[] getInputArray(int userNumber) {
			
			int[] inputArray = new int[4];
			for (int i = 3; i >= 0; i--) {
				inputArray[i] = userNumber % 10;
				
				userNumber = userNumber / 10;
			}
			return inputArray;
	}
		
		
		
		
		
		
		
		
		public static int getRandomInteger(int min, int max) {
		
			Random rand = new Random();
		
			int randomNum = rand.nextInt((max - min) + 1) + min;
			
			return randomNum;
	}
}
	