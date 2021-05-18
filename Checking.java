public class Checking extends Account
{
	public Checking(int accountNumber)
	{
		super(accountNumber);
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	/*
	 * I was unsure what it meant by "[...] the get method displays the String
	 * [...]" so I assumed that putting that in the two get methods made no sense
	 * and opted to do the following. In this situation I feel like the following
	 * could be added to the abstract as an empty method to force its creation.
	 */
	public String getAccountInfo()
	{
		return("Checking Account Information\nAcct Num: " + getAccountNumber() + "\nBalance: " + getBalance());
	}
}
