package Project;
/**
 * Name: Daniel Description: interface that is called Project.Item and includes functions Date:
 * 9/29/18 Citations: Oracal ilearning
 */

//java class that shows the date

import java.util.Date;

// Step 1: Create an interface called Item

public interface Item {

  //constant called manufacturer that would be set to "OracleProduction
  public static final String manufacturer = "OracleProduction";

  //method setProductionNumber that takes one integer parameter
  void setProductionNumber(int number);

  //method setName that takes a String parameter
  void setName(String name);

  //method getName that returns a String
  String getName();

  // method getManufacturerDate that returns a Date
  Date getManufactureDate(Date date);

  //method getSerialNumber that returns an integer
  int getSerialNumber();


}
