package Project;

/**
 * Name: Daniel Description: Enum called ItemType Date: 9/29/18 Citations: Oracal ilearning.
 */

public class AudioPlayerDriver {

  /**
   * Create a driver class for AudioPlayer that will test to see whether we can instantiate
   * occurrences of it, use the media controls and print out their details to the console.
   */
  public static void testAudioPlayer() {

    AudioPlayer s1 = new AudioPlayer("iPod Mini", "MP3");
    s1.play();
    s1.stop();
    s1.next();
    s1.previous();
    System.out.println(s1.toString());

    AudioPlayer s2 = new AudioPlayer("Walkman", "WAV");
    System.out.println(s2.toString());
  }


}
