package assignment1;

public class Tester1 {

public static void main(String[] args) {
		
		CricketMatchAnalyzer();
		SalaryAnalyzer();
		
		int[] sampleArray = {14,37,10,100,21};
		findEvenArray(sampleArray);
		AdjacentNumbers();
	}
	
	// PROBLEM 1
	static void CricketMatchAnalyzer()
	{
		int[] score = {281,344,265,272,236,324,287};
		float averageScore = 0, matchesAboveAvg = 0, matchesEqualAvg = 0, matchesBelowAvg = 0;
		
		for (int i = 0; i < score.length; i++) {
			averageScore += score[i];
		}
		averageScore /= score.length;
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] > averageScore)
			{
				matchesAboveAvg++;
			}
			else if (score[i] == averageScore)
			{
				matchesEqualAvg++;
			}
			else
			{
				matchesBelowAvg++;
			}
		}
		System.out.println("Average Score: " + averageScore);
		System.out.println("Above Average: " + matchesAboveAvg);
		System.out.println("Equal Average: " + matchesEqualAvg);
		System.out.println("Below Average: " + matchesBelowAvg);
	}
	
	// PROBLEM 2
	static void SalaryAnalyzer()
	{
		double[] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		float averageSalary = 0;
		int moreThanAverage = 0, lessThanAverage = 0;
		
		for (int i = 0; i < salary.length; i++) {
			averageSalary += salary[i];
		}
		averageSalary /= salary.length;
		for (int i = 0; i < salary.length; i++) {
			if (salary[i] > averageSalary)
			{
				moreThanAverage++;
			}
			else
			{
				lessThanAverage++;
			}
		}
		System.out.println("Average Salary: " + averageSalary);
		System.out.println("More than average: " + moreThanAverage);
		System.out.println("Less than average: " + lessThanAverage);
	}
	
	// PROBLEM 3
	static int[] findEvenArray(int[] numArray)
	{
		int[] evenNumbers;
		int evenCount = 0;
		int index = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] % 2 == 0)
			{
				evenCount++;
			}
		}
		evenNumbers = new int[evenCount];
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] % 2 == 0)
			{
				evenNumbers[index++] = numArray[i];
			}
		}
		return evenNumbers;
	}
	
	// PROBLEM 4
	static void AdjacentNumbers()
	{
		int[] sample = {1,1,5,100,-20,-20,6,0,0};
		int count = 0;
		for (int i = 1; i < sample.length; i++) {
			if (sample[i] == sample[i - 1])
				count++;
		}
		System.out.println(count);
	}
	
}