package chap13;
/*
 * 2���� ������ �Է¹޾� �������ϴ� ���α׷�
 */
import java.util.Scanner;
public class ExceptionTest01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("ù ��° �� �Է� : ");
		int num1 = stdIn.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		int num2 = stdIn.nextInt();
		
		System.out.println(num1 / num2);
		
	}

}
