package Assignment7;

import Assignment7.Problem1.CurrentAccount;
import Assignment7.Problem1.Customer;
import Assignment7.Problem1.SavingsAccount;
import Assignment7.Problem2.SingleEventRegistration;
import Assignment7.Problem2.TeamEventRegistration;
import Assignment7.Problem3.Employee;

public class Tester7 {
	
	public static void main(String[] args) {
		
		// PROBLEM 1
		System.out.println("// PROBLEM 1");
		
		Customer customer1 = new Customer();
		customer1.setName("John");
		customer1.setCustomerId(1001);
		
		SavingsAccount accountSA = new SavingsAccount(101, 500, 12);
		accountSA.setCustomer(customer1);
		accountSA.setBalance(1000);
		accountSA.withdraw(1600);
		
		System.out.println("Account name     : " + accountSA.getCustomer().getName());
		System.out.println("Account balance  : " + accountSA.getBalance());
		System.out.println("Account interest : " + accountSA.calculateInterest());
		
		Customer customer2 = new Customer();
		customer2.setName("Jenny");
		customer2.setCustomerId(1002);

		CurrentAccount accountCA = new CurrentAccount(customer2, 500, 102, 2000);
		accountCA.deposit(1500);
		System.out.println("Account name     : " + accountCA.getCustomer().getName());
		System.out.println("Account balance  : " + accountCA.getBalance());
		accountCA.withdraw(4000);
		System.out.println("Account balance  : " + accountCA.getBalance());
		accountCA.withdraw(1500);
		
		// PROBLEM 2
		System.out.println();
		System.out.println("// PROBLEM 2");
		
		SingleEventRegistration participant1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
		participant1.registerEvent();
		TeamEventRegistration team1 = new TeamEventRegistration("Aura", "ShakeALeg", 5, 1);
		team1.registerEvent();
		SingleEventRegistration participant2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
		participant2.registerEvent();
		
		// PROBLEM 3
		System.out.println();
		System.out.println("// PROBLEM 3");
		
		Employee employee1 = new Employee();
		employee1.setPoints(69);
		Employee.calculatePerformance(employee1);
		
		Employee employee2 = new Employee();
		employee2.setPoints(12);
		Employee.calculatePerformance(employee2);
		
		Employee employee3 = new Employee();
		employee3.setPoints(96);
		Employee.calculatePerformance(employee3);
		
	}

}