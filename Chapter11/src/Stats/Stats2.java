package Stats;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Stats2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numStu = 0;
		String stuName;
		double stuScore;
		
		File dataFile = new File("StuScores.dat");
		FileWriter out;
		BufferedWriter writeFile;
	
		
		System.out.println("How many students are being assessed? ");
		numStu = input.nextInt();
		
		
		try 
		{
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			
			for(int stuCounter = 0; stuCounter < numStu; stuCounter++) 
			{
				
				System.out.println("Enter name of Student: ");
				stuName = input.next();
				
				System.out.println("Enter grade of student: ");
				stuScore = input.nextDouble();
				
				
				writeFile.write(stuName);
				writeFile.newLine();
				writeFile.write(String.valueOf(stuScore));
				writeFile.newLine();
			}
			
			writeFile.close();
			out.close();
		}
		
		
		catch(IOException e) //searches for errors (such as missing file) before the code is executed  
		{
			System.out.println("File not found");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		
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
		

		
		file = ("../chapter11/StuScores.dat"); //gives the file reader the student scores file
		
		
		textFile = new File(file); //Read file, display student name and statistics
		
		
		ArrayList<String> Name = new ArrayList<String>(); //initializes an array to store student names
		ArrayList<String> stuGrade = new ArrayList<String>(); //initializes an array to store student grade
		
		
		
		try 
		{
			in = new FileReader(textFile);
			File = new BufferedReader(in);
			
			
			
			while((readLine = File.readLine()) != null) 
			{
				Name.add(readLine); //adds the students name to the array
				
				
				readLine = File.readLine();
				stuGrade.add(readLine); //adds the students grade to the array

				
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
			System.out.println("\n" + Name + "\t");
			System.out.println(stuGrade + "\t");
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
