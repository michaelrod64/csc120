import java.awt.*;
import java.util.*;

public class DrawPhysics {
	 public static final double EARTH_ACCELERATION = -9.81; // meters/second^2
	 public static void main(String[] args) {
		
 // This program computes the trajectory of a projectile.
  // for Scanner
 Scanner console = new Scanner(System.in);
 giveIntro();
 int panelWidth = 420;
 int panelHeight = 220;
 DrawingPanel panel = new DrawingPanel(panelWidth, panelHeight);
 Graphics g = panel.getGraphics();
 panel.setBackground(Color.CYAN);
 
 System.out.print("velocity (meters/second)? ");
 double velocity = console.nextDouble();
 System.out.print("angle relative to horizontal (degrees)? ");
 double angle = Math.toRadians(console.nextDouble());
 System.out.print("number of steps to display? ");
 int steps = console.nextInt();
 System.out.println();

 printTable(g, velocity, angle, steps, panelHeight);
 }
 // prints a table showing the trajectory of an object given its initial
 // velocity and angle and including the given number of steps in the
 // table
 public static void printTable(Graphics g, double velocity, double angle, int steps, int panelHeight) {
	g.setColor(Color.BLACK);
	double xVelocity = velocity * Math.cos(angle);
	double yVelocity = velocity * Math.sin(angle);
	double totalTime = - 2.0 * yVelocity / EARTH_ACCELERATION;
	double timeIncrement = totalTime / steps;
	double xIncrement = xVelocity * timeIncrement;

	double x = 0.0;
	double y = 0.0;
	double t = 0.0;
	
	for (int i = 1; i <= steps; i++) {
		t += timeIncrement;
		x += xIncrement;
		y = displacement(yVelocity, t, EARTH_ACCELERATION);
		g.fillOval((int) (x * 4.6) , panelHeight - (int) (y * 4.6 ), 6, 6);
	}
 }
 

 // gives a brief introduction to the user
 public static void giveIntro() {
 System.out.println("This program computes the trajectory of a");
 System.out.println("projectile given its initial velocity and");
 System.out.println("its angle relative to the horizontal. Use");
 System.out.println("an even number of steps if you want to include");
 System.out.println("the high point reached by the projectile.");
 System.out.println();
 }

 // returns the horizontal displacement for a body given its initial
// velocity v, elapsed time t and acceleration a
 public static double displacement(double v, double t, double a) {
 return v * t + 0.5 * a * t * t;
 }

 // rounds n to 2 digits after the decimal point
 public static double round2(double n) {
 return (int) (n * 100.0 + 0.5) / 100.0;
 }
 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	