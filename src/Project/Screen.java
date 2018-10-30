package Project;

// Step 9: Create a class called Screen that implements ScreenSpec
//         with 3 fields.
public class Screen implements ScreenSpec {

  String resolution;
  int refreshrate;
  int responsetime;

  @Override
  public String getResolution() {
    return this.resolution;
  }

  @Override
  public int getRefreshRate() {
    return this.refreshrate;
  }

  @Override
  public int getResponseTime() {
    return this.responsetime;
  }

  @Override
  public String toString() {
    return "Resolution  : " + resolution + "\n" +
        "Refresh Rate   : " + refreshrate + "\n" +
        "Response Time  : " + responsetime;
  }
}
