public class StandardDeviation {
	public static void main(String[] args) {
		int[] values = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
		stdev(values);
	}
	
	public static void stdev(int[] values) {
		double sumDiff = 0;
		double average = findAverage(values);
		for (int i = 0; i < values.length; i++) {
			sumDiff+= Math.pow((values[i] - average), 2);
		}
		
		double standardDeviation = Math.sqrt(sumDiff / (values.length - 1));
		System.out.printf("The Standard Deviation is: %.3f", standardDeviation);
	}
		
		
		
		
	public static double findAverage(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum+= values[i];
		}
		double average = (double) sum / values.length;
		return average;
	}
}