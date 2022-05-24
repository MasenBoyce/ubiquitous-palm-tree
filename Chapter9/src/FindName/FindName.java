/*

	Program: FindName.java         Last Date of this Revision: May 24, 2022
	Purpose: This program prompts the user to add a list of names to an array then asks the user to find a name inside the array
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/


package FindName;

import java.util.*;

public class FindName extends Search 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int numP, location; 
		String PersonName, FindName;
		
		
		System.out.println("Enter the number of names being added to the list (max 5): ");
		numP = input.nextInt();
		
		
		String[] Names = new String[numP];
		
		
		for (int i = 0; i < numP; i++) 
		{
			System.out.println("Enter the name of person " + i + ": ");
			
			
			Names[i] = input.next();
		}
		
		
		System.out.println("Enter the name you would like to find: ");
		FindName = input.next();
		
		
		location = Search.linear(Names, FindName);
		
		
		if(location == -1) 
		{
			System.out.println("Name not found in the array.");
		}
		
		else 
		{
			System.out.println("The name can be found at index " + location);
		}
		
		
		
		}
}


/*

Screen dump:


Enter the number of names being added to the list (max 5): 
3
Enter the name of person 0: 
Masen
Enter the name of person 1: 
Ali
Enter the name of person 2: 
Eli
Enter the name you would like to find: 
Ali
The name can be found at index 1

*/