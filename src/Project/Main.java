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

    // Create a driver class for AudioPlayer that will test to see
    // wheater we can instantiate occurrences of it, use the media
    // controls and print out their details to the console
    AudioPlayer player = new AudioPlayer("myplayer","myspecs",ItemType.AUDIO);
    System.out.println(player);
    player.play();
    player.stop();
    player.previous();
    player.next();
    System.out.println();

    Screen myscreen = new Screen();
    System.out.println(myscreen);
    System.out.println();

    MoviePlayer mymovie = new MoviePlayer("mymovie");
    System.out.println(mymovie);
    System.out.println();



    for (ItemType it: ItemType.values()) {
      System.out.println(it + " " + it.getcode());
    }


  }

}
