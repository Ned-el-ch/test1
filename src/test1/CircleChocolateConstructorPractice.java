package test1;

public class CircleChocolateConstructorPractice {
	
	public static void main(String[] args) {
		RoundThing circle = new RoundThing(12.0, 3.14);
		circle.DisplayArea();
		
		Chocolate milka = new Chocolate(1521512, "Milka", 100, 1);
		System.out.println(milka.getBarcode());		
	}
}

class RoundThing
{
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


class Chocolate
{
	private int barcode;
	private String name;
	private int weight;
	private int cost;
	Chocolate(
			int barcode,
			String name,
			int weight,
			int cost
			)
	{
		this.barcode = barcode;
		this.name = name;
		this.weight = weight;
		this.cost = cost;
	}
	
	public int getBarcode()
	{
		return this.barcode;
	}
	
	public void setBarcode(int barcode)
	{
		this.barcode = barcode;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	public int getCost()
	{
		return this.cost;
	}
	
	public void setCost(int cost)
	{
		this.cost = cost;
	}
}