import java.util.*;

public class AverageString {
	public static void main(String[] args) {
		String[] objects = {"belt", "hat", "jelly", "bubble gum"};
		average(objects);
	}
	
	public static void average(String[] objects) {
		int sum = 0;
		for (int i = 0; i < objects.length; i++){
			sum += objects[i].length();
		}
		System.out.println((double) sum / objects.length);
	}
}