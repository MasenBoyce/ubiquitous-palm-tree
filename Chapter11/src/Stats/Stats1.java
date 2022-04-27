package Stats;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;



public class Stats1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		File textFile;
		FileReader in;
		BufferedReader File;
		
		String file, readLine;
		double Score, aScore;
		double lScore = 100;
		double hScore = 0;
		double tScore = 0;
		double nScore = 0;
		

		System.out.println("Enter the name of the file: "); //Obtain file name from user
		file = input.nextLine();
		
		
		textFile = new File(file); //Read file, display student name and statistics
		
		
		ArrayList<String> stuName = new ArrayList<String>();
		ArrayList<String> stuScore = new ArrayList<String>();
		
		
		
		try 
		{
			in = new FileReader(textFile);
			File = new BufferedReader(in);
			
			
			
			while((readLine = File.readLine()) != null) 
			{
				stuName.add(readLine);
				
				
				readLine = File.readLine();
				stuScore.add(readLine);

				
				Score = Double.parseDouble(readLine);
				tScore += Double.parseDouble(readLine);
				nScore += 1;
				
				
				if (Score > hScore) 
				{
					hScore = Score;
				}
				
				if (Score < lScore) 
				{
					lScore = Score;
				}
				
				
						
				
			}
			
			
			aScore = tScore / nScore;
			
			
			System.out.println("\n" + stuName + "\t");
			System.out.println(stuScore + "\t");
			System.out.println("\n\nHighest Score: " + hScore);
			System.out.println("Lowest Score: " + lScore);
			System.out.println("Average Score: " + aScore);
			
			
			
			
			
			
			
			
			
			
		}
		
		catch(IOException e) 
		{
			System.out.println("File not found");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}		
	}	
}

