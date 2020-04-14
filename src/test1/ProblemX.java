package test1;

public class ProblemX {
	
	public static void main(String[] args) {
		CheckIfLucky(12334);
	}
	
	public static void CheckIfLucky(int a)
	{
		String numbers = Integer.toString(a);
		String uniqueNumbers = numbers.substring(0, 1);
		boolean isLucky = false;
		
		for (int i = 0; i < numbers.length(); i++) {
			System.out.println("outer loop: " + numbers.charAt(i));
			for (int j = 0; j < uniqueNumbers.length(); j++) {
				if(uniqueNumbers.charAt(j) != numbers.charAt(i))
				{
					System.out.println("unique: " + numbers.substring(i, i+1));
					uniqueNumbers += numbers.substring(i, i+1);
					break;
				}
			}
		}
		System.out.println(uniqueNumbers);
	}
}