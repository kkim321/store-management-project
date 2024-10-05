/*
* Represents a boba drink
*/

public class BobaDrink {
  
  // Instance Variables
  private String name; // The name of the drink
  private int calories; // The calories of the drink
  private double price; // The price of the drink
  
  /*
  * Sets the name of drink to no name, calories to 0, and price to 0.0
  */
  public BobaDrink() {
    this("No Name", 0, 0.0);
  }

   /*
   * Sets the name to the specified name
   * the calories to the specified calories
   * and the price to the specified price
   */
  public BobaDrink(String name, int calories, double price) {
    this.name = name;
    this.calories = calories;
    this.price = price;
  }

  
  /*
   * Returns the value of name of the boba drink
   */
  public String getName() {
    return name;
  }

   /*
   * Sets the name of the boba drink to the specified name
   */
  public void setName(String name) {
    this.name = name;
  }

  /*
   * Returns the value of calories of the boba drink
   */
  public int getCalories() {
    return calories;
  }

   /*
   * Sets the calories of the boba drink to the specified calories
   */
  public void setCalories(int calories) {
    this.calories = calories;
  }

   /*
   * Returns the value of price of the boba drink
   */
  public double getPrice() {
    return price;
  }

  /*
   * Sets the price of the boba drink to the specified price
   */
  public void setPrice(double price) {
     if (price < 0.0) {
      this.price = 0.0;
    } else {
      this.price = price;
    }
  }
 
  /*
  * toString Method Override
  */
  public String toString() {
      return "Name: " + name + " \nCalories: " + calories + " \nPrice: $" + price;
    }
}