package Assignment7.Problem1;

public class SavingsAccount extends Account{
	
	private double minimumAmount;
	private int interestRate;
	
	public SavingsAccount(int accountNo, double minimumAmount, int interestRate) {
		super.setAccountNo(accountNo);
		this.minimumAmount = minimumAmount;
		this.interestRate = interestRate;
	}

	public double getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(double minimumAmount) {
		this.minimumAmount = minimumAmount;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount)
	{
		double amountAfterWithdraw = this.getBalance() - amount;
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
	
	public double calculateInterest()
	{
		double interest = this.getBalance() * (this.interestRate / 100.0);
		return interest;
	}

}