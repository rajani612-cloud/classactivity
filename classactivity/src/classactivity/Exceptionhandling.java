package classactivity;

import java.util.Arrays;
import java.util.Scanner;

public class Exceptionhandling {
	public static void check(int size, int[] arr){
		

	try
	{
		System.out.println("Acessing element at index "+size+ ":"+arr[size]);
	
	}
	catch(ArrayIndexOutOfBoundsException  e )
	{
		System.out.println("ArrayIndexOutOfBoundsException ");
	}
	catch(NullPointerException e)
	{
		System.out.println("null ponter exception");
	}
	}
	
	public static void main(String [] args)
	{
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=ob.nextInt();
	//an array with specified size
		int [] arr=new int[size];
//		System.out.println("Enter array element ");
		
		//get user input for array element
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element at index" +i+ ":");
			
			arr[i]=ob.nextInt();
		}
		check(size,arr);
		ob.close();
		
		
	}

}
