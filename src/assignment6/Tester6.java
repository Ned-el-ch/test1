package assignment6;

import assignment6.Problem1.NKShop;
import assignment6.Problem3.Ticket;
import assignment6.Problem4.ContractEmployee;
import assignment6.Problem4.PermanentEmployee;

public class Tester6 {
	
	public static void main(String[] args) {
		
		// PROBLEM 1
		NKShop shop = new NKShop();
		shop.calculatePrice(1002);
		shop.calculatePrice(1006);
		shop.calculatePrice("Reebok", "Skirt", 34);
		shop.calculatePrice("Reebok", "Skirt", 35);
		
		System.out.println("");
		
		// PROBLEM 2 - in it's own class
		
		// PROBLEM 3
		Ticket ticket1 = new Ticket();
		ticket1.calcTicketAmt();
		Ticket ticket2 = new Ticket(6, 9);
		ticket2.calcTicketAmt();
		Ticket ticket3 = new Ticket(9, 6);
		ticket3.calcTicketAmt();
		
		System.out.println("");
		
		// PROBLEM 4
		PermanentEmployee employee1 = new PermanentEmployee();
		employee1.setName("Anil");
		employee1.setEmpId(101);
		employee1.setBasicPay(10000);
		employee1.setHra(1500);
		employee1.setExperience(3);
		employee1.calculateSalary();
		ContractEmployee employee2 = new ContractEmployee();
		employee2.setName("Ankit");
		employee2.setEmpId(102);
		employee2.setWages(500);
		employee2.setHours(10);
		employee2.calculateSalary();
	}

}