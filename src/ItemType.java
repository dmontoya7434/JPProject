/**
 * Daniel Montoya
 * Date: 9/29/18
 * Description: An enum called ItemType tha will store 4 types
 * Citations: Oracal ilearning
 */

public enum ItemType {

  //emum types
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBIL("AM"),
  VISUALMOBILE("VM");


  //Field
  private final String code;

  //Constructor
  ItemType(String code) {

    this.code = code;
  }

  public String getcode() {

    return code;
  }
}


