package Project;

/**
 * Name: Daniel Description: Enum called ItemType.
 * Date: 9/29/18 Citations: Oracal ilearning.
 */

//Step 11: Create a class called MoviePlayer that extends Product and
//         implements MultimediaControl.
public class MoviePlayer extends Product implements MultimediaControl {

  // add 2 fields with appropriate type
  String screen;
  ItemType monitortype;

  public MoviePlayer(String name) {
    super(name);
  }


  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");

  }

  @Override
  public void previous() {
    System.out.println("Previous");

  }

  @Override
  public void next() {
    System.out.println("Next");

  }

  @Override
  public String toString() {
    return "Screen      : " + screen + "\n"
        + "Monitor type   : " + monitortype;
  }
}
