package Project;

/**
 * Daniel Montoya
 * Date: 9/29/18
 * Citations: Oracal ilearning
 */

public class Main {

  public static void main(String args[]) {


    // creates a new object class for Project.Widget
    Widget w1 = new Widget("Project.Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Project.Widget 2");
    System.out.println(w2.toString());

    for (ItemType it: ItemType.values()) {
      System.out.println(it + " " + it.getcode());
    }


    //ItemType AUDIO = new ItemType("AU")
    //System.out.println(ItemType.AUDIO.getcode());
  }

}
