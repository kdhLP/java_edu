package ch06;

public class Exam03 {
	
	static boolean flag = true;
	

	// main() method(function) : 메인 메소드(함수)
	// 해당 클래스가 실행될 때, 처음 동작하는 메소드(함수)
	// 고등학교 수학 : f(x) = x^2 + 2x +1 = (x+1)^2
	// method를 이용하는 이유
	//  1. 중복 소스의 최소화를 위해 사용
	//  2. 소스코드 작성의 간편화
	public static void main(String[] args) {
		
		if (flag) {
			
		}
		
		/*
		 * 형태를 보고 기본적인 구분
		 *  - 대문자로 시작하는 문자열 : 클래스
		 *  - 소문자로 시작하고 문자뒤에 () 존재 : 메소드
		 *  - 소문자로 시작하고 문자뒤에 아무것도 없음 : 변수(필드)
		 *  * 예외
		 *    1. 상수 : 전부 대문자로 작성 / 단어와 단어 사이를 _(언더바)로 이어줌
		 *    2. 패키지 : 전부 소문자로 작성 / 단어와 단어 사이를 이어서 씀
		 */
		String camelcase = "";
		
		// 메소드 호출 (반환값이 없는 메소드)
		int a = 10;
		/*
		int a = 10;
		int b = 20;
		// a와 b의 합계
		System.out.println( a + b );
		*/
		
		// 메소드 호출 (반환값이 없는 메소드)
		add(a, 20);
		/*
		int c = 30;
		int d = 40;
		// c와 d의 합계
		System.out.println( c + d );
		*/
		// 메소드 호출 (반환값이 없는 메소드)
		add(30, a);
		// 메소드 호출 (반환값이 없는 메소드)
		minus(100, 1);
		// 메소드 호출 (반환값이 존재하는 메소드)
		int result = multi(3, 9);
		System.out.println( result );
	}
	
	//덧셈을 위한 Method
	// 위 메인에서 선언한 int a와 method의 파라미터로 선언된 int a는 다른 변수 (스코프 / 범위)
	public static void add(int a, int b) {
		// method를 실행했음을 확인하기 위한 출력 문자열
		System.out.println("더하기 기능을 하는 Method를 실행하였습니다.");
		//파라미터 a와 b를 더한 결과를 sum 변수에 저장
		int sum = a + b;
		//메소드의 내용을 실행한 결과를 반환(return)
		System.out.println( sum );
		
	}
	
	// 클래스는 0개 이상의 필드(변수)와 0개 이상의 메소드로 이루어져 있다.
	// 접근 제어자 : public / protected / private
	// static : 객체를 실행하지 않고 호출이 가능한 정적 메소드
	// 반환값 : 데이터 타입(자료형) - 기본형 8가지 / 참조형
	// 데이터 타입이 정해진 경우, 해당 타입으로 데이터가 반드시 반환된다.
	// void : 반환되는 데이터가 없다는 의미
	public static void minus(int x, int y) {
		System.out.println("miuns 메소두의 실행 확인을 위한 문자열");
		System.out.println( x - y );
	}
	
	public static int multi(int i, int j) {
		int result = i*j;
				return result;
	}
	
	public void exampleMethod(String prm) {
		// 반환값이 존재하든 안하든 return 명령문은 사용이 가능
		// return 문을 만나면 해당 메소드는 종료됩니다.
		// cf. 반복문에서 break;
		return;
		
	}
	
	/*
	 * 용어정리
	 * 
	 * 호출 : multi(3, 9)
	 * 			- 인자, 인수, 아규먼트(Argument)
	 * 메소드 정의 : 
	 * {접근 제어자} {반환값} {메소드 이름} ({매개변수, 파라미터}) {
	 * 		// ...
	 * }
	 * 
	 * * 접근 제어자(Modifier) : 외부에서 내부에서 접근하는 권한을 나타내는 키워드
	 * * 반환값(타입/Return Type)
	 * * 파라미터(Parameter)
	 * 
	 */
	
	// 메소드 오버로딩(method Overloading)
	// Overloading : 과적 / 이름이 같고 매개변수가 다른 매서드를 여러개 정의
	// 사용조건 : 1. 이름이 같을것. 	2. 매개변수가 다를것 (매개변수의 타입, 개수가 다르면 됨)
	// *메소드 시그니처(method signature) = 이름 + 매개변수 타입(개수, 순서)
	// - 자바에서 매서드를 구분할 수 있는 고유한 식별자
	
	// 개수가 다른 매서드
	// 숫자 3개를 더하는 함수
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	// 매개변수의 타입이 다른 매서드
	//문자열을 더하는 함수
	public String add(String x, String y) {
		return x+y;
	}
	// 매개변수의 순서가 다른 매서드1
	// 서로 다른 형태의 숫자를 더하는 함수
	public int add(double i, int j) {
		return (int)i +j;
	}
	// 매개변수의 순서가 다른 매서드2
	// 서로 다른 형태의 숫자를 더하는 함수
	public int add(int i, double j) {
		return i +(int)j;
	}
	

}
