package chap12;

public class Stringtest2 {

	public static void main(String[] args) {
		String s1 = "JAVA Korea";
		String s2 = new String("JAVA Korea");
		String s3 = s2.intern();	//내용이 같으면 주소값 반환
		String s4 = "JAVA Korea";
		String s5 = new String("JAVA Korea");
		System.out.println("s1 과 s2가 같은 장소? : " + (s1 == s2));
		System.out.println("s1 과 s2가 값이 같은가? : " + (s1.equals(s2)));
		System.out.println("s1 과 s3가 같은 장소? : " + (s1 == s3));
		System.out.println("s2 와 s5가 같은 장소? : " + (s2 == s5));
		System.out.println("s2 와 s5가 같은 장소? : " + (s2.equals(s5)));

	}

}
