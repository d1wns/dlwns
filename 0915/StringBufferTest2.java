package chap12;

public class StringBufferTest2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java ");
		StringBuffer sb2 = new StringBuffer("easy ");
		System.out.println(sb1.append("korea"));	//sb1�� java�� korea�� ������ ��� ->java korea ->sb1�� ��
		System.out.println(sb2.append(sb1));		//sb2�� easy�� sb1�� �� java korea�� ������ ��� -> easy java korea -sb2�� ��
		System.out.println(sb1);					//sb1�� java�� �ƴ� java korea�� �ٲ����� java korea�� ���
		System.out.println(sb2);					//sb2�� easy�� �ƴ� easy java korea�� �ٲ����� easy java korea�� ���
		System.out.println(sb2.substring(5,9));		//sb2�� easy java korea���� 5��°�� 9��° ���̿� �ִ� �� ��� -> java 
		System.out.println(sb2.delete(5,10));		//sb2���� 5��°�� 10��° ���� ������ ������ ��� -> easy korea -> sb2�� ��
		System.out.println(sb2);					//easy korea�� �ٽ� sb2�� �Ǿ����� easy korea�� ���
		System.out.println(sb1.reverse());			//sb1�� java korea�� �Ųٷ� ��� -> aerok avaj
		
	}

}
