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
  public final String manufacturer = "OracleProduction";

  //method setProductionNumber that takes one integer parameter
  public void setProductionNumber(int productionNumber);

  //method setName that takes a String parameter
  public void setName(String name);

  //method getName that returns a String
  public String getName();

  // method getManufacturerDate that returns a Date
  public Date getManufactureDate();

  //method getSerialNumber that returns an integer
  public int getSerialNumber();


}
