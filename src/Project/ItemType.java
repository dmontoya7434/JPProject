package Project;

/**
 * Name: Daniel
 * Description: Enum called ItemType
 * Date: 9/29/18
 * Citations: Oracal ilearning
 */

public enum ItemType {
  // Enum types
  AUDIO ("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  private final String code;

  ItemType(String code) {

    this.code = code;
  }



  public String getcode() {
    return code;
  }
}
