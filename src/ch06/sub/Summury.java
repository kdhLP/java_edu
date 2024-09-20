package ch06.sub;

/*
 * 클래스(Class) 		:  낙타 표기법(camel Case)을 따라 이름이 작성 && 첫 문자는 대문자
 * 		- 변수(필드/맴버변수/클래스변수/지역변수) - private 접근제어자 : 필요에 따라 다른 접근제어자
 * 		- 메소드(함수)					- public 접근제어자 : 필요에 따라 다른 접근 제어자
 * 
 */

// Class : class {클래스 이름} { // ... }
/*
 * .java 파일 안에 파일명과 같은 public class 1개만 존재
 * 	 ex) Summury.java -> public class Summury
 * .java 파일 안에는 default class는 여러개 존재 가능
 * 	  => 하나의 .java 파일 안에서 class 앞에 붙을 수 있는 접근제어자 : public / default
 */
// default class : 접근제어자가 붙지 않는 클래스
//		-> 같은 패키지 안에서 호출(사용) 가능
class Temp{
	// ...
	
}

// public class
// 		-> 모든 외부의 호출(사용) 가능
public class Summury {
	// 필드(맴버변수 - 클래스 변수/인스턴스 변수)
	/* {접근제어자} {변수의 자료형} {변수의 이름};
	 * 
	 * ** 접근제어자(필드/메소드)
	 * 		-> *****캡슐화(Encapsulation) 개념
	 * 			: 객체안의 내부 데이터에 외부에서 함부로 제어할 수 없도록 통제(보안장치)
	 * 			: 외부에서는 과정을 확인할 필요가 없도록 도와주는 개념
	 * 	1. public		: 내부/외부든 모든 호출을 허용
	 * 	2. protected	: 같은 패키지 안의 모든 호출을 허용
	 * 					+ (특수한 경우) 다른 패키지의 상속을 통한 클래스의 호출 허용 
	 * 	3. default		: 같은 패키지 안의 모든 호출만 허용
	 * 	4. private		: 내부의 호출만 허용 / 모든 외부의 호출 거절
	 */
	
	// method(function : 함수) : 낙타표기법 / 첫 문자가 소문자
	/*
	 * f(x) = x^2 + 2x + 1 = (x+1)(x+1)
	 * 
	 * {접근제어자} {기타옵션:static, final} {반환타입} {메소드 이름} ( {파라미터} ) { // ... }
	 * * 반환타입 : int, double, boolean 등의 기본형
	 * 			+ String, Integer 등 Wrapper Class, 기본 유틸리티 Class,
	 * 			  개발자가 만든 Class, 배열, Generic, Collection 등의 참조형
	 * ** 반환타입이 없는 경우 : void (단순히 어떠한 과정을 처리하기 위한 메소드)
	 * ** 파라미터 : 메소드가 처리하게 될 내부/외부에서 입력된 값(데이터) : 지역변수
	 */
	  
	 // 조금 특별한 메소드 : 생성자(Constructor)
	/* 			- 객체를 생성할 때, 일련의 과정을 자동실행하기 위해서 사용
	 * 			 ( 맴버변수에 값을 초기화-초기값을 대입 / DB-데이터를 미리 가져와야 하는 과정 / ... )
	 * * 메소드의 형태를 띄고 있음
	 * 	{접근제어자} {생성자이름} () { // ... }
	 * * 특징
	 * 	 1. 생성자의 이름은 클래스의 이름과 같음 -> 메소드임에도 불구하고 첫 글자가 대문자(낙타표기법)
	 * 	 2. 메소드와 의 차이점 : 반환 타입이 없음
	 * 	 3. 클래스가 객체화(인스턴스화/실체화)될 때, 1번만 실행
	 * 			Test05 test = new Test05();
	 */
	// 기본 생성자(default Constructor)
	// 자바는 생성자가 1개라도 선언되어 있지 않으면, 기본생성자를 자동 생성합니다.(.class)
	// 생성자 역시, 특별한 메소드 -> Overloading 개념을 사용가능
	public Summury() {
		// 파라미터의 타입이 다른 경우
	}
	public Summury(int num01, int num02) {
		
	}
	public Summury(int num01, double num02) {
		
	}
	public Summury(double num01, int num02) {
	
	}

	
	public static void main(String[] args) {
		// args :: main() 메소드를 벗어나서 사용할 수 없는 지역변수(scope)
		// 지역변수는 접근제어자를 사용하지 않음
		// GC(Garbage Collection / 쓰레기 수집가)
		//	: 더 이상 소스안에 참조하지 않는 (사용하지 않는) 변수/메소드 등 객체를 제어 (삭제함) - 메모리
		int number = 0;
		
		
	}
	
	/* 
	 * 메소드 오버로딩(Method Overloading)
	 * 	 1. 같은 이름의 메소드
	 * 	 2. 파라미터(인자/인수: 기준-타입/자료형)로 메소드를 구분할 수 있게끔 하는 기능
	 */
	// 기본 메소드
	public void printSomething() {
		// ...
	}
	// Overloading Method  1. 파라미터가 있고 없고 (타입이 다른 경우)
	public void printSomething( int number) {
		// ...
	}
	// Overloading Method  2. 파라미터의 갯수가 다른 경우
	public void printSomething( int num01, int num02) {
		// ...
	}
	// Overloading Method  2. 파라미터의 순서가 다른 경우
		public void printSomething( int num01, double num02) {
			// ...
		}
		public void printSomething( double num01, int num02) {
			// ...
		}
		
		// getter, setter Method
		// 접근제어자라는 개념에서 시작한 캡슐화 개념을 사용하면서
		// 외부에서 직접 멤버변수(데이터)에 접근하지 못하니까
		// Method를 통해서 데이터를 제어(수정, 조외)할 수 있도록 만들어진 메소드
		// getter Method
		// 일반적인 메소드의 형태에 이름을 get{멤버변수이름}() { // ...}
		// setter Method
		// 일반적인 메소드의 형태에 이름을 set{멤버변수이름}() { // ...}
}
