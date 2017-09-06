// class for testing class Mango
public class MangoTest {
  public static void main(String[] args) {
    // create one mango
    Mango myMango = new Mango("Alfonso", 250, 400);
    // repeat the method process for 20 years and create output
    for (int i=0; i<20; i++) {
      // print whether the tree has been trimmed
      if (myMango.process()) {
        System.out.print("Trimmed.     ");
      }
      else {
        System.out.print("Not trimmed. ");
      }
      // print information
      System.out.print("kind="+myMango.getKind());
      System.out.print(", height=" + myMango.getHeight());
      System.out.print(", price=" + myMango.getPrice());
      System.out.println(", harvest=" + myMango.getHarvest());
    }
  }
}