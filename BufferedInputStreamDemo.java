package com.accenture.lkm.io.bytestreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo
{

	public static void read(String fileName)throws IOException
	{
		try (FileInputStream fin= new FileInputStream(fileName);
				BufferedInputStream bin=new BufferedInputStream(fin);){
			byte data[]=new byte[bin.available()];
			while(bin.read(data)!=-1)
			{
				System.out.println(new String(data));
			}
		
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		read("src/files/greeting.txt");
	}
}
