package com_day6;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class FileHandling2 {
	

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
		
		System.out.println();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		
		}
		
	}

}
