
package test1;

public class ProductRegistrationPractice
{
	public static void main(String[] args)
	{
		Product prodObj1 = new Product(1001,"Twirty",8000.0f);
		prodObj1.display();
        Product prodObj2 = new Product(1002,"Jike",5400.0f);
		prodObj2.display();
	}
}

class Registration
{
	public static int counter = 10001;
	private String name;
	private long contactNumber;
	private String city;
	
	public Registration(
			String name,
			long contactNumber,
			String city
			)
	{
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public long getContactNumber()
	{
		return this.contactNumber;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public String generateRegistrationID()
	{
		String ID = "D" + counter;
		counter++;
		return ID;
	}
}

class Product {
	private int productId;
	private String name;
	private float price;
	Product(int productId, String name, float price) {
		this(productId);
		this.name = name;
		this.price = price;
	}
	Product(int productId) {
		this.productId = productId;
	}
	public void display() {
		System.out.println(productId);
		System.out.println(name);
		System.out.println(price);
	}
}