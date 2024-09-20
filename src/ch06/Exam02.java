package ch06;

// 기본형 vs 참조형
public class Exam02 {
	
	// 클래스 변수(멤버변수) - 지역변수(클래스) & 광역변수 (클래스 내 어떤 메소드에서 사용가능함)
	int x = 100;
	
	// 기본형
	// int, (long), double, char, boolean
	// char : encoding ( utf-8 / euc-kr / cp(ms)949 ... )
	// 전자(전기)를 통해서 통신을 하게 됨.
	// 영어권 나라 -> 모스부호 ( --- ... --- )
	// 전자(전기) -> 0(전류가 흐르지 않는다) / 1 (전류가 흐른다.)
	// ㅁ -> 0 혹은 1 : bit
	//		-> 1bit : 두가지 값을 가질 수 있다.
	//		-> 영문자, 특수기호, 띄어쓰기, 오류를 검출하기 위한 코드, 음수, 양수
	//				: 크기가 8bit -> 2^8가지(256)를 나타낼 수 있다.
	//		-> 8bit -> 1Byte : latin1, ISO-****
	// char
	// A -> 65 -> 01000001
	// 한글 -> 65565가지 : 2^16가지 : 2Byte (벩) : euc - kr / cp949 / ms949
	// 중국어 -> 3Byte
	// 유니코드(국제표준) : UTF-8 ( 3Byte )
	// 이모지 utf8mb4 ( 4Byte )
	
	// int - 4Byte
	// long - 8Byte
	// long num01 = 20억L;
	
	// 참조형 (****)
	// 기본적인 참조형 : String, Array, ...
	// 사용자 커스텀 참조형 : Practice02.car, Practice01.Student, ...
	//		--> 개발자가 만드는 클래스
	// Bean(s) : 여러가지 데이터를 가지고 있는 클래스(들)
	
	public static void main(String[] args) {
		
		// 차이 1. 기본형은 값을 변수에 담을 수 있으나, 참조형은 값을 클래스에 담을 수 없다.
		// 기본형의 변수는 무조건 클래스 안에 담겨져야 함.
		// 메소드 안에 선언 된 지역변수
		int a = 10;
		int b = 100;
		// 직접연산이 가능
		System.out.println( a + b );
		// Wrapper Class
		Integer num00 = 1000;
		String str = "";
		
		// Student
		Student s1 = new Student();
		s1.age = 17;
		Student s2 = new Student();
		s2.age = 22;
		// int s2Age = s2.getAge();
		// System.out.println( s1 + s2 );
		System.out.println( s1.age + s2.age);
		
	}

}
