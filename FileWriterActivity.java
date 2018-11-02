package com.accenture.lkm.io.characterstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterActivity {

	// TODO 1. create an instance of FileWriter in append mode by passing fileName
	// as an argument to FileWriter constructor using try-with-resource statement
	
	// TODO 2. invoke write() method on FileWriter by passing record variable as an argument

	public static void writeCharacterData(String fileName, String record) throws IOException {

	}

	public static void main(String[] args) throws IOException {
		writeCharacterData("src/files/users.txt", "Alice, alice@gmail.com,+91-998768765");
	}
}
