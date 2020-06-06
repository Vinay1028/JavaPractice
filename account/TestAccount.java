package account;

public class TestAccount {
	public static void  main(String[] args)
	{
		Account a = new  Account();
		a.insert(12447, "Vineet", 50000);
		a.displayAccountDetails();
		a.checkAccountBalance();
		a.deposit(5000);
		a.checkAccountBalance();
		a.withdraw(15000);
		a.checkAccountBalance();
	}
}
