package Project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  //fields
  private StringBuilder name;
  private String code;
  private String deptId;

  private Scanner in = new Scanner(System.in);
  private Pattern pattern = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");

  private EmployeeInfo(){
    setName();
    setDeptId();
  }

  //The class will have the following methods defined:
  public StringBuilder getName() {
    return this.name;
  }

  public String getCode () {
    return this.code;
  }

  private void setName (){
    StringBuilder fullname = new StringBuilder(inputName());
    if(checkName(fullname)) {
      this.name = fullname;
      createEmployeeCode(fullname);
    }
    else {
      this.name = fullname;
      this.code = "guest";
    }
  }

  private void createEmployeeCode (StringBuilder name) {
    if (checkName(name)) {  // valid, includes space
      code = name.charAt(0) + name.substring(name.indexOf(" " )+1);
    } else {
      code = "guest";
    }
  }

  private String inputName (){
    String fullname;
    System.out.print("Please enter your first and last name: ");
    fullname = in.nextLine();

    return fullname;
  }

  private boolean checkName (StringBuilder name){
    return name.indexOf(" ") > 0;
  }

  private String getDeptId(){
    String id;
    System.out.println("Please enter the department ID: ");
    id = in.nextLine();
    return id;
  }

  private void setDeptId() {

    String id = getDeptId();

    if (validId(id)) {

      this.deptId = id;

    } else {

      this.deptId = "None01";
    }
  }

  private String getId() {
    return this.deptId;
  }

  private boolean validId(String id) {

    Matcher matcher = pattern.matcher(id);

    return matcher.matches();

  }

  public String reverseString(String id) {

    StringBuilder reverse = new StringBuilder(id);

    reverse = reverse.reverse();

    return reverse.toString();

  }

  public String toString() {

    return "Employee Code : " + this.code + "\n"

        + "Department Number : " + this.deptId;

  }

}
