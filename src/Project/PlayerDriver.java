package Project;

public class PlayerDriver {


  public static void testPlayer() {
    MoviePlayer mymovie = new MoviePlayer("DBPOWER MK101", new Screen("720x480", 40, 22),
        MonitorType.LCD);
    MoviePlayer mymovie2 = new MoviePlayer("Pyle PDV156BK", new Screen("1366x768", 40, 22),
        MonitorType.LED);
    System.out.println(mymovie);
    System.out.println(mymovie2);

    AudioPlayer s2 = new AudioPlayer("Walkman", "WAV");
    s2.next();
    s2.play();
    s2.previous();
    s2.stop();

    mymovie.next();
    mymovie.play();
    mymovie.previous();
    mymovie.stop();
  }
}

