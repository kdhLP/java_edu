package ch08;

// interface - implements(구현)
// cf. 상속 - extends(확장)
/*
 * 순수 추상 클래스 - 추상 메소드로만 구성된 추상클래스
 * 	 -> 편리하게 사용할 수 있는 기능 : interface(순수 추상 클래스)
 * 
 */
public interface Exam02 {
	// public abstract : 생략이 가능하고, 생략을 권장
	public abstract void method01();
	void method02();
	void method03();
}
