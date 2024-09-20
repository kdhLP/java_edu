package ch09;

// 지역클래스 : 지역변수와 같은 위치에 선언되는 클래스
public class Exam04 {
	int outerInstanceValue = 10;
	
	public void outerMethod(int parameter) {
		// 지역변수 
		int outerMethodLocalValue = 20;
		// 지역클래스 : 지역변수와 같은 위치에 선언되는 클래스
		// * 내부클래스(inner Class)의 특징을 그대로 가짐
		// * 외부클래스(Exam04)의 객체생성이 이루어져야 내부클래스에 접근이 가능
		// * 매부 클래스 -> 외부클래스의 변수, 메소드 : 접근이 가능해집니다.
		/*
		 *  *** 캡쳐 ***
		 *  1. 지역클래스에서 접근하는 지역변수의 값을 복사하여 따로 가지고 있음
		 *  2. 지역클래스가 접근하는 지역변수의 값은 변경하면 안된다(final).
		 *  
		 *  * 지역클래스는 선언과 생성이 따로 진행
		 */
		// 선언
		class LocalClass{
			int localInstanceValue = 30;
			public void print() {
				// 내부클래스의 맴버 변수 접근
				System.out.println( localInstanceValue);
				// 지역클래스를 감싸는 메소드 내 지역변수
				System.out.println(outerMethodLocalValue);
				// 지역클래스를 감싸는 메소드의 매개변수(지역변수)
				System.out.println(parameter);
				// 외부클래스의 맴버변수 접근
				System.out.println(outerInstanceValue);
			}
		}
		// 생성
		LocalClass local = new LocalClass();
		local.print();
		
	}
	
}
