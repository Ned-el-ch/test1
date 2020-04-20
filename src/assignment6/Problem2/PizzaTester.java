package assignment6.Problem2;

public class PizzaTester {
	
	Pizza pizza1 = new Pizza("Margarita", 12, "large");
	Pizza pizza2 = new Pizza("Pepperoni", 11, "medium");
	Pizza[] pizzaData = {pizza1, pizza2};
	
	public static void main(String[] args) {
		
		PizzaTester tester = new PizzaTester();
		tester.buyPizza("A");
		tester.buyPizza("Margarita");
		tester.buyPizza("large", 13);
		tester.buyPizza("large", 12);
	}
	
	public void buyPizza(String name)
	{
		boolean pizzaIsAvailable = false;
		for (int i = 0; i < pizzaData.length; i++)
		{
			if (pizzaData[i].getName() == name)
			{
				pizzaIsAvailable = true;
			}
		}
		if (pizzaIsAvailable)
		{
			System.out.println("Hi your pizza is successfully booked");
		}
		else
		{
			System.out.println("Hi sorry, your pizza is not available");
		}
	}
	
	public void buyPizza(String size, int price)
	{
		boolean pizzaIsAvailable = false;
		for (int i = 0; i < pizzaData.length; i++)
		{
			if (pizzaData[i].getSize() == size && pizzaData[i].getPrice() == price)
			{
				pizzaIsAvailable = true;
			}
		}
		if (pizzaIsAvailable)
		{
			System.out.println("Hi your pizza is successfully booked");
		}
		else
		{
			System.out.println("Hi sorry, your pizza is not available");
		}
	}

}