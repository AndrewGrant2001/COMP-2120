package Lab3;

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Lab3_BasicMethodsClasses_ProductClass {
   // TODO: Build Product class with private fields and methods listed above
   String productName;
   double productPrice;
   int productInventory;
   
   /* Type your code here. */
    public Lab3_BasicMethodsClasses_ProductClass(String code, double price, int count){ //- set the member fields using the three parameters
        productName = code;
        productPrice = price;
        productInventory = count;
    }
    
    public void setCode(String code) { // - set the product code (i.e. SKU234) to parameter code
        productName = code;
    }
    
    public String getCode() { // - return the product code
        return productName;
    }
    
    public void setPrice(double p) { // - set the price to parameter p
        productPrice = p;
    }
    
    public double getPrice() { // - return the price
        return productPrice;
    }
    
    public void setCount(int num) { // - set the number of items in inventory to parameter num
        productInventory = num;
    }
    
    public int getCount() { // - return the count
        return productInventory;
    }
    
    public void addInventory(int amt) { // - increase inventory by parameter amt
        productInventory = productInventory + amt;
    }
    
    public void sellInventory(int amt) { // - decrease inventory by parameter amt
        productInventory = productInventory - amt;
    }

   // main
   public static void main(String args[]) {
      String name = "Apple";
      double price = 0.40;
      int num = 3;
      Lab3_BasicMethodsClasses_ProductClass prod = new Lab3_BasicMethodsClasses_ProductClass(name, price, num);

      // Test 1 - Are instance variables set/returned properly?
      System.out.println("Name: " + prod.getCode()); 
      System.out.printf("Price: %.2f\n", prod.getPrice()); 
      System.out.println("Count: " + prod.getCount());
      System.out.println();

      // Test 2 - Are instance variables set/returned properly after adding and selling?
      num = 10;
      prod.addInventory(num);
      num = 5;
      prod.sellInventory(num);
      System.out.println("Name: " + prod.getCode()); 
      System.out.printf("Price: %.2f\n", prod.getPrice());
      System.out.println("Count: " + prod.getCount());
      System.out.println();

      // Test 3 - Do setters work properly?
      name = "Golden Delicious";
      prod.setCode(name);
	   price = 0.55;
      prod.setPrice(price);
      num = 4;
      prod.setCount(num);
      System.out.println("Name: " + prod.getCode()); 
      System.out.printf("Price: %.2f\n", prod.getPrice()); 
      System.out.println("Count: " + prod.getCount()); 
   }
}

