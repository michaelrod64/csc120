import java.util.*;

public class FixedWidthPrinting2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Width?");
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
		System.out.println(inputArray.length);
		System.out.println(inputArray[0].length());
		print(inputArray, width);
	}
	public static void print(String [] theWords, int width) {
		int start = 0;
		int j = 0;
		
		while(start < theWords.length - 1) {
			int characterCount = 0;
			int words = 0;
			int spaces = 0;
			j++;
			int i = 0;
			boolean notLastWord = true;
			for (i = start; (notLastWord) && (((characterCount + theWords[i + 1].length())) <= width); i++) {
				
				characterCount += theWords[i].length();
				start++;
				words++;
				
				
				if ((characterCount + theWords[i + 1].length()) < width) {
					characterCount++;
				
				}
				 if (i + 2 >= theWords.length) {
					 notLastWord = false;
					 start++;
					 words++;
					 characterCount+= theWords[i + 1].length();
				 }	 
			}
			
			
			
			spaces = words - 1;
			if (j > 1) {
				words -= 1;
			}
			int gaps = 0;
			int extraCharacters = width - characterCount;
			int averageExtraSpaces = (extraCharacters / spaces);
			int remainderSpaces = (extraCharacters % spaces);
			
			
			for (int k = start - words; k <= start; k++) {
				System.out.print(theWords[k]);
				if (gaps <= spaces) {
					System.out.print("^");
					for (int r = 0; r < averageExtraSpaces; r++) {
					System.out.print("^");
					}
					gaps++;
				
					if(remainderSpaces > 0) {
						System.out.print("^");
						remainderSpaces -= 1;
					}
						
				}
			}
				
			System.out.println();
			

		
	}
}
}

//Well, I woke up to get me a cold pop and
//then I thought somebody was  barbecuing.
//I  said, “Oh, Lord, Jesus, It's a 
//Then I ran out. I didn't grab  no  shoes
//or  nothin',  Lord  Jesus.  I ran for my
//life. And then the smoke got me.  I  got
//bronchitis.  Ain't  nobody  got time for
//that.


