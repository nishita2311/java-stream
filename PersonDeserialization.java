package com.accenture.lkm.io.objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonDeserialization {

	public static void readPerson(String fileName) throws IOException, ClassNotFoundException {
		
		try(FileInputStream fin =new FileInputStream("src/files/person.dat");
				ObjectInputStream ion=new ObjectInputStream(fin);){
			Person p= (Person)ion.readObject();
			System.out.println(p.toString());
			
			}
				
		
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		readPerson("src/files/person.dat");

	}
	
}
