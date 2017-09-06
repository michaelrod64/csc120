import java.util.*;
public class Cannibals {
	public static void main(String[] args) {
		boolean[][][] answers = new boolean[4][4][2];
		System.out.println("There are three Missionaries and three Cannibals on the left side of a river with a boat that seats two. If the missionaries outnumber the cannibals, then they are eaten. This program shows the series of steps to get across");
		if (missionaries(3, 3, 1, answers)) {
			System.out.println("The problem is solved.");
		}
	}
	public static  boolean missionaries(int m, int c, int b, boolean[][][] a) {
		if ((m < 0) || (c < 0) || (b < 0) || (m > 3) || (c > 3) || (b > 1)) {
			return false;
		}
		if ((m < c) || ((3 - m) < (3 - c))) {
			return false;
		}
		if (m == 0 && c == 0 && b == 0) {
		return correct(m, c, b);
		}
		else if (b == 1) {
			if (!(a[m][c][b]) && missionaries(m - 2, c, b - 1, a)) {
				a[m][c][b] = true;
				return correct(m, c, b);	
			}
			else if (!(a[m][c][b]) && missionaries(m - 1, c, b - 1, a)) {
				a[m][c][b] = true;
				return correct(m, c, b);
			}
			else if (!(a[m][c][b]) && missionaries(m, c - 2, b - 1, a)) {
				a[m][c][b] = true;
				return correct(m, c, b);
			}
			else if (!(a[m][c][b]) && missionaries(m, c - 1, b - 1, a)) {
				a[m][c][b] = true;
				return correct(m, c, b);
			}
			else if (!(a[m][c][b]) && missionaries(m - 1, c - 1, b - 1, a)) {
				a[m][c][b] = true;
				return correct(m, c, b);
			}
		} 
		else if (b == 0) {
			if (!(a[m][c][b]) && missionaries(m + 2, c, b + 1, a)) {
				a[m][c][b] = true;
				return correct(m, c, b); 
			}
			if (!(a[m][c][b]) && missionaries(m + 1, c, b + 1, a)) {
				a[m][c][b] = true;
				return correct(m, c, b);
			}
			if (!(a[m][c][b]) && missionaries(m, c + 2, b + 1, a)) {
				a[m][c][b] = true;
				return correct(m, c, b);
			}
			if (!(a[m][c][b]) && missionaries(m, c + 1, b + 1, a) ) {
				a[m][c][b] = true;
				return correct(m, c, b);
			}
			if (!(a[m][c][b]) && missionaries(m + 1, c + 1, b + 1, a)) {
				a[m][c][b] = true;
				return correct(m, c, b);
			}
		}	
		return false;
	}
	public static boolean correct(int m, int c, int b) {
			System.out.println(m + " Missionaries, " + c + " Cannibals, and "  + b + " boats on the left side of the river");
			System.out.println((3 - m) + " Missionaries, " + (3 - c) + " Cannibals, and " + (1 - b) + " boats on the right side of the river");
			return true;
	}
				
			
}
	
		
						
		