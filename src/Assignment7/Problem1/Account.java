package Assignment7.Problem1;

public class Account {
	
	private int accountNo;
	private Customer customer;
	private double balance;
	
	public int getAccountNo()
	{
		return accountNo;
	}
	
	public void setAccountNo(int accountNo)
	{
		this.accountNo = accountNo;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void deposit(double amount)
	{
		this.balance += amount;
	}

}