package Assignment7.Problem2;

public class SingleEventRegistration extends EventRegistration{
	
	private int participantNo;

	public SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
		super(name, nameOfEvent);
		this.participantNo = participantNo;
	}

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	
	public void registerEvent()
	{
		double regFee = 0;
		switch (this.getNameOfEvent()) {
			case "ShakeALeg":
				regFee = 100;
				break;
			case "Sing&Win":
				regFee = 150;
				break;
			case "PlayAway":
				regFee = 130;
				break;
		}
		if (regFee > 0)
		{
			System.out.println("Thank you, "+ this.getName() +". Your registration Fee is: " + regFee);
			System.out.println("Your participant number is: " + participantNo);
		}
		else
		{
			System.out.println("Please choose a valid event");
		}
	}
}