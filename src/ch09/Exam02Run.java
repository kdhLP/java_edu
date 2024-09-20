package ch09;

import ch09.Exam02.Nested;

public class Exam02Run {

	public static void main(String[] args) {
		
		// Exam02 : non-static 클래스
		Exam02 ex = new Exam02();
		
		// Exam02.Nested : static 클래스
		// 내부클래스의 생성방법 01.
		Nested ns = new Nested();
		// 내부클래스의 생성방법 02.
		Exam02.Nested ns02 = new Exam02.Nested();
		
		/* 1. 정적 중첩 클래스는 new 외부클래스.중첩클래스()
		 * import를 통해서 간략하게 사용 가능
		 * 2. 외부클래스의 객체와 내부 중첩클래스의 객체 : 서로 아무 관계가 없는 인스턴스(객체)
		 * 	 - 구조상 중첩해 두었을 뿐 : 중첩클래스의 인스턴스만 따로 선언이 가능
		 * 3. 중첩클래스를 기준으로 외부 클래스의 private 접근제어자로 선언한 객체에 접근 가능
		 * 		- 선언된 위치 : 내부클래스도 외부클래스의 맴버변수의 위치에서 선언
		 */
		
		ns.print();
		
		System.out.println("NestedClass = " + ns.getClass());

	}

}
