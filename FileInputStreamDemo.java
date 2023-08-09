package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("MyjavsFile.xls");
		int str = fin.read();

		System.out.println("" + (char) str); // reading single charactor from file

		int i;
		while ((i = fin.read()) != -1) {
			System.out.println((char) i);
		}
		fin.close();
	}

}
