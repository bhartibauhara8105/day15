package com.day15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try
		{
			FileWriter wr=new FileWriter("names.txt",true);
			BufferedWriter bwr=new BufferedWriter(wr);
			bwr.write("abhi");
			bwr.write("\n");
			bwr.newLine();
			bwr.write("hobert");
			bwr.close();
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
