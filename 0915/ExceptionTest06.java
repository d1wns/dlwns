package chap13;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest06 {

	public static void main(String[] args) throws Exception FileNotFoundException, IOException{
		FileReader file = new FileReader("a.txt");	//ctrl + shift + o
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();
	}
}



