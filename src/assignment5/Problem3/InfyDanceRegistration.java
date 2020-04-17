package assignment5.Problem3;

public class InfyDanceRegistration {
	
	private static int counter = 10000;
	private String name;
	private long contactNumber;
	private String city;
	
	public InfyDanceRegistration(
			String name,
			long contactNumber,
			String city
			)
	{
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
		counter++;
	}
	
	public String getName() {
		return name;
	}
	
	public String generateRegistrationId()
	{
		String id = "D" + counter;
		System.out.println("Hi, " + getName() + ". Your registration ID is: " + id);
		System.out.println("");
		return id;
	}
	
}