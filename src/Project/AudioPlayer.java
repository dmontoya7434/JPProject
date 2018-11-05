package Project;

/**
 * Name: Daniel Description: Enum called ItemType Date: 9/29/18 Citations: Oracal ilearning.
 */

// Step 5: Create a class called AudioPlayer that is a subclass
//         of Product and implements MultimediaControl interface
public class AudioPlayer extends Product implements MultimediaControl {

  // fields

  String audioSpecification;
  ItemType mediaType;

  /**
   * Create a constructor that will take in 2 parameters – name and audioSpecification. The
   * constructor should call its parents constructor and also setup the media type.
   *
   * @param name String parameter.
   * @param audioSpecification String parameter.
   * @param mediaType String parameter
   */
  public AudioPlayer(String name, String audioSpecification, ItemType mediaType) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;
  }

  //Implementation methods
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
    return "Audio Specification: " + this.audioSpecification + "\n"
        + "Media Type: " + this.mediaType;
  }

  //  public AudioPlayer(String sudioSpecification, String name) {
  //
  //    this.audioSpecification = sudioSpecification;
  //    //this.mediaType = name;
  //  }
}
