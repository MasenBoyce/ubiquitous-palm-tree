/*

	Program: HighestGrade.java         Last Date of this Revision: May 24, 2022
	Purpose: This program asks the user to enter a list of scores between 0 and 100 and will return the highest score to the user.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package HighestGrade;


import java.util.ArrayList;
import java.util.Scanner;


public class HighestGrade 
{
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int highestScore = 0;
		int score;
	
		ArrayList<Integer> ScoreList = new ArrayList<Integer>(); //initializes an array to store student grade
		
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Enter a score between 0 and 100: ");
			score = input.nextInt();
			
			ScoreList.add(score);
			
			
			if (score > highestScore) 
			{
				highestScore = score;
			}
		}
		
		
		System.out.println("The highest score is: " + highestScore);
	}
}

/*

Screen dump:


Enter a score between 0 and 100: 
50
Enter a score between 0 and 100: 
60
Enter a score between 0 and 100: 
70
Enter a score between 0 and 100: 
80
Enter a score between 0 and 100: 
90
The highest score is: 90

*/
