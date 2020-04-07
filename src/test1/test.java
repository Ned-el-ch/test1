package test1;

public class test
{
	public static void main(String args[])
	{
		RunSampleInputs();
	}
	
	static void RunSampleInputs()
	{
		
		CalculateSimpleInterest(1000f, 5f, 2f);
		CanBeAdmitted(81f, 17);
		NumericalProblemSet1(12, 23, 45, 1, 156);
		StringExercise1();
		CompareStrings("Flying", "FlYInG");
		CompareStrings("beautiful", "beautiful");
		CompareStrings("Good", "day");
		CircleArea(2f);
		CircleArea(3f);
		ApplyDiscount(123123, 512, 541.53f);
		ProductOf(1, 5, 3);
		ProductOf(3, 7, 8);
		ProductOf(7, 4, 3);
		ProductOf(1, 5, 7);
		MaximumOf(11, 13, 34);
		MaximumOf(21, 3, 13);
		MaximumOf(45, 88, 10);
		TrapArea(12f, 42f, 30f);
		IsLeapYear(2020);
		IsLeapYear(2019);
		IsLeapYear(2100);
		IsLeapYear(2000);
		IsLeapYear(2200);
		CustomResultOf(2, 3, 1);
		CustomResultOf(4, 1, 2);
		CustomResultOf(3, 5, 2);
		CookiesSold(100, 150, 110, 186);
		CookiesSold(50, 180, 85, 150);
		IsTomTallest(180, 175, 168);
		HasTraineePassed(65);
		HasTraineePassed(75);
		HasTraineePassed(50);
		ZipZapZoom(6);
		ZipZapZoom(15);
		ZipZapZoom(20);
		ZipZapZoom(22);
		CoinsAndNotes(4, 2, 21);
		CoinsAndNotes(2, 11, 11);
		CoinsAndNotes(3, 3, 19);
		SumOfIntegers(1);
		SumOfIntegers(2);
		SumOfIntegers(5);
		SumOfIntegers(10);
		PrintCharactersSeparately("HELLO");
		PrintGeometricSequence();
		FactorialOf(0);
		FactorialOf(2);
		FactorialOf(5);
		SumOfDigits(123);
		SumOfDigits(2371);
		SumOfDigits(42);
		ReverseNumber(27);
		GenerateTicketIDs(5);
		int[] sampleArr = {10,20,33,42,51};
		SumOfArray(sampleArr);
		CricketMatchAnalyzer();
		SalaryAnalyzer();
		int[] sampleArr2 = {14,37,10,100,21};
		findEvenArray(sampleArr2);
		AdjacentNumbers();
		
		FindStrongNumbers();
		CircleConstructorExample();
	}

	static void CalculateSimpleInterest(float principal,float interestRate,float timeInYears)
	{
		float simpleInterest;
		simpleInterest = (principal * interestRate * timeInYears) / 100f;
		
		System.out.println(simpleInterest);
	}

	static void CanBeAdmitted(float marks, int age)
	{
		System.out.println(marks > 80f && age >= 18);
	}

	static void NumericalProblemSet1(int num1, int num2, int num3, int num4, int num5)
	{
		System.out.println(num1+num2/num3);
		System.out.println((num1+num2)/num3);
		System.out.println(num1+num2*num4-num5/num3);
		System.out.println(((num1+num2)*num4-num5)/num3);
		System.out.println(num1++ - num2 * 7 / --num2 + num1 * 10);
	}

	static void StringExercise1()
	{
		String word1 = "Infosys Ltd";
        String word2 = "Training";
        System.out.println(word1.toUpperCase());
        String word3 = word1 + word2;
        System.out.println(word3);
	}

	static void CompareStrings(String str1, String str2)
	{
		System.out.println(str1.equalsIgnoreCase(str2) ? "The strings are equal" : "The strings are not equal");
	}

	static void CircleArea(float radius)
	{
		int area = (int) (3.14f * radius * radius);
		System.out.println(area);
	}

	static void ApplyDiscount(int billID, int customerID, double amount)
	{
		double discountedAmount = amount * 0.98f;
		System.out.println("Bill ID: " + billID + ", Customer ID: " + customerID + ", Discounted Amount: " + discountedAmount);
	}

	static void ProductOf(int num1, int num2, int num3)
	{
		if (num1 == 7)
		{
			System.out.println(num2 * num3);
		}
		else if (num2 == 7)
		{
			System.out.println(num3);
		}
		else if (num3 == 7)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(num1 * num2 * num3);
		}
	}

	static void MaximumOf(int num1, int num2, int num3)
	{
		if (num1 > num2 && num1 > num3)
		{
			System.out.println(num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println(num2);
		}
		else if (num3 > num1 && num3 > num2)
		{
			System.out.println(num3);
		}
	}
	
	static void TrapArea(float base1, float base2, float height)
	{
		System.out.println(0.5f * (base1 + base2) * height);
	}
	
	static void IsLeapYear(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}
	}
	
	static void CustomResultOf(int a, int b, int c)
	{
		System.out.println(4 * a + 2 * b - 3 * c);
	}
	
	static void CookiesSold(int takeOffs, int takeOffSeatingCap, int landings, int landingSeatingCap)
	{
		int result = takeOffs * takeOffSeatingCap * 2 + landings * landingSeatingCap;
		System.out.println(result);
	}
	
	static void IsTomTallest(int tomHeight, int jackHeight, int harryHeight)
	{
		System.out.println(tomHeight > jackHeight && tomHeight > harryHeight);
	}
	
	static void HasTraineePassed(int score)
	{
		System.out.println(score >= 65 ? "The trainee has passed" : "The trainee has failed");
	}
	
	static void ZipZapZoom(int num)
	{
		if (num % 3 == 0 && num % 5 == 0)
		{
			System.out.println("Zoom");
		}
		else if (num % 3 == 0)
		{
			System.out.println("Zip");
		}
		else if (num % 5 == 0)
		{
			System.out.println("Zap");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
	static void CoinsAndNotes(int notes, int coins, int amount)
	{
		int noteCount = 0, coinCount = 0;
		noteCount = amount / 5;
		coinCount = amount % 5;
		
		if (notes >= noteCount && coins >= coinCount)
		{
			System.out.println("$1 coins: " + coinCount + ", $5 notes: " + noteCount);
		}
		else
		{
			System.out.println("-1");
		}
	}
	
	static void SumOfIntegers(int count)
	{
		int result = 0;
		for (int i = 1; i <= count; i++) {
			result += i;
		}
		System.out.println(result);
	}
	
	static void PrintCharactersSeparately(String str)
	{
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	static void PrintGeometricSequence()
	{
		int i = 1;
		while (i <= 1024) {
			System.out.println(i);
			i *= 2;
		}
	}
	
	static int FactorialOf(int x)
	{
		int result = 1;
		if (x > 1)
		{
			for (int i = 1; i <= x; i++) {
				result *= i;
			}
		}
		//System.out.println(result);
		return result;
	}
	
	static void SumOfDigits(int x)
	{
		int result = 0;
		String num = Integer.toString(x);
		for (int i = 0; i < num.length(); i++) {
			result += Character.getNumericValue(num.charAt(i));
		}
		System.out.println(result);
	}
	
	static void ReverseNumber(int x)
	{
		String num = Integer.toString(x);
		String reversed = "";
		for (int i = 0; i < num.length(); i++) {
			reversed += num.charAt(num.length() - i - 1);
		}
		System.out.println(reversed);
	}
	
	static void GenerateTicketIDs(int count)
	{
		int startingID = 1001;
		String[] strings = new String[count];
		for (int i = 0; i < count; i++) {
			int ID = startingID + i;
			strings[i] = "T" + ID;
		}
		System.out.println(String.join(", ", strings));
	}
	
	static void SumOfArray(int[] arr)
	{
		int result = 0;
		for (int i : arr) {
			result += i;
		}
		System.out.println(result);
	}
	
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
	
	static int[] FindLeapInArray()
	{
		int[] sampleYears = {2012, 2014, 2016, 2100, 2000, 1600};
		
		int count = 0, index = 0;
		for (int i = 0; i < sampleYears.length; i++)
		{
			if ((sampleYears[i] % 4 == 0 && sampleYears[i] % 100 != 0) || sampleYears[i] % 400 == 0)
				count++;
		}
		int[] leapYears = new int[count];
		for (int i = 0; i < sampleYears.length; i++)
		{
			if ((sampleYears[i] % 4 == 0 && sampleYears[i] % 100 != 0) || sampleYears[i] % 400 == 0)
				leapYears[index] = sampleYears[i];
		}
		return leapYears;
	}
	
	static void FindStrongNumbers()
	{
		int[] numArray = {145,375,0,100,2,40585,1};
		int count = 0, index = 0;
		for (int i = 0; i < numArray.length; i++)
		{
			String num = Integer.toString(numArray[i]);
			int y = 0;
			for (int j = 0; j < num.length(); j++)
			{
				int x = Character.getNumericValue(num.charAt(j));
				y += FactorialOf(x);
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
				y += FactorialOf(x);
			}
			if (y == numArray[i])
			{
				strongNumbers[index] = numArray[i];
				index++;
			}
		}
		for (int i = 0; i < strongNumbers.length; i++) {
			System.out.println(strongNumbers[i]);
		}
	}
	
	static void CircleConstructorExample()
	{
		Circle a = new Circle(5.1f);
		a.Area();
	}
}

class Circle
{
	private float radius;
	Circle(float radius)
	{
		this.radius = radius;
	}
	public void Area()
	{
		System.out.println(radius * radius * 3.14f);
	}
	
	public float getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(float radius)
	{
		this.radius = radius;
	}
}

class Chocolate
{
	private int barcode;
	private String name;
	private int weight;
	private int cost;
	Chocolate(int barcode, String name, int weight, int cost)
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
	
	public String getName()
	{
		return this.name;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	
	public int getCost()
	{
		return this.cost;
	}
	
	public void setBarcode(int barcode)
	{
		this.barcode = barcode;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	public void setCost(int cost)
	{
		this.cost = cost;
	}
}

class CourseRegistration
{
	private String studentName;
	private int registrationID;
	private float qualifyingMarks;
	private double courseFee;
	private int courseID;
	private boolean hostelRequired;
	
	public CourseRegistration(
			String studentName,
			int registrationID,
			float qualifyingMarks,
			double courseFee,
			int courseID,
			boolean hostelRequired
			)
	{
		this.studentName = studentName;
		this.registrationID = registrationID;
		this.qualifyingMarks = qualifyingMarks;
		this.courseFee = courseFee;
		this.courseID = courseID;
		this.hostelRequired = hostelRequired;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public void setRegistrationID(int registrationID)
	{
		this.registrationID = registrationID;
	}
	
	public void setQualifyingMarks(float qualifyingMarks)
	{
		this.qualifyingMarks = qualifyingMarks;
	}
	
	public void setCourseID(int courseID)
	{
		this.courseID = courseID;
	}
	
	public void setHostelRequired(boolean hostelRequired)
	{
		this.hostelRequired = hostelRequired;
	}
	
	public String getStudentName()
	{
		return this.studentName;
	}
	
	public int getRegistrationID()
	{
		return this.registrationID;
	}
	
	public float getQualifyingMarks()
	{
		return this.qualifyingMarks;
	}
	
	public double getCourseFee()
	{
		return this.courseFee;
	}
	
	public int getCourseID()
	{
		return this.courseID;
	}
	
	public boolean isHostelRequired()
	{
		return this.hostelRequired;
	}
	
	public boolean validateMarks()
	{
		return this.qualifyingMarks < 65f;
	}
	
	public boolean validateCourseID()
	{
		return (this.courseID > 1000 && this.courseID < 1006);
	}
	
	public void calculateCourseFee()
	{
		float discount = 0f;
		if (this.qualifyingMarks >= 85)
		{
			discount = 0.015f;
		}
		else if (this.qualifyingMarks >= 70)
		{
			discount = 0.010f;
		}
		else if (this.qualifyingMarks >= 65)
		{
			discount = 0.005f;
		}
		this.courseFee *= (1 - discount);
	}
}


















































