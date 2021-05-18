import java.io.*;

public abstract class Account

   int accno;

   double accbal;

   Account(int no)

   

    accno = no;

    accbal = 0.0;

   

   public void setBal(double bal)

   

    accbal=bal;

   

   abstract void getAccno();

   abstract void getBal();

 
