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
