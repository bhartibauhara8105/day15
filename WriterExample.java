package com.day15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		try
		{
			Writer w=new FileWriter("sample1.txt");
			String content="she sells sea shell in the sea";
			w.write(content);
			w.close();
			System.out.println("Data Written");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
