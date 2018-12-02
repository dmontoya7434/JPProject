package Project;

import java.util.Date;

/**
 * Daniel Montoya Date: 9/29/18 Description: Create an abstract class called Project.Product that
 * will implement the Project.Item interface Citations: Oracal ilearning.
 */

// abstract class called Project.Product that implements Project.Item
abstract class Product implements Item , Comparable<Product> {

  //Fields to Project.Product
  private String name;
  private int serialNumber;
  private String manufacturer = Item.manufacturer;
  private Date manufactureredOn;
  private static Integer currentProductNumber = 1;


  Product(String name) {

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

  public String getName() {

    return this.name;

  }

  public Date getManufactureDate() {

    return this.manufactureredOn;
  }


  public int getSerialNumber() {
    return this.serialNumber;
  }

  public String toString() {
    return "Manufacturer:" + manufacturer + "\n"
        + "Serial Number:" + serialNumber + "\n"
        + "Date:" + manufactureredOn + "\n"
        + "Name:" + name;
  }

  public int compareTo(Product c) {
    return name.compareTo(c.getName());
  }
}
