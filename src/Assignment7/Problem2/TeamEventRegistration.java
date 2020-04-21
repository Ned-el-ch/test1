package assignment7.Problem2;

public class TeamEventRegistration extends EventRegistration{
	
	private int noOfParticipants;
	private int teamNo;
	public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
		super(name, nameOfEvent);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	public int getNoOfParticipants() {
		return noOfParticipants;
	}
	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	public void registerEvent()
	{
		double regFee = 0;
		switch (this.getNameOfEvent()) {
			case "ShakeALeg":
				regFee = 50;
				break;
			case "Sing&Win":
				regFee = 60;
				break;
			case "Actathon":
				regFee = 80;
				break;
			case "PlayAway":
				regFee = 100;
				break;
		}
		if (regFee > 0)
		{
			System.out.println("Thank you team "+ this.getName() + ". Your registration fee is: "+ regFee * noOfParticipants);
			System.out.println("Your team participant number is: " + teamNo);
		}
		else
		{
			System.out.println("Please choose a valid event");
		}
	}

}