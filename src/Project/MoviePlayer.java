package Project;

public class MoviePlayer extends Product implements MultimediaControl {

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
    return "Screen      : " + screen + "\n" +
        "Monitor type   : " + monitortype;
  }
}
