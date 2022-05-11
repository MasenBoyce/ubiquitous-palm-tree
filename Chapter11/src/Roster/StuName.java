/*

	Program: StuName.java         Last Date of this Revision: May 11, 2022
	Purpose: A class that stores the names of students and returns them to the roster application
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/


package Roster;
import java.io.*;

public class StuName implements Serializable 
{
	private String fName, lName;
	
	
	public StuName(String Fname, String Lname) 
	{
		fName = Fname;
		lName = Lname;
	}
	
	
	public String toString() 
	{
		String sName;
		
		
		sName = fName + " " + lName;
		return(sName);
	}
}
