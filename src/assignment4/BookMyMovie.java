package assignment4;

public class BookMyMovie {
	
	private int movieID;
	private int noOFTickets;
	private double discount;
	private double totalAmount;
	
	public BookMyMovie(
			int movieID,
			int noOfTickets
			)
	{
		this.movieID = movieID;
		this.noOFTickets = noOfTickets;
	}
	
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public int getNoOFTickets() {
		return noOFTickets;
	}
	public void setNoOFTickets(int noOFTickets) {
		this.noOFTickets = noOFTickets;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void calculateDiscount()
	{
		double discount = 0;
		
		if (this.noOFTickets >= 5 && this.noOFTickets < 10 && (this.movieID == 101 || this.movieID == 103))
		{
			discount = 15;
		}
		else if (
				this.noOFTickets >= 10 &&
				this.noOFTickets < 15 &&
				(this.movieID == 101 || this.movieID == 103)
				)
		{
			discount = 20;
		}
		else if (this.movieID == 102 && this.noOFTickets >= 5 && this.noOFTickets < 10)
		{
			discount = 10;
		}
		else if (this.movieID == 102 && this.noOFTickets >= 10 && this.noOFTickets <= 15)
		{
			discount = 15;
		}
		this.discount = discount;
	}
	public double calculateTicketAmount()
	{
		double total = 0;
		int ticketPrice = 0;
		calculateDiscount();
		switch (this.movieID) {
			case 101:
				ticketPrice = 120;
				break;
			case 102:
				ticketPrice = 170;
				break;
			case 103:
				ticketPrice = 150;
				break;
			default:
				System.out.println("your movie id is invalid");
		}
		total = ticketPrice * this.noOFTickets * (1 - this.discount / 100);
		
		return total;
	}
}
