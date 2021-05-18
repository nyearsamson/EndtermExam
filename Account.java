public abstract class Account {

   private int accountNo;

   private double accountBalance;

   public Account(int accNo){

    this.accountNo = accNo;

    accountBalance = 0.0;
   }
   public int getAccountNo()
   {
     return accountNo;
   }
   public double getAccountBalance() 
   {
   return accountBalance;
   }
   public void setAccountBalance(double accountBalance)
   {
   this.accountBalance = accountBalance;
   }
   public abstract String getAccountDetails();
   }
  
