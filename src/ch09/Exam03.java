package ch09;

/* 내부클래스
 * 	 : 객체를 생성하는데 있어서 정적 중첩 클래스와 다르게
 * 		외부 클래스의 인스턴스를 이루는 요소가 됩니다.
 * 	 -> 외부클래스의 객체가 생성되어야 내부클래스의 객체를 생성할 수 있음
 */
public class Exam03 {
	private static int outClassValue = 10;
	private int outInstanceValue = 20;
	
	// 내부클래스(Inner Class)
	class InnerClass {
		private int innerInstanceVlaue = 30;
		public void print() {
			// 내부클래스의 인스턴스 변수 - 출력
			System.out.println(innerInstanceVlaue);
			// 외부클래스의 인스턴스 변수 - 출력
			System.out.println(outInstanceValue);
			// 외부클래스의 클래스 변수 - 출력
			System.out.println(outClassValue);
		}
	}
}
