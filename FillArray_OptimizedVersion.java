import java.util.Arrays;

public class CreateArray2 
{
	public static void main(String[] args)
	{
		int LENGTH = 15;
		
		double[] array = new double[LENGTH];
		
		for(int i = 0; i < LENGTH; i++)
		{
			Arrays.fill(array, i);
			System.out.println(array[i]);
		}
	}

}
