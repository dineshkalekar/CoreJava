package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("MyjavsFile.xls");

		fout.write(65);
		fout.write(66);
		
		String msg="WelCome to Seed";
		byte [] str=msg.getBytes();
		fout.write(str);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The msg");
		fout.write((sc.nextLine().getBytes()));
		fout.close();	
	}

}
