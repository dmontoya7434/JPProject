package Project;

/**
 * Name: Daniel Description: Enum called ItemType Date: 9/29/18 Citations: Oracal ilearning.
 */

//Step 7: Create an enum called MonitorType that will store
public enum MonitorType {
  LCD("LCD"),
  LED("LED");

  public String code;

  MonitorType(String code) {
    this.code = code;
  }

}
