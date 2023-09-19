/*
 * 작성일 : 2023년 9월 8일
 * 작성자 : 컴소부 202095074 이준
 * 설명 : 추상클래스 - 동물의 울음소리를 출력하기
 * */

package java0908;

//추상 클래스 - 동물
abstract class myAnimal {
	/* 추상메소드는 몸체를 만들지 않는다(선언만 한다)
	abstract String Sound() {
		
	}
	*/
	// 추상메소드 : 동물의 소리를 반환하는 메소드
	abstract String Sound();
	
	// 일반 메소드 : 동물의 기본 정보 출력하는 메소드
	void displayInfo() {
		System.out.println("동물의 울음소리 입니다.");
	}
}

// 고양이 클래스 : 추상 클래스 상속
// 고양이 울음소리 반환
class myCat extends myAnimal {

	@Override
	String Sound() {
		// 재정의
		return "야옹~~";
	}

	@Override
	void displayInfo() {
		//super.displayInfo();
		System.out.println("고양이 울음소리 입니다.");
	}
	
}


public class AnimalTest {

	public static void main(String[] args) {
		myAnimal cat = new myCat();
		
		cat.displayInfo();
		//System.out.println("고양이 울음소리는 "+cat.Sound());
		//cat.Sound(); 이대로는 출력안댐
		System.out.println(cat.Sound());
	}

}
