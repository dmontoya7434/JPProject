package Project;

/**
 * Daniel Montoya
 * Date: 9/29/18
 * Description: Create an abrstract class called Project.Product that will implement the Project.Item interface
 * Citations: Oracal ilearning
 */


import java.util.Date;

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

  public Product(String name) {

    this.name = name;

    //Assigned a serial number from the currentProductNumber and increments
    //currentProductNumber
    serialNumber = currentProductNumber++;

    //Sets the current Date
    manufactureredOn = new Date();

    //manufacturer = Item.manufacturer;
  }

  //Stores the next number to be assiggned to serialNumber
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

  public Date getManufactureDate(Date date) {

    return this.manufactureredOn;
  }

  public int getSerialNumber() {
    return this.serialNumber;

  }

  //ToString method
  public String toString() {
    return "Manufacturer   :" + manufacturer + "\n"
        + "Serial Number  :" + serialNumber + "\n"
        + "Date           :" + manufactureredOn + "\n"
        + "Name           :" + name + "\n";
  }


}
