package FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("MyjavsFile.xls");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String str = "New Data of mr. Dinesh Which Is not predefined class in JAVA ";
		bout.write(str.getBytes());
		bout.close();
		

		FileInputStream fin = new FileInputStream("MyjavsFile.xls");
		BufferedInputStream bin = new BufferedInputStream(fin);

		int i;
		while ((i = bin.read()) != -1) {
			System.out.println((char) i);
		}
		fin.close();
		bin.close();
	}

}
