package classactivity;

public class Exceptiondemo {
	public static void main(String [] args)
	{
		int[] arr = new int[5];
		try
		{
			arr[5]=10;
		}
		catch(NullPointerException e)
		{
			System.out.println("null pointer the exception");
		}
			
	}

}
