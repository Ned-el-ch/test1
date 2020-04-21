package Assignment7.Problem1;

public class CurrentAccount extends Account{
	
	private int overdraftAmount;

	public CurrentAccount(Customer customer, int overdraftAmount, int accountNo, double balance) {
		this.overdraftAmount = overdraftAmount;
		super.setCustomer(customer);
		super.setAccountNo(accountNo);
		super.setBalance(balance + this.overdraftAmount);
	}

	public int getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(int overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw(double amount)
	{
		double amountAfterWithdraw = this.getBalance() + this.overdraftAmount - amount;
		if (amountAfterWithdraw >= 0)
		{
			this.setBalance(this.getBalance() - amount);
			System.out.println("Withdrawing " + amount + ". Your remaining balance is: " + this.getBalance());
		}
		else
		{
			System.out.println("Can't withdraw that much.");
		}
	}

}