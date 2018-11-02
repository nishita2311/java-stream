package iOpACKAGE;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
public static void main(String[] args)throws IOException {
	File f1= new File("src/Files1/test.txt");
	
	System.out.println(f1.canRead());
	System.out.println(f1.getName());
	System.out.println(f1.getPath());
	//f1.delete();
	f1.createNewFile();
	
}
}
