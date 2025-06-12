package classactivity;

import java.util.Scanner;

public class Exceptionhandling {
	public void check(int num){
		
	int []arr1=new int[num];
	try
	{
		
	for(int i=0;i<num;i++)
	{
		arr1[i]=i;
		System.out.print(" " +arr1[i]);
	}
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
		System.out.println("Enter num in array");
		int n=ob.nextInt();
		if(n<0)
		{
			System.out.println("Please enter positive number");

		}
		else
		{
			Exceptionhandling obj= new Exceptionhandling();
			obj.check(n);
		}
		ob.close();
		
		
	}

}
