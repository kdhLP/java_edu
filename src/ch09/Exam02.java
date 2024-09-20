package ch09;

public class Exam02 {
	
	// 정적 클래스 변수
	private static int outerClassValue = 10;
	// 인스턴스 변수
	private int outerInstanceValue = 20;
	
	// 정적 중첩 클래스
	static class Nested {
		// 정적 중첩 클래스의 인스턴스 변수
		private int nestedInstanceValue = 30;
		
		public void print() {
			// 본인 클래스의 변수에 접근
			System.out.println(nestedInstanceValue);
			
			// 외부 클래스의 인스턴스 변수에 접근]
			//System.out.println(outerInstanceValue);
			Exam02 ex = new Exam02();
			System.out.println(ex.outerInstanceValue);
			
			// 외부 클래스의 클래스 변수에 접근
			System.out.println(outerClassValue);
			System.out.println(Exam02.outerClassValue);
		}
	}
	
}
