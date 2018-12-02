package Project;

/**
 * Name: Daniel Description: Enum called ItemType. Date: 9/29/18 Citations: Oracal ilearning.
 */

//Step 11: Create a class called MoviePlayer that extends Product and
//         implements MultimediaControl.
public class MoviePlayer extends Product implements MultimediaControl {

  // add 2 fields with appropriate type
  private Screen screen;
  private MonitorType monitorType;

  MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }


  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopping movie");

  }

  @Override
  public void previous() {
    System.out.println("Previous movie");

  }

  @Override
  public void next() {
    System.out.println("Next movie");

  }

  @Override
  public String toString() {
    return super.toString() + "\n" + "Screen:" + screen + "\n"
        + "Monitor type:" + monitorType;
  }
}
