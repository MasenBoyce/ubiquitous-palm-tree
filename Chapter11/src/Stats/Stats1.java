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
		double Score, lScore, hScore, aScore;
		

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
				System.out.println(stuName + "\t");
				
				
				readLine = File.readLine();
				stuScore.add(readLine);
				System.out.println(stuScore + "\t");
				
				Score = Double.parseDouble(readLine);
			}
			
			
			
			
			
			
			
			
			
		}
		
		catch(IOException e) 
		{
			System.out.println("File not found");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}		
	}	
}

