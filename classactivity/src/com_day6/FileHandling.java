package com_day6;
//taking data in byte stream and putting out in character stream 
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandling {
	public static void main(String [] args) {
	try(InputStreamReader ir=new InputStreamReader(System.in))
	{
		System.out.println("Enter some letter");
		int letter =ir.read();
		while(ir.ready())
		{
			System.out.println((char)letter);
			letter=ir.read();
		}
		ir.close();
		System.out.println("");
		
		}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
	}

}
