package chap13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age=0;
		try {
			age = stdIn.nextInt();
			System.out.print("����� ���̴� " + age + "�Դϴ�.");
		} catch (InputMismatchException e) {
			
			//e.printStackTrace();
			System.out.println("���̴� ������ �Է����ּ���.");
		}
		
	}

}
