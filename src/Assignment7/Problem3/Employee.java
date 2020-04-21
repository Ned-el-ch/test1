package Assignment7.Problem3;

public class Employee {
	
	private int points;

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	public static int calculatePerformance(Employee employee)
	{
		int performance = 0;
		if (employee.getPoints() <= 49)
		{
			performance = PerformanceRating.poor;
			System.out.println("Your performance is poor");
		}
		else if (employee.getPoints() <= 59)
		{
			performance = PerformanceRating.average;
			System.out.println("Your performance is average");
		}
		else if (employee.getPoints() <= 79)
		{
			performance = PerformanceRating.good;
			System.out.println("Your performance is good");
		}
		else
		{
			performance = PerformanceRating.outstanding;
			System.out.println("Your performance is outstanding");
		}
		return performance;
	}

}