package com.accenture.lkm.io.bytestreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamActivity {
	// TODO 1. create an instance of FileOutputStream in append mode using try with
	// resources
	// TODO 2. invoke System.lineSeparator().getBytes() to move the cursor to next
	// line
	// TODO 3. invoke write method by passing message.getBytes() as an argument
	// TODO 4. invoke flush() method
	public static void write(String fileName, String record) throws IOException {

	}

	public static void main(String[] args) throws IOException {
		write("src/files/users.txt", "mary,mary@gmail.com,+91-892237654");
	}
}
