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
