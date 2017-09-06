public class Physics {
		public static void formula() { 
			double initial_position, initial_velocity, acceleration, seconds, position;
			initial_position = 5.5;
			initial_velocity = 6.7;
			acceleration = 9.8;
			seconds = 7.5;
			
			position = initial_position + (initial_velocity * seconds) + (.5 * acceleration * (seconds * seconds));
			
			System.out.println("The position of the body is: " + position + " Meters.");
		}	
	public static void main(String[] args) {
		formula();
	}
}
		