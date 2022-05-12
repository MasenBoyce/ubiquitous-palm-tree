/*

	Program: Stats1.java          Last Date of this Revision: May 11, 2022
	Purpose: This program asks the user to enter the name of a file that contains the names and scores of students and displays each one as well as the lowest, highest, and average scores.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/


package Stats;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;



public class Stats1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //allows program to read user input
		
		//assigns variables to read the file
		File textFile; 
		FileReader in;
		BufferedReader File;
		
		//initializes variables
		String file, readLine;
		double Score, averageScore;
		double lowestScore = 100;
		double highestScore = 0;
		double totalScore = 0;
		double numberScore = 0;
		

		System.out.println("Enter the name of the file: "); //Obtain file name from user
		file = input.nextLine();
		
		
		textFile = new File(file); //Read file, display student name and statistics
		
		
		ArrayList<String> stuName = new ArrayList<String>(); //initializes an array to store student names
		ArrayList<String> stuScore = new ArrayList<String>(); //initializes an array to store student scores
		
		
		
		try 
		{
			in = new FileReader(textFile);
			File = new BufferedReader(in);
			
			
			
			while((readLine = File.readLine()) != null) 
			{
				stuName.add(readLine); //adds the students name to the array
				
				
				readLine = File.readLine();
				stuScore.add(readLine); //adds the students score to the array

				
				Score = Double.parseDouble(readLine); //converts the students score from a string into a double value 
				totalScore += Double.parseDouble(readLine);
				numberScore += 1; //tracks the amount of scores that have been saved to the arrays
				
				
				if (Score > highestScore) //determines which student got the highest score 
				{
					highestScore = Score;
				}
				
				if (Score < lowestScore) //determines which student got the lowest score
				{
					lowestScore = Score;
				}	
			}
			
			
			averageScore = totalScore / numberScore; //calculates the average score
			
			//prints all the information gathered to the user
			System.out.println("\n" + stuName + "\t");
			System.out.println(stuScore + "\t");
			System.out.println("\n\nHighest Score: " + highestScore);
			System.out.println("Lowest Score: " + lowestScore);
			System.out.println("Average Score: " + averageScore);
				
		}
		
		
		catch(IOException e) //searches for errors (such as missing file) before the code is executed
		{
			System.out.println("File not found");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}		
	}	
}


/*

Screen dump:


Enter the name of the file: 
../Chapter11/src/Stats/Test1.txt

[Masen Boyce, Carter Sarney, Ali Akbari, Eli Baerg, Marcus Vuorinen]	
[90, 92, 61, 25, 100]	


Highest Score: 100.0
Lowest Score: 25.0
Average Score: 73.6

*/

