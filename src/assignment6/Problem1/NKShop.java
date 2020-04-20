package assignment6.Problem1;

public class NKShop {
	
	public void calculatePrice(int itemId)
	{
		int price = 0;
		switch (itemId) {
		case 1001:
			price = 1200;
			break;
		case 1002:
			price = 1000;
			break;
		case 1003:
			price = 999;
			break;
		case 1004:
			price = 1500;
			break;
		}
		if (price > 0)
		{
			System.out.println("The price for the item is: " + price);
		}
		else
		{
			System.out.println("That item doesn't exist.");
		}
		
	}
	
	public void calculatePrice(String brandName, String itemType, int size)
	{
		int price = 0;
		if (brandName == "Puma" && (size == 32 || size == 34))
		{
			if (itemType == "T-shirt")
			{
				price = 1200;
			}
			else if (itemType == "Skirt")
			{
				price = 1000;
			}
			System.out.println("The price for the item is: " + price);
		}
		else if (brandName == "Reebok" && (size == 32 || size == 34))
		{
			if (itemType == "T-shirt")
			{
				price = 999;
			}
			else if (itemType == "Skirt")
			{
				price = 1500;
			}
			System.out.println("The price for the item is: " + price);
		}
		else
		{
			System.out.println("That item doesn't exist.");
		}
	}
}