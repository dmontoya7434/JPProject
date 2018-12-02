package Project;

/**
 * Name: Daniel Description: Enum called ItemType. Date: 9/29/18 Citations: Oracal ilearning.
 */

// Step 9: Create a class called Screen that implements ScreenSpec
//         with 3 fields.
public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshrate;
  private int responsetime;

  Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

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
    return "Resolution: " + resolution + "\n"
        + "Refresh Rate: " + refreshrate + "\n"
        + "Response Time: " + responsetime;
  }
}
