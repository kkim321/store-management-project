/*
* Represents a smoothie
*/
public class Smoothie extends BobaDrink {

  private String flavor;  // The flavor of the smoothie
 
  /*
   * Sets the name to no name, calories to 0, price to 0.0, and flavor to no flavor
   */
  public Smoothie() {
    super();
    this.flavor = " No Flavor";
  }

   /*
   * Sets the name to the specified name, the calories to the specified
   * calories, price to the specified price, and flavor to the specified
   * flavor
   */
  public Smoothie(String name, int calories, double price, String flavor) {
    super(name, calories, price);
    this.flavor = flavor;
  }

   /*
   * Returns the value of the flavor of the boba drink
   */
  public String getFlavor() {
  return flavor;
  }

  
  /*
   * Sets the flavor of the boba drink to the specified flavor
   */
  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  /*
  * toString Method Override
  */
  public String toString () {
    return super.toString() + "\nWhat Flavor? " + flavor;
  }

  
}