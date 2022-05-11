/*

	Program: FindAndReplace.java          Last Date of this Revision: May 11, 2022
	Purpose: This program allows the user to enter the name of a file and enter a word or phrase they want to find in the file. The user can then replace the word or phrase with another word or phrase.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/


package FindAndReplace;

import java.io.*;
import java.util.Scanner;



public class FindAndReplace 
{
	public static void main(String[] args) 
	{
		//variables
		Scanner input = new Scanner(System.in);
		
		String Data1 = "";
		String Data2 = "";
		
		String fName;
		FileWriter out;
		BufferedReader fReader;
		BufferedWriter fWriter;
		
		//prompts user for file name and creates a file with the entered name
		System.out.println("Please enter the name of the file: ");
		fName = input.nextLine();
		File dataFile = new File(fName);
		
		
		System.out.println("Please enter the word or string of text you want to find: ");
		String findText = input.nextLine();
		
		
		System.out.println("Please enter the word or string of text you want to replace it with: ");
		String replaceText = input.nextLine();
		
		
		
		try 
		{
			 
			String newData = Data1.replaceAll(findText, replaceText);
		
			
			fWriter = new BufferedWriter(new FileWriter(dataFile));
			fWriter.write(newData);
		}
		
		
		catch(IOException e)
		{
			System.out.println("Problem Reading File");
			System.err.println("IO Exception: " + e.getMessage());
		}	
	}
}
