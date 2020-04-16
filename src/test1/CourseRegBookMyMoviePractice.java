package test1;

public class CourseRegBookMyMoviePractice {
	public static void main(String[] args) {
		CourseRegistration reg = new CourseRegistration("Peter", 5001, 78f, 103050.0, 1005, false);
		reg.PrintDetails();
		
		System.out.println("");
		
		BookMyMovie booking1 = new BookMyMovie(101, 5);
		BookMyMovie booking2 = new BookMyMovie(102, 4);
		BookMyMovie booking3 = new BookMyMovie(103, 8);
		System.out.println("Total for booking 1: " + booking1.calculateTicketAmount());
		System.out.println("Total for booking 2: " + booking2.calculateTicketAmount());
		System.out.println("Total for booking 3: " + booking3.calculateTicketAmount());
	}
}

class CourseRegistration
{
	private String studentName;
	private int registrationID;
	private float qualifyingMarks;
	private double courseFee;
	private int courseID;
	private boolean hostelRequired;
	
	public CourseRegistration(
			String studentName,
			int registrationID,
			float qualifyingMarks,
			double courseFee,
			int courseID,
			boolean hostelRequired
			)
	{
		this.studentName = studentName;
		this.registrationID = registrationID;
		this.qualifyingMarks = qualifyingMarks;
		this.courseFee = courseFee;
		this.courseID = courseID;
		this.hostelRequired = hostelRequired;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public void setRegistrationID(int registrationID)
	{
		this.registrationID = registrationID;
	}
	
	public void setQualifyingMarks(float qualifyingMarks)
	{
		this.qualifyingMarks = qualifyingMarks;
	}
	
	public void setCourseID(int courseID)
	{
		this.courseID = courseID;
	}
	
	public void setHostelRequired(boolean hostelRequired)
	{
		this.hostelRequired = hostelRequired;
	}
	
	public String getStudentName()
	{
		return this.studentName;
	}
	
	public int getRegistrationID()
	{
		return this.registrationID;
	}
	
	public float getQualifyingMarks()
	{
		return this.qualifyingMarks;
	}
	
	public double getCourseFee()
	{
		return this.courseFee;
	}
	
	public int getCourseID()
	{
		return this.courseID;
	}
	
	public boolean isHostelRequired()
	{
		return this.hostelRequired;
	}
	
	public boolean validateMarks()
	{
		return this.qualifyingMarks < 65f;
	}
	
	public boolean validateCourseID()
	{
		return (this.courseID > 1000 && this.courseID < 1006);
	}
	
	public void calculateCourseFee()
	{
		float discount = 0f;
		if (this.qualifyingMarks >= 85)
		{
			discount = 0.015f;
		}
		else if (this.qualifyingMarks >= 70)
		{
			discount = 0.010f;
		}
		else if (this.qualifyingMarks >= 65)
		{
			discount = 0.005f;
		}
		this.courseFee *= (1 - discount);
	}
	
	public void PrintDetails()
	{
		if (!validateCourseID())
		{
			System.out.println("Invalid Course ID m8");
		}
		else if (validateMarks())
		{
			System.out.println("Marks are too low m8");
		}
		else
		{
			calculateCourseFee();
			System.out.println("=============== Reg Deets ===================");
			System.out.println("Student Name: " + this.studentName);
			System.out.println("Course ID: " + this.courseID);
			System.out.println("Qualifying Marks: " + this.qualifyingMarks);
			System.out.println("Reg ID: " + this.registrationID);
			System.out.println("Total fee: " + this.courseFee);
			System.out.println("Hostel Reuqired: " + (this.hostelRequired ? "Yes" : "No"));
		}
	}
}

class BookMyMovie
{
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
				System.out.println("your movie id is invalid m8");
		}
		total = ticketPrice * this.noOFTickets * (1 - this.discount / 100);
		
		return total;
	}
}
























































