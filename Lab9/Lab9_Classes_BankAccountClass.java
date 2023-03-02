package Lab9;

/******************************************************************************

Build a class called BankAccount that manages checking and savings accounts. The class has three private member fields: a customer name (String), the customer's savings account balance (double), and the customer's checking account balance (double).

Implement the following Constructor and instance methods:

public BankAccount(String newName, double amt1, double amt2) - set the customer name to parameter newName, set the checking account balance to parameter amt1 and set the savings account balance to parameter amt2. (amt stands for amount)
public void setName(String newName) - set the customer name
public String getName() - return the customer name
public void setChecking(double amt) - set the checking account balance to parameter amt
public double getChecking() - return the checking account balance
public void setSavings(double amt) - set the savings account balance to parameter amt
public double getSavings() - return the savings account balance
public void depositChecking(double amt) - add parameter amt to the checking account balance (only if positive)
public void depositSavings(double amt) - add parameter amt to the savings account balance (only if positive)
public void withdrawChecking(double amt) - subtract parameter amt from the checking account balance (only if positive)
public void withdrawSavings(double amt) - subtract parameter amt from the savings account balance (only if positive)
public void transferToSavings(double amt) - subtract parameter amt from the checking account balance and add to the savings account balance (only if positive)

*******************************************************************************/
public class Lab9_Classes_BankAccountClass {
   // TODO: Build BankAccount class with methods listed above
      private String cust;
	   private double check;
	   private double save;
   
   
   /* Type your code here. */ 
   public Lab9_Classes_BankAccountClass(String newName, double amt1, double amt2) { //- set the customer name to parameter newName, set the checking account balance to parameter amt1 and set the savings account balance to parameter amt2. (amt stands for amount)
      cust = newName;
	   check = amt1;  
	   save = amt2;    
   }
   
   public void setName(String newName) { // - set the customer name
      cust = newName;
   }   

   public String getName() { // - return the customer name
      return cust;
   }
   
   public void setChecking(double amt) { // - set the checking account balance to parameter amt
      check = amt;
   }
   
   public double getChecking() { // - return the checking account balance
      return check;
   }  
   
   public void setSavings(double amt) { // - set the savings account balance to parameter amt
      save = amt;
   }
   
   public double getSavings() { // - return the savings account balance
      return save;
   }
   public void depositChecking(double amt) { // - add parameter amt to the checking account balance (only if positive)
      if (amt > 0)
         check = check + amt;
   }
   
   public void depositSavings(double amt) { // - add parameter amt to the savings account balance (only if positive)
      if (amt > 0)
            save = save + amt;
   }
   
   public void withdrawChecking(double amt) { // - subtract parameter amt from the checking account balance (only if positive)
      if (amt > 0)
         check = check - amt;
   }
   
   public void withdrawSavings(double amt) { // - subtract parameter amt from the savings account balance (only if positive)
      if (amt > 0)
         save = save - amt;
   }
   
   public void transferToSavings(double amt) { // - subtract parameter amt from the checking account balance and add to the savings account balance (only if positive)
      if (amt > 0) {
         check = check - amt;
         save = save + amt;
      }
   }



   // main
    public static void main(String args[]) {
        Lab9_Classes_BankAccountClass account = new Lab9_Classes_BankAccountClass("Mickey", 500.00, 1000.00);
        account.setChecking(500);
        account.setSavings(500);
        account.withdrawSavings(100);
        account.withdrawChecking(100);
        account.transferToSavings(300);

        System.out.println(account.getName()); // Expected Mickey
        System.out.printf("$%.2f\n", account.getChecking()); // Expected 100.0
        System.out.printf("$%.2f\n", account.getSavings()); // Expected 700.0
    } 
}

