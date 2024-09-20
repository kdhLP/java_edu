// 패키지 : 특정한 기준, 기능에 맞춰 분류하여 클래스를 모아둔 것.
package practice;

// 클래스 : 필드(변수), 메소드(함수)로 구성이 된 설계도
// 누구나 다 접근이 가능한 클래스
public class Test01 {
	
	// 필드(변수) 선언과 초기화
	// nullPointException(NullSafty)
	// 선언만 해서는 안되며, 초기화를 같이 해줘야 한다.
	int numb = 100;
	
	//매서드(함수)
	public void method() {
		// 필드(변수) 선언
		int num;
		//필드(변수) 초기화
		num = 10;
		System.out.println( "메서드를 실행 했습니다" + num);
		
		
	}
	
	// 접근이 제한된 클래스
	private class PrivateClass{
		
	}
	
	// main() 메서드 : 클래스가 실행되기 위한 첫번째 메서드(함수)
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
	}
	
}
