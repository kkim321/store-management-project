import java.util.Scanner;

public class BobaRunner {
  public static void main(String[] args) {

    // Creates a Scanner object 
    Scanner input = new Scanner(System.in);

    /*
    * Instantiates Smoothie object
    */
    Smoothie s1 = new Smoothie();
    System.out.println("Welcome to my boba store!");

    /*
    * Gets name input with scanner object
     */
    System.out.println("What type of boba drink would you like? (Smoothie/Milk Tea)");
    String customerInputname = input.next();
    s1.setName(customerInputname);

    
    /*
    * Gets calorie input with scanner object
     */
    System.out.println("How many calories is the drink?");
    int customerInputcalories = input.nextInt();
    s1.setCalories(customerInputcalories);

    
    /*
    * Gets price input with scanner object
     */
    System.out.println("How much is the drink?");
    double customerInputprice = input.nextDouble();
    s1.setPrice(customerInputprice);

    
    /*
    * Gets flavor input with scanner object
     */
    System.out.println("What flavor would you like?");
    String customerInputflavor = input.next();
    s1.setFlavor(customerInputflavor);
    
    // Prints out Smoothie order
    System.out.println();
    System.out.println("--------Boba Order Receipt-------");
    System.out.println("Name: " + s1.getName());
    System.out.println("Calories: " + s1.getCalories());
    System.out.println("Price: " + s1.getPrice());
    System.out.println("Flavor: " + s1.getFlavor());
    System.out.println("---------------------------------");
    System.out.println();


    /*
    * Instantiates MilkTea object
    */
    MilkTea m1  = new MilkTea();

    
    /*
    * Gets name input with scanner object
     */
    System.out.println("What type of boba drink would you like? (Smoothie/Milk Tea)");
    String userInputname = input.next();
    m1.setName(userInputname);

    
    /*
    * Gets calorie input with scanner object
     */
    System.out.println("How many calories is the drink?");
    int userInputcalories = input.nextInt();
    m1.setCalories(userInputcalories);

    
    /*
    * Gets hasBoba input with scanner object
     */
    System.out.println("Would you like boba? (true/false)");
    boolean userHasBoba = input.nextBoolean();
    m1.setHasBoba(userHasBoba);

  // Prints out MilkTea order
    System.out.println();
    System.out.println("--------Boba Order Receipt-------");
    System.out.println("Name: " + m1.getName());
    System.out.println("Calories: " + m1.getCalories());
    System.out.println("Price: " + m1.getPrice());
    System.out.println("Does it have boba? " + m1.getHasBoba());
    System.out.println("---------------------------------");
    
    System.out.println();
    System.out.println("---------Default Drinks----------");
    BobaDrink b1= new BobaDrink();
    System.out.println(b1);
    BobaDrink b2 = new BobaDrink("Smoothie", 340, 6.50);
    System.out.println(b2);

    Smoothie sm1 = new Smoothie("Smoothie", 400, 7.00, "mango");
    System.out.println(sm1);

    MilkTea mi1 = new MilkTea("Milk Tea", 450, 5.50, true);
    System.out.println(mi1);
    System.out.println("--------------------------------");
    
    // Closes the Scanner object
    input.close();
    
  }
}