/*

	Program: MyFile1.java          Last Date of this Revision: April 12, 2022
	Purpose: This program prompts the user for the name of a file and then displays a message that indicates whether the file exists or not.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package MyFile;

import java.util.Scanner;
import java.io.*;

public class MyFile1 
{
	public static void main(String[] args) 
	{
		
	Scanner input = new Scanner(System.in);
	
	
	
	System.out.println("Enter the name of a file: "); //prompts user to enter a file name
	String file = input.next(); //stores the entered file name
	File File = new File(file); //creates a file
	
	
	
	if(File.exists()) //if the file exists returns to user that the file was found
	{
		System.out.println("A file of this name has been found.");
	}
	
	else //if the file doesn't exist returns to user that the file wasn't found
	{
		System.out.println("No file was found.");
	}
	}
}


/*
 
Screen dump:


Enter the name of a file: 
ABCD
No file was found.

Enter the name of a file: 
../Chapter11/src/MyFile/Hello
A file of this name has been found.
 
*/
