import java.util.*;

public class Bills {
public static Scanner console;
 public static void main(String[] args) {
	console = new Scanner(System.in);

 int numBills1 = getBills("John");
 int numBills2 = getBills("Jane");

 System.out.println("John needs " + numBills1 + " bills");
System.out.println("Jane needs " + numBills2 + " bills");
 }

 public static int getBills(String name) {
 System.out.print("How much will " + name + " be spending? ");
 double amount = console.nextDouble();
 System.out.println();

 int numBills = (int) (amount/20.0);
 if (numBills * 20.0 < amount) {
 numBills++;
 }

 return numBills;
 }
}