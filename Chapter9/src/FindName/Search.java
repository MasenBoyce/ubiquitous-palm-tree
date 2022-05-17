package FindName;

public class Search 
{
	public static int linear(int[] array, int numToFind) 
	{
		int index = 0;
		
		while ((array[index] != numToFind) && (index < array.length - 1)) 
		{
			index += 1;
		}
		
		
		if(array[index] == numToFind) 
		{
			return(index);
		}
		
		else 
		{
			return(-1);
		}
	}
}
