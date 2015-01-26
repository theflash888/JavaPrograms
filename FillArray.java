import java.util.Arrays;

public class CreateArray 
{
	public static void main(String[] args)
	{
		//specify length of array
		int LENGTH = 10;
		
		//create array
		int[] numbers = new int[LENGTH];
		
		//loop through each array element and fill it with 0-9 
		for(int i = 0; i < LENGTH; i++)
		{
			numbers[i] = i;
		}
		
		//print each element in the array
		for(int i = 0; i < LENGTH; i++)
			System.out.println(numbers[i]);
	}

}
