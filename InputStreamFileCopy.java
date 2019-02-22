package com.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamFileCopy {

	public static void main(String[] args) {
		try
		{
			InputStream is=new FileInputStream("D:/temp/source.txt");
			OutputStream os=new FileOutputStream("D:/temp/newsource.txt");
			byte[] buffer=new byte[1024];
			int bytesRead;
			while((bytesRead=is.read(buffer))!=-1)
			{
				os.write(buffer, 0, bytesRead);
			}
		}
      catch(Exception e)
		{
    	 
    	  e.printStackTrace();
		}
	}

}
