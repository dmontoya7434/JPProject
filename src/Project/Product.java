package Project;

import java.util.Date;

/**
 * Daniel Montoya Date: 9/29/18 Description: Create an abstract class called Project.Product that
 * will implement the Project.Item interface Citations: Oracal ilearning.
 */

// abstract class called Project.Product that implements Project.Item
public abstract class Product implements Item {

  //Fields to Project.Product
  private int serialNumber;
  private String manufacturer = Item.manufacturer;
  private Date manufactureredOn;
  private String name;

  private static int currentProductNumber = 1; //static

  //Constructor that will take the name of the product and
  //set it to the field name variable.

  /**
   *
   * @param name String parameter for the constructor class.
   */
  public Product(String name) {

    this.name = name;

    //Assigned a serial number from the currentProductNumber and increments
    //currentProductNumber
    serialNumber = currentProductNumber++;

    //Sets the current Date
    manufactureredOn = new Date();

    //manufacturer = Item.manufacturer;
  }

  //Stores the next number to be assigned to serialNumber
  public void setProductionNumber(int number) {
    currentProductNumber = number;
  }

  //Methods from the interface Project.Item
  public void setName(String name) {
    this.name = name;

  }

  /**
   *
   * @return the name.
   */
  public String getName() {

    return this.name;

  }

  public Date getManufactureDate(Date date) {

    return this.manufactureredOn;
  }

  /**
   *
   * @return the serial Number.
   */
  public int getSerialNumber() {
    return this.serialNumber;
  }

  /**
   *
   * @return the tostring().
   */
  public String toString() {
    return "Manufacturer   :" + manufacturer + "\n"
        + "Serial Number  :" + serialNumber + "\n"
        + "Date           :" + manufactureredOn + "\n"
        + "Name           :" + name + "\n";
  }


}
