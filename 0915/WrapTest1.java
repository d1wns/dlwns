package chap12;

public class WrapTest1 {
	
	public static void main(String[] args) {
		//Integer i = new Integer로 사용하지 않고 Integer.valueOf로 사용
		Integer i = Integer.valueOf(1) + Integer.valueOf(2);
		switch(i) {
			case 3 :
				System.out.println("three");
				break;
			
			default :
				System.out.println("other");
				break;
		}

	}

}
