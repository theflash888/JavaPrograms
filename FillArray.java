import java.util.Arrays;

public class CreateArray 
{
	public static void main(String[] args)
	{
		int LENGTH = 10;
		
		int[] numbers = new int[LENGTH];
		
		for(int i = 0; i < LENGTH; i++)
		{
			numbers[i] = i;
		}
		
		for(int i = 0; i < LENGTH; i++)
			System.out.println(numbers[i]);
	}

}
