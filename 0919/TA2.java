package chap13;

public class TA2 {

	public static void main(String[] args) {
		try {
			method1();
			System.out.println("�޼ҵ� ȣ�� ��");
		}
		catch (ArrayStoreException ex) {
			System.out.println("AE");
		}
		catch (ArithmeticException ex) {
			System.out.println("AE");
		}
	}
	static void method1() throws RuntimeException {
		int a = 0;
		int b = 2/a;
		System.out.println("��������");
	}

}
