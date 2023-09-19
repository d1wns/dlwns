package chap13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age=0;
		try {
			age = stdIn.nextInt();
			System.out.print("당신의 나이는 " + age + "입니다.");
		} catch (InputMismatchException e) {
			
			//e.printStackTrace();
			System.out.println("나이는 정수로 입력해주세요.");
		}
		
	}

}
