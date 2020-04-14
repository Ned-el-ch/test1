package test1;

public class ProblemSet2 {
	
	public static void main(String[] args) {
		int[] sampleYears = {2012, 2014, 2016, 2100, 2000, 1600};
		int[] leapYears = FindLeapInArray(sampleYears);
		
		int[] numArray = {145,375,0,100,2,40585,1};
		int[] strongNumbers = FindStrongNumbers(numArray);
		
		String[] words = {"Yes", "Mate", "Potato"};
		String term1 = "Potato";
		String term2 = "Duck";
		FindStringInArray(words, term1);
		FindStringInArray(words, term2);
	}
	
	// PROBLEM 1
	public static boolean IsLeapYear(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static int[] FindLeapInArray(int[] sampleYears)
	{
		int count = 0, index = 0;
		for (int i = 0; i < sampleYears.length; i++)
		{
			if (IsLeapYear(sampleYears[i]))
				count++;
		}
		int[] leapYears = new int[count];
		for (int i = 0; i < sampleYears.length; i++)
		{
			if (IsLeapYear(sampleYears[i]))
				leapYears[index] = sampleYears[i];
		}
		return leapYears;
	}
	
	// PROBLEM 2
	public static int FindFactorial(int number)
	{
		int result = 1;
		if (number > 1)
		{
			for (int i = 1; i <= number; i++) {
				result *= i;
			}
		}
		return result;
	}
	public static int[] FindStrongNumbers(int[] numArray)
	{
		int count = 0, index = 0;
		
		for (int i = 0; i < numArray.length; i++)
		{
			String num = Integer.toString(numArray[i]);
			int y = 0;
			for (int j = 0; j < num.length(); j++)
			{
				int x = Character.getNumericValue(num.charAt(j));
				y += FindFactorial(x);
			}
			if (y == numArray[i])
			{
				count++;
			}
		}
		int[] strongNumbers = new int[count];
		for (int i = 0; i < numArray.length; i++)
		{
			String num = Integer.toString(numArray[i]);
			int y = 0;
			for (int j = 0; j < num.length(); j++)
			{
				int x = Character.getNumericValue(num.charAt(j));
				y += FindFactorial(x);
			}
			if (y == numArray[i])
			{
				strongNumbers[index] = numArray[i];
				index++;
			}
		}
		return strongNumbers;
	}
	
	// PROBLEM 3
	public static int FindOccurences(String word, char letter)
	{
		int count  = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter)
			{
				count++;
			}
		}
		return count;
	}
	
	// PROBLEM 4
	public static void FindStringInArray(String[] words, String term)
	{
		boolean wordIsPresent = false;
		for (int i = 0; i < words.length; i++) {
			if (words[i] == term)
			{
				wordIsPresent = true;
			}
		}
		System.out.println("The string is" + (wordIsPresent ? " " : " not ") + "found");
	}
	
}