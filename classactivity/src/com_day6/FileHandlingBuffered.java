package com_day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlingBuffered {
	public static void main(String [] args)
	{
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Enter file to be read");
			int letter=br.read();
			while(br.ready())
			{
				System.out.println((char)letter);
			}
			System.out.println();
		}
		catch(IOException e){
			
				System.out.println(e.getMessage());
			}
		
	}

}
