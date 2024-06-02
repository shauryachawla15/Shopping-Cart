// SHAURYA CHAWLA
// PROJECT-1 ASSIGNMENT

import java.util.Scanner;

public class ShoppingCartManager {
  
public static void main(String[] args){
                                       // Prompts the user for customer's name and today's date
Scanner scan = new Scanner(System.in);
System.out.println("Enter Customer's Name: ");
String customerName = scan.nextLine();
System.out.println("Enter Today's Date: ");
String currentDate = scan.nextLine();
ShoppingCart y = new ShoppingCart();
ShoppingCart x = new ShoppingCart(customerName, currentDate,0,0);
System.out.println(); 
                                        // Prints the name and date
System.out.println("Customer Name: " + x.getCustomerName());
System.out.println("Today's Date: " + currentDate);
printMenu(x);
}
  
public static void printMenu(ShoppingCart x){  // This method prints the menu
  
while(true){
                                    
System.out.println("MENU");
System.out.println("a - Add item to cart");
System.out.println("d - Remove item from cart");
System.out.println("c - Change item quantity");
System.out.println("i - Output items' descriptions");
System.out.println("o - Output shopping cart");
System.out.println("q - Quit\n\nChoose an option: ");
Scanner scanner = new Scanner(System.in); // The User chooses an option
  
char input = scanner.next().charAt(0);
scanner.nextLine(); 
  
// Adding an item to the cart
if(input == 'a'){
System.out.println("ADD ITEM TO CART");
System.out.println("Enter Item Name: ");
String itemName = scanner.nextLine();
System.out.println("Enter Item Description: ");
String itemDescritpion = scanner.nextLine();
System.out.println("Enter Item Price: ");
int itemPrice = scanner.nextInt();
System.out.println("Enter Item Quantity: ");
int itemQuantity = scanner.nextInt();
scanner.nextLine();
ItemToPurchaseDescription item = new ItemToPurchaseDescription(itemName, itemDescritpion, itemPrice, itemQuantity);
x.addItem(item);
}


// Removing an item from the cart
else if(input == 'd'){
System.out.println("REMOVE ITEM FROM CART");
System.out.println("Enter name of item to remove: ");
String name = scanner.nextLine();
x.removeItem(name);
}


// Changing the quantity of an item
else if(input == 'c'){
System.out.println("CHANGE ITEM QUANTITY");
System.out.println("Enter the item name: ");
String name = scanner.nextLine();
System.out.println("Enter the new quantity: ");
int quantity = scanner.nextInt();
ItemToPurchase item = new ItemToPurchase();
item.setName(name);
item.setQuantity(quantity);
x.modifyItem(item);
}

// Printing  items' descriptions
else if(input == 'i'){
System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
x.printItemDescription();
}


// printing the shopping cart
else if(input == 'o'){
System.out.println("OUTPUT SHOPPING CART");
x.printTotal();
x.printItemCost();
}


// Quit
else if(input == 'q'){
break;
}
  
}
  
}
  
}