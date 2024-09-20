<<<<<<< HEAD
package ch02;

public class Exam01 {
	
	public static void main(String[] args) {
		/*
		 * 변수 : 변경이 가능한 값을 가지는 데이터(이름을 가지는 주머니)
		 * */
		//cf. Oracle > PL/SQL > {변수명} {자료형}
		//변수의 선언
		int totalCount;
		//변수에 값을 대입(초기화)
		totalCount = 10;
		//... if.임의 과정을 거침
		//변수의 재선언
		totalCount = 100;
		//변수의 선언 및 대입(초기화)
		int totalCount02 = 20;
		//동일한 타입에 대하여 ,(쉼표)로 구분하여 연속해서 사용가능
		int total01 = 10, total02 = 20;
		//변수의 사용
		System.out.println( totalCount );
		System.out.println( totalCount02 );
		System.out.println( totalCount + totalCount02 );
		
		//상수 : 항상 같은 값을 가지는 데이터 (이름을 가진 주머니*)
		// 일반적으로 상수는 전체 대문자로 표기
		final double PIE = 3.14;
		final String companyName = "NAVER";
		// ... if. line 수가 1000개가 넘어가는 소스코드 작성
		//companyName = "DAUM";
		//'ctrl+h'를 통해 '탐색'가능
		
		// (자료)형 data-type
		// 1. 정수형-
		int number01 = 10;
		//정수를 나타낼 수 있는 크기대로 정렬
		byte number011 = 127;
		short number012 = 32767;
		int number013 = 2147483647;
		long number014 = 9223372036854775807L;
		// 2. 실수형(소숫점이 나타나는 숫자형)
		float number03 = 3.14f;
		double number04 = 3.14;
		//Wrapper Class
		/*
		 * ex) int -> Integer
		 * */
		//문자(정수)		- ' '(작은 따옴표) - char
		//cf.문자열	- " "(큰 따옴표)
		char str01 = 'a';
		//str01 = "A";
		String str02 = "String";
		
		// 참조형(chapter05) - 배열, 클래스 등 객체
		// 메모리에 구현된 객체가 가지는 (메모리)주소를 참조(참고)한다.
	}

}
=======
package ch02;

public class Exam01 {
	
	public static void main(String[] args) {
		/*
		 * 변수 : 변경이 가능한 값을 가지는 데이터(이름을 가지는 주머니)
		 * */
		//cf. Oracle > PL/SQL > {변수명} {자료형}
		//변수의 선언
		int totalCount;
		//변수에 값을 대입(초기화)
		totalCount = 10;
		//... if.임의 과정을 거침
		//변수의 재선언
		totalCount = 100;
		//변수의 선언 및 대입(초기화)
		int totalCount02 = 20;
		//동일한 타입에 대하여 ,(쉼표)로 구분하여 연속해서 사용가능
		int total01 = 10, total02 = 20;
		//변수의 사용
		System.out.println( totalCount );
		System.out.println( totalCount02 );
		System.out.println( totalCount + totalCount02 );
		
		//상수 : 항상 같은 값을 가지는 데이터 (이름을 가진 주머니*)
		// 일반적으로 상수는 전체 대문자로 표기
		final double PIE = 3.14;
		final String companyName = "NAVER";
		// ... if. line 수가 1000개가 넘어가는 소스코드 작성
		//companyName = "DAUM";
		//'ctrl+h'를 통해 '탐색'가능
		
		// (자료)형 data-type
		// 1. 정수형-
		int number01 = 10;
		//정수를 나타낼 수 있는 크기대로 정렬
		byte number011 = 127;
		short number012 = 32767;
		int number013 = 2147483647;
		long number014 = 9223372036854775807L;
		// 2. 실수형(소숫점이 나타나는 숫자형)
		float number03 = 3.14f;
		double number04 = 3.14;
		//Wrapper Class
		/*
		 * ex) int -> Integer
		 * */
		//문자(정수)		- ' '(작은 따옴표) - char
		//cf.문자열	- " "(큰 따옴표)
		char str01 = 'a';
		//str01 = "A";
		String str02 = "String";
		
		// 참조형(chapter05) - 배열, 클래스 등 객체
		// 메모리에 구현된 객체가 가지는 (메모리)주소를 참조(참고)한다.
	}

}
>>>>>>> 9f8ead6df6866ca68a6dc133d12ea51b2663b4b3
