package chap13;

public class Testanswer {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		try {
			System.out.print("2/0Àº : ");
			int div = b/a;
			System.out.println(div);
		} catch (RuntimeException e) {
			System.out.println("RE");			
		}catch (Exception e) {
			System.out.println("E");			
		}
		
	}

}
