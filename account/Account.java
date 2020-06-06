package account;

public class Account {
	int accNumber;
	String name;
	float amount;
	void insert(int a, String n, float amt)
	{
		accNumber = a;
		name = n;
		amount = amt;
	}
	
	void deposit(int amt)
	{
		amount += amt;
		System.out.println(amt+" deposited to your account");
	}
	
	void withdraw(int amt)
	{
		if(amount < amt)
		  System.out.println("Inefficient balance in your account");
		else
		{
			amount -= amt;
			System.out.println(amt+" withdrawn successfully");
		}
	}
	void checkAccountBalance()
	{
		System.out.println("the current account balance is :"+amount);
	}
	
	void displayAccountDetails()
	{
		System.out.println(accNumber+ " "+name+" "+amount);
	}
}
