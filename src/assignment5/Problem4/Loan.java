package assignment5.Problem4;

public class Loan {
	
	private static int loanCounter;
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	
	public Loan()
	{
		loanCounter++;
	}
	public Loan(
			int accountNo,
			int customerNo,
			float loanAmount,
			int loanDuration,
			float interest)
	{
		this.accountNo = accountNo;
		this.customerNo = customerNo;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.interest = interest;
		loanCounter++;
	}
	
	public int getLoanNo() {
		return this.loanNo;
	}
	
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	
	public int getAccountNo() {
		return this.accountNo;
	}
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public int getCustomerNo() {
		return this.customerNo;
	}
	
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	
	public float getLoanAmount() {
		return this.loanAmount;
	}
	
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public int getLoanDuration() {
		return this.loanDuration;
	}
	
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	
	public float getInterest() {
		return this.interest;
	}
	
	public void setInterest(float interest) {
		this.interest = interest;
	} 
	
	

}