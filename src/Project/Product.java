package Project;

/**
 * Daniel Montoya
 * Date: 9/29/18
 * Description: Create an abrstract class called Project.Product that will implement the Project.Item interface
 * Citations: Oracal ilearning
 */

import Project.Item;
import java.util.Date;

// abstract class called Project.Product that implements Project.Item
public abstract class Product implements Item {

  //Fields to Project.Product
  private int serialNumber;
  private String Manufacturer;
  private Date manufacturerOn;
  private String name;

  private int currentProductNumber;

  //Constructor that will take the name of the product and
  //set it to the field name variable.
  public Product(String n) {

    name = n;

    //Assigned a serial number from the currentProductNumber and increments
    //currentProductNumber
    serialNumber = currentProductNumber++;

    //Sets the current Date
    manufacturerOn = new Date();
  }

  //Stores the next number to be assiggned to serialNumber
  public void setProductionNumber(int number) {
    number = number;
  }
  //Methods from the interface Project.Item
  public void setName(String name) {

  }

  public String getName() {

    return name;

  }

  public Date getManufactureDate(Date date) {

    return manufacturerOn;
  }

  public int getSerialNumber() {
    return serialNumber;

  }

  //ToString method
  public String toString() {
    return "Manufacturer  : OraclProductionSerial\n"
        + "Number         : 1\n"
        + "Date           : Thu May 14 15:18:43 BST 2015\n"
        + "Name           : Project.Product Name\n";
  }


}
