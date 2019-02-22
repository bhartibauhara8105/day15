package com.day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(new File("D:/temp/countries.txt")));
		String line="";
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not exists or insufficient rights");
			e.printStackTrace();
		}
		catch(IOException ex)
		{
			System.out.println("an exception occured while reading the file");
			ex.printStackTrace();
		}

	}

}
