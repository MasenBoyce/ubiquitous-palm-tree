/*

	Program: Squares.java         Last Date of this Revision: May 24, 2022
	Purpose: This program takes the numbers inside an array and squares them then returns an array with all the new values.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

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