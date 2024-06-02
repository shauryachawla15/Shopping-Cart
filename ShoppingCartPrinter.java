// SHAURYA CHAWLA
// PROJECT-1 ASSIGNMENT (THE DRIVER CLASS)

import java.util.Scanner;
public class ShoppingCartPrinter {

public static void main(String[] args)         // The Main Method
 {
Scanner sc = new Scanner(System.in);

ItemToPurchase i1=new ItemToPurchase();      //Crreating the two objects of class ItemToPurchase.
ItemToPurchase i2=new ItemToPurchase();

System.out.println("Item 1");
System.out.println("Enter the item name:"); //taking the input of first item
i1.setName(sc.nextLine());

System.out.println("Enter the item price:");
i1.setPrice(Integer.parseInt(sc.nextLine()));

System.out.println("Enter the item quantity:");
i1.setQuantity(Integer.parseInt(sc.nextLine()));

System.out.println();


System.out.println("Item 2");
System.out.println("Enter the item name:");  // Taking the input of second item
i2.setName(sc.nextLine());

System.out.println("Enter the item price:");
i2.setPrice(Integer.parseInt(sc.nextLine()));
System.out.println("Enter the item quantity:");
i2.setQuantity(Integer.parseInt(sc.nextLine()));

System.out.println("\"TOTAL COST\"");       // Calculating and printing the total cost.
int qt,price,item1,item2;

qt=i1.getQuantity();
price=i1.getPrice();
item1=qt*price;

System.out.println(i1.getName()+" "+qt+" @ $"+price+" = "+item1+ "$");

qt=i2.getQuantity();
price=i2.getPrice();
item2=(qt*price);

System.out.println(i2.getName()+" "+qt+" @ "+price+ "$" +" = " +item2+ "$");
System.out.println("Total:"+(item1+item2+ "$"));

  }
}
  
  
  

