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
