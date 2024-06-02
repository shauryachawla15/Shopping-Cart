// SHAURYA CHAWLA
// PROJECT-1 ASSIGNMENT

import java.util.Scanner;

public class ItemToPurchase
{ 
   //Private data members
private String itemName;
private int itemPrice,itemQuantity;

public ItemToPurchase()
{  
 // private data members initialized in default constructor
this.itemName="none";   
this.itemPrice=0;
this.itemQuantity=0;
}


public void setName(String itemName) // The Method sets & gets functions to get and set the values of class variables.
{
this.itemName=itemName;
}

public void setPrice(int itemPrice)
{
this.itemPrice=itemPrice;
}

public void setQuantity(int itemQuantity)
{
this.itemQuantity=itemQuantity;
}

public String getName()
{
return this.itemName;
}

public int getPrice()
{
return this.itemPrice; 
}

public int getQuantity()
{
return this.itemQuantity;
}
}

class ItemToPurchaseDescription extends ItemToPurchase {     // Extended class (Part-2 of the project)
private String itemDescription;

public ItemToPurchaseDescription(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
     this.itemDescription = itemDescription;
     }
     
 
public String getDescription() {
 return itemDescription;
 }
 
public void setDescription() {
      this.itemDescription = itemDescription;
     }
     
public void printItemCost()    // This method outputs the item name followed by the quantity, price, and subtotal
     {
    System.out.println(getName() + " " + getQuantity() + " @ $" +getPrice() + " = $" + getQuantity() * getPrice());
     }
     
public void printItemDescription() {
    System.out.println(getName() + ": " + getDescription());
     }
}
         
 
      