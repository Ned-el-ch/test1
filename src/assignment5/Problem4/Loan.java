package assignment5.Problem4;

public class Loan {
	
	public static void main(String[] args) {
		Loan loan1 = new Loan();
		Loan loan2 = new Loan();
		Loan loan3 = new Loan();
		Loan loan4 = new Loan(12, 152, 5151.12f, 7, 0.07f);
		Loan loan5 = new Loan(13, 1547, 4610.0f, 4, 0.065f);
		
		System.out.println(Loan.loanCounter);
	}
	
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