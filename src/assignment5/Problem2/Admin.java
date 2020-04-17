package assignment5.Problem2;

public class Admin {
	
	private int adminId;
	private Classroom classRoom;
	
	public int allocate(Trainee trainee)
	{
		int noOfSeats = this.classRoom.getNoOfSeats();
		this.classRoom.setNoOfSeats(--noOfSeats);
		
		trainee.setClassRoom(this.classRoom.getName());
		System.out.println("Number of seats left after allocating trainee " + trainee.getTraineeId() + " to the classroom is: " + noOfSeats);
		System.out.println("");
		return noOfSeats;
	}
	
	public int getAdminId() {
		return adminId;
	}
	
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	public Classroom getClassRoom() {
		return classRoom;
	}
	
	public void setClassRoom(Classroom classRoom) {
		this.classRoom = classRoom;
	}
	
}