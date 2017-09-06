import java.util.*;

public class FixedWidthPrinting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the Width? Width: ");
		int width = input.nextInt();
		System.out.println();

		String[] inputArray = {"Well,", "I", "woke", "up", "to",
			"get", "me", "a", "cold", "pop",
			"and", "then", "I", "thought", "somebody",
			"was", "barbecuing.", "I", "said,", "\"Oh,",
			"Lord,", "Jesus,", "It's", "a", "fire!\"",
			"Then", "I", "ran", "out.", "I",
			"didn't", "grab", "no", "shoes", "or",
			"nothin',", "Lord", "Jesus.", "I", "ran",
			"for", "my", "life.", "And", "then",
			"the", "smoke", "got", "me.", "I",
			"got", "bronchitis.", "Ain't", "nobody", "got",
			"time", "for", "that."
		};

		print(inputArray, width);
		System.out.println(); //puts a space between end of last running of the program and the command line (for neatness)
	}
	public static void print(String [] theWords, int width) {
		int start = 0; //dictates the current position in the array
		int lineNumber = 0; // decides if line is even or odd
		boolean runProgram = true; 
		//variable used to deal with "index out of bounds" error in final while check
		//in the situation when the final word fits on the current line
		
		while(runProgram && theWords[start] != theWords[theWords.length - 1]) { //stops the program once the end of the array has been reached
			int characterCount = 0; //keeps track of the amount of characters currently used up in the line
			int words = 0; //keeps track of the amount of words to be printed in a given line
			int spaces = 0; //keeps track of the amount (but not the size of) spaces in a given line
			lineNumber++; // increases after each line, in order to keep track of line being even or odd
			
			boolean notLastWordLine = true; //variable that keeps track of whether a word is the last word to be printed on a given line. (reset every line as true)
			boolean notLastWordParagraph = true; //variable that keeps track of whether a word is the last word in the paragraph
			
			if (theWords[start].length() >= width){ //allows a word to be printed in the rare case that it is longer than the column width itself
				System.out.println(theWords[start]);
				start++;
			}
			else {
			for (int i = start; notLastWordParagraph && notLastWordLine; i++) { 
			//for-loop set to stop once the maximum number of words in a line has been reached
			
				words++; //calculates the number of words that are to be printed on a given line and increases each run of the for-loop
				
				characterCount += theWords[i].length(); //increases the character count by the amount of characters in the word
				if (theWords[i + 1] == theWords[theWords.length - 1]) { //checks if this is the last word in the paragraph
				notLastWordParagraph = false;
				}
				if (( notLastWordParagraph ) && (characterCount + theWords[i + 1].length() + 1 <= width)) { //checks if this is the last word in the line, and adds a space (and character count) if needed
					characterCount++;
					spaces++;
					
	
				}
				else {
					notLastWordLine = false; // this being set to false ends the for-loop so no more words are added, as this is the last word of the line
				}
				
			}
			
			
			start+= words; //updates the start position
			if (notLastWordParagraph == false && characterCount + theWords[theWords.length - 1].length() + 1 <= width) {
				characterCount+= theWords[theWords.length - 1].length() + 1;
				spaces++;
				start++;
				words++;
				notLastWordParagraph = true;
				runProgram = false;
			}
			int averageExtraSpaces = 0;
			int remainderSpaces = 0;
			
			int extraCharacters = (width - characterCount); //calculates the amount of extra characters needed to be filled by extra spaces
			
			if (spaces == 0) {
				spaces++;
			}
				averageExtraSpaces = (extraCharacters / spaces); // calculates the amount of extra spaces that will be allocated to every gap
				remainderSpaces = (extraCharacters % spaces); //calculates the amount of extra spaces that will be allocated to only some of the gaps
			
			
			if (lineNumber % 2 != 0) { //checks if this is an even or odd-line, and then allows the appropriate for-loop to execute.
			//executes if this is an odd line
				for (int k = start - words; k < start; k++) { //sets variable k to be "words" less than the start position, and then prints words sequentially from the array until k is equel to the start postion  
					System.out.print(theWords[k]); 
			
					if ( 0 < spaces) { 
						System.out.print(" "); // prints at least one space for every gap
						if (runProgram) { //does not allow extra spaces if it is the last line
							for (int r = 0; r < averageExtraSpaces; r++) {
								System.out.print(" "); //prints the amount of extra spaces that are allocated to every gap, if any
							}
					
				
							if(remainderSpaces > 0) {
								System.out.print(" "); //prints any left over spaces that are only allocated to some gaps, if any
								remainderSpaces -= 1;
							}
						}
						spaces--;	
					}
				}
			}
			
			else {
				int delay = (spaces - remainderSpaces); //variable used to delay allocation of left over spaces until later, so that they will print on the right side, rather than the left
				//executes if this is an even line
				for (int k = start - words; k < start; k++) {
				
					System.out.print(theWords[k]);
			
					if (0 < spaces) {
						System.out.print(" ");
						if (runProgram) { //does not allow extra spaces if this is the last line
							for (int r = 0; r < averageExtraSpaces; r++) {
								System.out.print(" ");
							}
						
				
							if( delay <= 0 && remainderSpaces > 0 ) {
							//starts printing remainder spaces once enough spaces have been skipped so that the remainder spaces will print on the right side
								System.out.print(" ");
								remainderSpaces -= 1;
							}
						}
						delay -= 1; //updates delay variable
						spaces--;
					}
				}
			}
				
			if (notLastWordParagraph == false){ 
			//prints the last word of the paragraph on a new line if it cannot fit on the current line
				System.out.println();
				System.out.print(theWords[theWords.length -1]);
			}
			else { //if it is not the last word, starts a new line
			System.out.println();
			}
		}
		}
	}
	
}


	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		