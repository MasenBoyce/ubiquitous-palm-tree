package Stats;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Stats1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the name of a file: "); //prompts user to enter a file name
		String file = input.next(); //stores the entered file name
		File File = new File(file); //creates a file
		
		
		if(file.equals("/Chapter11/src/Stats/TestResults")) //if the user enters the name of the pre existing file then the program will run 
		{
			
			FileReader in = null;
			BufferedReader fileReader = null;
			
			String read;
			double HScore, LScore, TScore, AScore;
			
			
			String stuNames;
			double stuScore;
			
			
			fileReader = new BufferedReader(in);
			
			while((read = fileReader.readLine()) != null) 
			{
				stuNames = fileReader.readLine();
				fileReader.readLine();
				
			
				stuScore = fileReader.readLine();
				
			
				
			}
				
				
				
				
				
			
		}
		
	}
}
