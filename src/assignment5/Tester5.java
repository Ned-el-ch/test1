package assignment5;

import assignment5.Problem1.Address;
import assignment5.Problem1.RRAccount;
import assignment5.Problem2.Admin;
import assignment5.Problem2.Classroom;
import assignment5.Problem2.Trainee;
import assignment5.Problem3.InfyDanceRegistration;

public class Tester5 {
	
	public static void main(String[] args) {
		
		// PROBLEM 1
		Address address1 = new Address("No. 123", "9th Cross, Thinethra Circle", "Mysuru", "Karnataka", 70017);
		RRAccount account1 = new RRAccount("Rakesh", address1, 50000.0);
		account1.isValidAddress();
		
		Address address2 = new Address("No. 123", "9th Cross, Thinethra Circle", "Mysuru", "Karnataka", 570017);
		RRAccount account2 = new RRAccount("Rakesh", address2, 50000.0);
		account2.isValidAddress();
		
		// PROBLEM 2
		Classroom classRoom = new Classroom();
		classRoom.setName("G045");
		classRoom.setNoOfSeats(100);
		
		Trainee trainee = new Trainee();
		trainee.setTraineeId(1005);
		
		
		Admin admin = new Admin();
		admin.setAdminId(4243);
		admin.setClassRoom(classRoom);
		
		admin.allocate(trainee);
		
		// PROBLEM 3
		InfyDanceRegistration id1 = new InfyDanceRegistration("Frank", 9870745632L, "Kolkata");
		id1.generateRegistrationId();
		
		InfyDanceRegistration id2 = new InfyDanceRegistration("Maya", 8878964509L, "Mysore");
		id2.generateRegistrationId();
		
	}

}