package assignment6.Problem3;

public class Ticket {
	
	private int startPoint = 3;
	private int endPoint = 9;
	private int ticketAmount;
	
	public Ticket()
	{
	}
	public Ticket(
			int startPoint,
			int endPoint
			)
	{
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public int getStartPoint() {
		return startPoint;
	}
	
	public int getEndPoint() {
		return endPoint;
	}
	
	public int getTicketAmount() {
		return ticketAmount;
	}
	
	public boolean validateTicketPoints()
	{
		return this.startPoint < this.endPoint;
	}
	
	public int calcTicketAmt()
	{
		if (validateTicketPoints())
		{
			this.ticketAmount = (this.endPoint - this.startPoint) * 10;
			System.out.println("The ticket amount to be collected from the passenger for the journey is Rs: " + this.ticketAmount);
			return this.ticketAmount;
		}
		else
		{
			System.out.println("Invalid journey details");
			return -1;
		}
	}
}