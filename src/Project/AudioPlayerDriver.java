package Project;

/**
 * Name: Daniel Description: Enum called ItemType Date: 9/29/18 Citations: Oracal ilearning.
 */

public class AudioPlayerDriver {

  /**
   * Create a driver class for AudioPlayer that will test to see whether we can instantiate
   * occurrences of it, use the media controls and print out their details to the console.
   *
   * @param args main.
   */
  public static void main(String[] args) {
    // Create a driver class for AudioPlayer that will test to see
    // wheater we can instantiate occurrences of it, use the media
    // controls and print out their details to the console
    AudioPlayer s1 = new AudioPlayer("Ipod Mini", "MP3", ItemType.AUDIO);
    AudioPlayer s2 = new AudioPlayer("Walkman", "WAV", ItemType.AUDIO);
    System.out.println(s1);
    System.out.println(s2);
    s1.play();
    s1.stop();
    s1.previous();
    s1.next();

  }
}
