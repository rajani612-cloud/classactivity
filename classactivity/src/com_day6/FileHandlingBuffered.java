package com_day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlingBuffered {
	public static void main(String [] args)
	{
		try(FileReader fr=new FileReader("C:\\Users\\Rajani.kushwaha\\git\\repository3\\classactivity\\src\\com_day6\\RajaniNote.txt"))
		{
			int letter=fr.read();
			while(fr.ready())
			{
				System.out.println((char)letter);
				letter=fr.read();
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Enter file to be read"+ br.readLine());

		}
		catch(IOException e){
			
				System.out.println(e.getMessage());
			}
		
		
		try(BufferedReader br=new BufferedReader(new FileReader( "C:\\\\Users\\\\Rajani.kushwaha\\\\git\\\\repository3\\\\classactivity\\\\src\\\\com_day6\\\\RajaniNote.txt")))
				{
					
					while(br.ready())
					{
						System.out.println(br.readLine());
						
					}
				}
					
					catch(IOException e)
					{
						System.out.println(e.getMessage());
					}
					
				
		
				}


}

