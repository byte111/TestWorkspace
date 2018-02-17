package com.ds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileRead {
public static void main(String[] args) {
	try
	{
		FileInputStream fis = new FileInputStream(new File(""));
		FileReader fr = new FileReader(new File(""));
	BufferedReader br = new BufferedReader(fr);
	//br.re
	}
	catch(FileNotFoundException e)
	{
		
	}
}
}
