public class Checking extends Account{

   public Checking(int accNO){

       super(accNO);
   }
   public String getAccountDetails()
   {
    return "Checkings Account Information\nAccount No: "+getAccountNo()+"\nAccount Balance: "+getAccountBalance();
   }
   }
