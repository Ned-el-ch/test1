package assignment4;

public class Tester4 {
	
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