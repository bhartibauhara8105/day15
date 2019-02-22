package com.day15;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
       try
       {
    	   Reader reader =new FileReader("sample1.txt");
    	   int data=reader.read();
    	   while(data !=-1)
    	   {
    		   System.out.print((char)data);
    		   data=reader.read();
    	   }
    	   reader.close();
       }
       catch(Exception e)
       {
    	   System.out.println(e.getMessage());
       }
	}

}
