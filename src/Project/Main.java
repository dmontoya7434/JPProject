package Project;

import static jdk.nashorn.internal.objects.Global.print;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Daniel Montoya Date: 9/29/18 Citations: Oracal ilearning
 */

public class Main {

  public static void main(String args[]) {

    //testProduct();
    //AudioPlayerDriver.testAudioPlayer();
    //MoviePlayerDriver.testMoviePlayer();

    //MoviePlayerDriver.testMoviePlayer();
    //PlayerDriver.testPlayer();

    //JP Project 16
//    ArrayList<Product> productsArrayList;
//    productsArrayList = testCollection();
//    Collections.sort(productsArrayList);
//    print(productsArrayList);
  }

  public static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<Product>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here
  private static <E> void print(ArrayList<E> productList) {
    for (E p : productList) {
      System.out.println(p);
    }
  }

  public static void testProduct() {
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    ArrayList<Widget> widgets = new ArrayList<>();
    widgets.add(w1);
    widgets.add(new Widget("in add"));
    widgets.add(new Widget("in add2"));

    for (Widget w : widgets) {
      System.out.println(w.toString());
    }

    ArrayList<Widget> widgets2 = new ArrayList<>();

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.code);
    }
  }

}



