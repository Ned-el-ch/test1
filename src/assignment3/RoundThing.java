package assignment3;

public class RoundThing {
	
	private double radius;
	private double pi;
	
	RoundThing(
			double radius,
			double pi
			)
	{
		this.radius = radius;
		this.pi = pi;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getPi()
	{
		return this.pi;
	}
	
	public void setPi(double pi)
	{
		this.pi = pi;
	}
	
	public void DisplayArea()
	{
		System.out.println(pi * radius * radius);
	}
	
}