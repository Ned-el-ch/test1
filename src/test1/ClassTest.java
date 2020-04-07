package test1;

public class ClassTest
{
	public static void main(String[] args)
	{
		
	}
	
	
}

class Driver
{
	private String name;
	private float rating;
	
	public Driver(
			String name,
			float rating
			)
	{
		this.name = name;
		this.rating = rating;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public float getRating()
	{
		return this.rating;
	}
	
	public void setRating(float rating)
	{
		this.rating = rating;
	}
}

class CabService
{
	private String name;
	private int totalNumberOfCars;
	private int numberOfCarsBooked;
	private int price;
	
	public CabService(
			String name,
			int totalNumberOfCars,
			int numberOfCarsBooked,
			int price
			)
	{
		this.name = name;
		this.totalNumberOfCars = totalNumberOfCars;
		this.numberOfCarsBooked = numberOfCarsBooked;
		this.price = price;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getTotalNumberOfCars()
	{
		return this.totalNumberOfCars;
	}
	
	public void setTotalNumberOfCars(int totalNumberOfCars)
	{
		this.totalNumberOfCars = totalNumberOfCars;
	}
	
	public int getNumberOfCarsBooked()
	{
		return this.numberOfCarsBooked;
	}
	
	public void setNumberOfCarsBooked(int numberOfCarsBooked)
	{
		this.numberOfCarsBooked = numberOfCarsBooked;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public float calculateExtraPrice(Driver driver)
	{
		float extraPrice = 0f;
		if (driver.getRating() >= 4.5f)
		{
			extraPrice = getPrice() * 0.05f;
		}
		return extraPrice;
	}
}