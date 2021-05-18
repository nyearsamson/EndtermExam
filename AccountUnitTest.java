public class AccountUnitTest {

   public static void main(String arg[]){

       Account acc1 = new Checking(1001);

       acc1.setAccountBalance(1000);

       Account acc2 = new Savings(2001, 8.5);

       acc2.setAccountBalance(2000);

       System.out.println(acc1.getAccountDetails());

       System.out.println(acc2.getAccountDetails());

   }

}
