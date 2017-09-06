import java . util . Scanner ;

 public class ArithmeticShortHand {
 public static void main ( String [] args ) {
 Scanner keyboard = new Scanner ( System . in );
 double x , y ;
 System . out . print ( " Enter x : " );
 x = keyboard . nextDouble ();
 System . out . print ( " Enter y : " );
 y = keyboard . nextDouble ();
 System . out . println ( " x = " + x + " , y = " + y );
 x *= y ;
 System . out . println ( " x = " + x + " , y = " + y );
 y = x / y ;
 System . out . println ( " x = " + x + " , y = " + y );
 x /= y ;
 System . out . println ( " x = " + x + " , y = " + y );
 }
 }