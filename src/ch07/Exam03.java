package ch07;

// 다형성 : 메소드 오버라이팅 + 추상(화) 클래스
// 상속 : 메소드 오버라이딩 (Exam01:59)
// ** 오버라이딩 된 메서드가 항상 우선권을 가짐
public class Exam03 {
	
	public static void main(String[] args) {
		// 업 캐스팅
		// 다형성(업캐스팅, 다운캐스팅)에서 오버라이딩된 메서드가 존재한다면 그 메서드가 항상 우선권을 가짐
		PClass pClass01 = new CClass();
		pClass01.pMethod();
		CClass cClass01 = new CClass();
		cClass01.pMethod();
		
	}

}

class PClass {
	void pMethod() {
		System.out.println("++ 부모클래스의 메소드 실행.");
	}
}
class CClass extends PClass {
	@Override
	void pMethod() {
		System.out.println("-- 자식클래스의 오버라이딩 된 메소드 실행.");
	}
	
}
