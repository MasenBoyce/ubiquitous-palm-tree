package Squares;


public class Squares 
{
	static double[] numbers = {0, 1, 2, 3, 4};
	static int arrayLength = numbers.length;

	
	public static void main(String[] args) 
	{
	
		for (int i = 0; i < arrayLength; i++) 
		{
			numbers[i] = Math.pow(numbers[i], 2);
		}
		
		
		System.out.println("Squared array: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4]);
	}
}


/*

Screen dump:


Squared array: 0.0, 1.0, 4.0, 9.0, 16.0

*/