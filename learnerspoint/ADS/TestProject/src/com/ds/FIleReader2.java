package com.ds;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FIleReader2 {
public static void main(String[] args) {
	try{
		
		File f = new File("C:\\devwrkspc\\docs\\tutorials\\DS\\Stack-I.pdf");
		FileInputStream fis = new FileInputStream(f);
		byte b[] = new byte[1024];
		
		int read = 0 ; 
		 
		while((read = fis.read(b)) > 0 )
		{
			System.out.println(new String(b));
			
		}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
