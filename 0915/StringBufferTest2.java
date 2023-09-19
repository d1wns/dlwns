package chap12;

public class StringBufferTest2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java ");
		StringBuffer sb2 = new StringBuffer("easy ");
		System.out.println(sb1.append("korea"));	//sb1인 java에 korea를 붙혀서 출력 ->java korea ->sb1이 됨
		System.out.println(sb2.append(sb1));		//sb2인 easy에 sb1이 된 java korea를 붙혀서 출력 -> easy java korea -sb2가 됨
		System.out.println(sb1);					//sb1은 java가 아닌 java korea로 바꼈으니 java korea로 출력
		System.out.println(sb2);					//sb2는 easy가 아닌 easy java korea로 바꼈으니 easy java korea로 출력
		System.out.println(sb2.substring(5,9));		//sb2인 easy java korea에서 5번째와 9번째 사이에 있는 열 출력 -> java 
		System.out.println(sb2.delete(5,10));		//sb2에서 5번째와 10번째 열을 삭제한 문장을 출력 -> easy korea -> sb2가 됨
		System.out.println(sb2);					//easy korea가 다시 sb2가 되었으니 easy korea를 출력
		System.out.println(sb1.reverse());			//sb1인 java korea를 거꾸로 출력 -> aerok avaj
		
	}

}
