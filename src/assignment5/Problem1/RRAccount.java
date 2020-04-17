package assignment5.Problem1;

public class RRAccount {
	
	private String customerName;
	private Address address;
	private double depositAmount;
	
	public RRAccount(String customerName, Address address, double depositAmount) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.depositAmount = depositAmount;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public double getDepositAmount() {
		return this.depositAmount;
	}
	
	public boolean isValidAddress()
	{
		boolean addressIsValid = this.address.getPinCode() > 99999;
		
		if (addressIsValid)
		{
			System.out.println("            Customer Details               ");
			System.out.println("*******************************************");
			System.out.println("Customer Name:  " + getCustomerName());
			System.out.println("Address:        " + getAddress());
			System.out.println("Deposit Amount: " + getDepositAmount());
			System.out.println("Your account has been created.");
			System.out.println("");
		}
		else
		{
			System.out.println("The pin code is invalid.");
			System.out.println("");
		}
		
		return addressIsValid;
	}

}