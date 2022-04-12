/*

	Program: MyFile2.java          Last Date of this Revision: April 12, 2022
	Purpose: This program creates a filed named zzz.txt then displays a message showing that the file was created. The program then prompts the user to either keep or delete the file and will return the users response whether the file was deleted or not.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package MyFile;

import java.util.Scanner;
import java.io.*;



public class MyFile2 
{

	public static void main(String[] args) 
	{
		File textFile = new File("zzz.txt"); //creates the zzz.txt file
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter the name of a file: ");
		String file = input.next(); //stores the entered file name
		File File = new File(file); //creates a file
		
		
		if(file.equals("zzz.txt")) //if the user enters the name of the already existing file it will return to the user that the file already exists 
		{
			System.out.println("File already exists.");
		}
		
		else //if the user enters the name of a non-existing file then it will attempt to create a file with the entered name.
		{
			try 
			{
				File.createNewFile();
				
				
				System.out.println("New file created."); //tells user the file was created
			}
			
			catch(IOException e) 
			{
				System.out.println("File could not be created.");
				System.err.println("IOException: " + e.getMessage());
			}
		}
		
		
		
		System.out.println("\nwould you like to delete file? Yes or No"); //prompts the user to either keep or delete the file
		String ans = input.next();
		
		
		if(ans.equalsIgnoreCase("Yes")) //deletes the file and returns to the user that the file was deleted 
		{
			textFile.delete();
			System.out.println("File has been deleted.");
		}
		
		else 
		{
			System.out.println("File was not deleted."); //returns to the user that the file was not deleted
		}
	}
}

/*
 
Screen dump:



Please enter the name of a file: 
zzz.txt
File already exists.

would you like to delete file? Yes or No
No
File was not deleted.


Please enter the name of a file: 
ABC
New file created.

would you like to delete file? Yes or No
Yes
File has been deleted.

*/
