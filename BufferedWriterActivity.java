package com.accenture.lkm.io.characterstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterActivity {
	// TODO 1. create an instance of FileWriter in append mode by
	// passing fileName as an argument to FileWriter constructor using
	// try-with-resources statement
	
	// TODO 2. create an instance of BufferedWriter and chain it with FileWriter
	
	// TODO 3. write a new line to file using System.lineSeparator()
	
	// TODO 4. invoke write method and pass record as an argument

	public static void write(String fileName, String record) throws IOException {

	}

	public static void main(String[] args) throws IOException {
		write("src/files/users.txt", "Tom,Harry,880-674-9212,22-MAY-2015");
	}
}
