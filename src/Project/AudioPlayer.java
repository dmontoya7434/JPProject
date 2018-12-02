package Project;

import java.util.Date;

/**
 * Name: Daniel Description: Enum called ItemType Date: 9/29/18 Citations: Oracal ilearning.
 */

// Step 5: Create a class called AudioPlayer that is a subclass
//         of Product and implements MultimediaControl interface
public class AudioPlayer extends Product implements MultimediaControl {

  // fields

  private String audioSpecification;
  private ItemType mediaType = ItemType.AUDIO;

  /**
   * Create a constructor that will take in 2 parameters – name and audioSpecification. The
   * constructor should call its parents constructor and also setup the media type.
   *
   * @param name String parameter.
   * @param audioSpecification String parameter.
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
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
    return super.toString() + "\n" + "Audio Spec:" + audioSpecification + "\n"
        + "Type:" + mediaType;
  }

}
