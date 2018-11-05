package Project;

/**
 * Name: Daniel Description: Enum called ItemType Date: 9/29/18 Citations: Oracal ilearning.
 */

//Step 2: Create an enum called ItemType
public enum ItemType {
  // Enum types
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  public final String code;

  ItemType(String code) {

    this.code = code;
  }


  public String getcode() {
    return code;
  }
}
