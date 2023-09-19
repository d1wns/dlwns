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
		catch (FileNotFoundException e) 	//alt + shift + z -> block���� �ɼ�
		{				
			e.printStackTrace();
			System.out.print(e + "������ �������� �ʽ��ϴ�.");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.out.print("������ ���� �� �����ϴ�.");
		}
	}

}
