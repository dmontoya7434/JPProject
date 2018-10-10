package Project;

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
