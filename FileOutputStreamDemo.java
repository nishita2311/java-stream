package com.accenture.lkm.io.bytestreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	
	public static void write() throws FileNotFoundException,IOException{
		try(FileOutputStream fout=new FileOutputStream("src/files/greeting.txt");){
			String message="This is nishita";
			fout.write(message.getBytes());
			fout.flush();
		}
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		write();
	}
}
