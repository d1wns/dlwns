package chap13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("a.txt");	//ctrl + shift + o
			int i;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
			file.close();
		} 
		catch (FileNotFoundException e) 	//alt + shift + z -> block묶기 옵션
		{				
			e.printStackTrace();
			System.out.print(e + "파일이 존재하지 않습니다.");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.out.print("파일을 읽을 수 없습니다.");
		}
	}

}
