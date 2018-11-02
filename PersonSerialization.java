package com.accenture.lkm.io.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSerialization {

	// TODO 1. Create an instance of FileOutputStream in append mode by passing
	// fileName as an argument to FileOutputStream constructor
	
	// TODO 2. Create an instance of ObjectOutputStream and
	// chain it with FileOutputStream

	// TODO 3. invoke writeObject method on instance of ObjectOutputStream and
	// pass person as argument to persist it in Person.dat file

	public static void savePerson(Person p) throws IOException
	{
		try(FileOutputStream fout=new FileOutputStream("src/files/person.dat");
				ObjectOutputStream oos=new ObjectOutputStream(fout);)
				{
					oos.writeObject(p);
					System.out.println("object saved!!");
					
				}

	}

	

	public static void main(String[] args) throws IOException 
	{
		Person p= getPerson();
		savePerson(p);

	}
	private static Person getPerson()
	{
		Person p=new Person();
		p.setId(100);
		p.setName("NISHITA");
		p.setEmail("nishi95@gmail.com");
		return p;
		
	}
}
