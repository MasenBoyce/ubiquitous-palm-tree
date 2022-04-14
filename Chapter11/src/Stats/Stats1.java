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
		
		
		if(file.equals("/Chapter11/src/Stats/TestResults")) 
		{
			
			FileReader in = null;
			BufferedReader fileReader = null;
			
			String read;
			//add doubles here
			
			
			ArrayList<String> stuNames = new ArrayList<String>();
			ArrayList<String> stuScore = new ArrayList<String>();
			
			fileReader = new BufferedReader(in);
			
			while((read = fileReader.readLine()) != null) 
			{
				
			}
				
				
				
				
				
			
		}
		
	}
}
