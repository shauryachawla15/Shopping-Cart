// SHAURYA CHAWLA
// PROJECT-1 ASSIGNMENT

import java.util.ArrayList;

public class ShoppingCart extends ItemToPurchaseDescription {
  
//Private Data Members
private String customerName;
private String currentDate;
  
public ShoppingCart() {   // The default Constructor
customerName = "none";
currentDate = "January 1, 2016";
}
  
//ArrayList cartItems
ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();;
  
                                                                                                                              
public ShoppingCart(String CustomerName , String CurrentDate,int x, int y) {   // parameterized constructor which takes the customer name and date as parameters
this.currentDate = CurrentDate;
this.customerName = CustomerName;
}
  
  
//Public member methods
public String getCustomerName() {   // accessor
return customerName;
}

public void setCustomerName(String customerName) {
this.customerName = customerName;
}  

public String getDate() { //accessor
return currentDate;
}
public void setCurrentDate(String currentDate) {
this.currentDate = currentDate;
}
  
public void addItem( ItemToPurchase i) { // This method adds an item to the cartItems array. It also has a parameter ItemToPurchase. It does not return anything.
cartItems.add(i);
}
  

public void removeItem(String name) { //This method removes item from the cartItems array. It has a string (an item's name) parameter. It does not return anything.
boolean found = false;;
for(ItemToPurchase i: cartItems){
if(i.getName().equalsIgnoreCase(name)) {
cartItems.remove(i);
found = true;
break;
}
}
            
if(!found)           //If an item name cannot be found 
System.out.println("Item not found in cart. Nothing removed");
}
  

public void modifyItem(ItemToPurchase i) { // This method modifies an item's description, price and/or quantity. It has a parameter ItemToPurchase. It does not return anything.
boolean found = false;
for(ItemToPurchase k: cartItems){
                                                   //If item can be found (by name) in cart, check if the parameter has default values for description, price, and quantity. If not, ir modifies item in cart.
if(k.getName().equalsIgnoreCase(k.getName())) {
if(k.getQuantity()!=0){
k.setQuantity(k.getQuantity());
}
found = true;
break;
}
}
           
if(!found)  // If an item cannot be found (by name) in cart.
System.out.println("Item not found in cart. Nothing removed");
}
  
public int getNumItemsInCart() { // This method returns quantity of all items in cart. It has no parameters.
int sum = 0;
for(ItemToPurchase i: cartItems){
sum = sum + i.getQuantity();
}
return sum;
}
  
public double getCostOfCart() { // This method determines and returns the total cost of items in cart. It has no parameters.
int sum = 0;
for(ItemToPurchase i: cartItems){
sum = sum + i.getPrice();
}
return sum;
}
  

public void printTotal(){  // This method outputs total of objects in the cart.

if(cartItems!=null&& cartItems.size() >0 ){
System.out.println(customerName + "'s Shopping Cart - " + currentDate);
System.out.println("Number of Items: " + cartItems.size());
System.out.println();
}
else{
System.out.println("SHOPPING CART IS EMPTY");
}
}
  
public void printDescriptions() { // This method outputs each item's description.

System.out.println(customerName+"'s Shopping Cart - "+currentDate);
System.out.println("Number of Items: " + cartItems.size());
System.out.println();
System.out.println("Item Descriptions");
}
}


