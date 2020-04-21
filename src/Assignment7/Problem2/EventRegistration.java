package assignment7.Problem2;

public class EventRegistration {
	
	private String name;
	private String nameOfEvent;
	private double registrationFee;
	public EventRegistration(String name, String nameOfEvent) {
		this.name = name;
		this.nameOfEvent = nameOfEvent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	public void registerEvent()
	{
		double regFee = 0;
		switch (this.nameOfEvent) {
			case "ShakeALeg":
				regFee = 100;
				break;
			case "Sing&Win":
				regFee = 150;
				break;
			case "Actathon":
				regFee = 70;
				break;
			case "PlayAway":
				regFee = 130;
				break;
		}
		System.out.println("Registration Fee: " + regFee);
	}

}