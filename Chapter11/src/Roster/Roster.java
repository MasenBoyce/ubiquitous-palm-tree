/*

	Program: Roster.java          Last Date of this Revision: May 11, 2022
	Purpose: This program allows the user to create a file and enter an amount of students. The user will then enter the names of each student and it will display them.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/


package Roster;

import java.util.Scanner;
import java.io.*;


public class Roster 
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	
	//initializes variables
			int numStu = 0;
			String Fname;
			String Lname;
			String file;
			
			
		System.out.println("Enter the name of the file: "); //Obtain file name from user
		file = input.nextLine();
		
		File dataFile = new File(file); //creates file
		
			
		System.out.println("How many students are being assessed? "); //prompts user to enter the number of students
		numStu = input.nextInt(); //stores entered value
			
			
			try 
			{
				
				FileOutputStream out = new FileOutputStream(dataFile);
				ObjectOutputStream StuName = new ObjectOutputStream(out);
				
				
				for(int stuCounter = 0; stuCounter < numStu; stuCounter++) //counts how many students have been entered into the program 
				{
					
					System.out.println("Enter the first name of the Student: "); //prompts user for student name
					Fname = input.next(); //stores entered name
					
					System.out.println("Enter the last name of the Student: "); //prompts user for student name
					Lname = input.next(); //stores entered name
					
					
					//transfers students name to the file
					StuName.writeObject(new StuName(Fname, Lname));
				}
				
				
				out.close();
				
				
				FileInputStream in = new FileInputStream(dataFile);
				ObjectInputStream rStuName = new ObjectInputStream(in);
				
				
				for(int counter = 0; counter < numStu; counter++) 
				{
					
					System.out.println((StuName)rStuName.readObject());
				}
				
				
				rStuName.close();
			}
			
			
			catch(IOException e) //searches for errors (such as missing file) before the code is executed  
			{
				System.out.println("File not found");
				System.err.println("FileNotFoundException: " + e.getMessage());
			}
			
			
			catch(ClassNotFoundException e) 
			{
				System.out.println("Class Not Found Exception" + e.getMessage());
				
			}
	}
}
