/*
* Represents a mik tea
*/

public class MilkTea extends BobaDrink {

private boolean hasBoba;  // Whether or not the drink has boba

  /*
   * Sets the name to no name, calories to 0, price to 0.0, 
   * flavor to no flavor, and hasBoba to false
   */
public MilkTea() {
  super();
  this.hasBoba = false;
}

 /*
   * Sets the name to the specified name, the calories to the specified
   * calories, price to the specified price, flavor to the specified
   * flavor, and hasBoba to the specified status
   */
  public MilkTea(String name, int calories, double price, boolean hasBoba) {
    super(name, calories, price);
    this.hasBoba = hasBoba;
  }

 /*
   * Returns whether or not the drink has boba
   */
public boolean getHasBoba() {
  return hasBoba;
}

 /*
   * Sets hasBoba to the specified status
   */
public void setHasBoba(boolean hasBoba) {
  this.hasBoba = hasBoba;
}

  /*
  * toString Method Override
  */
  public String toString() {
    String text = "";
    if (hasBoba == true) {
      text = "Has Boba";
    } else {
      text = "No Boba";
    }
    return super.toString() + "\nDoes it have boba? " + text;
  }
}