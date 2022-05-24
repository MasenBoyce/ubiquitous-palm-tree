/*

	Program: Search.java        Last Date of this Revision: May 24, 2022
	Purpose: This program searches the array from a name and will return it if it can find it and will return null if it can't find it.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package FindName;

public class Search 
{
	public static int linear(String[] array, String nameToFind) 
	{
		int index = 0;
		
		
		while ((!array[index].equals(nameToFind)) && (index < array.length - 1)) 
		{
			index += 1;
		}
		
		
		if(array[index].equals(nameToFind)) 
		{
			return(index);
		}
		
		else 
		{
			return(-1);
		}
	}
}
