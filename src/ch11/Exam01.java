package ch11;

import java.util.Scanner;

import ch09.Exam05;

/*
 * 자바가 기본으로 제공하는 라이브러리(클래스 모음) 중에 가장 기본이 되는 라이브러리
 * 	- java.lang 패키지
 *  - 모든 자바 애플리케이션(서비스/프로젝트)에 자동으로 import
 *  	-> 따로 import를 통해서 패키지를 선언하지 않아도 됨
 * 
 * 1. Object
 * 2. String / Integer / Long / Double / ...
 * 	 - Wrapper Class : 기본형 데이터 타입을 객체로 만든것
 * 3. Class : 클래스 메타 데이터 - 어노테이션 : @Override - 컴퓨터가 알아듣는 주석
 * 		ex) getClass()
 * 4. System.out.println(출력/OUT) / System.in(입력/IN) -> 입출력(IO)
 * 
 */
// Object 클래스 - 자바에서 사용하는 모든 객체의 최상위(root) (부모)클래스 *****
//		-> interface : 추상 클래스 / 독립적인 클래스 (Object를 상속받지 않습니다)
// extends 키워드를 사용하지 않음 : 묵시적 상속
// 명시적 상속 : extends Object (생략) : 다중 상속을 지원하지 않음
//	-> extends Exam05 : Object를 상속받지 않음

// Object
/*
 * 1. 공통적인 기능 제공 - 객체간 비교, 값 비교, 어떤 클래스의 이름, 속성 확인 기능, ...
 * 2. 다형성의 기본 구현
 * 	-> 어떠한 클래스를 선언, 생성, 사용하더라도 Object 클래스가 설정해놓은 범위 안에서 제어 목적 
 * 
 * Object 클래스가 제공하는 기본적인 기능들은 방대 -> 필수적인 일부 기능들만 학습 
 * 	 / 나머지는 개인 공부 추천
 * 
 * ** Object의 한계
 * 1. 다형성 -> 다운캐스팅 : 실질적으로 사용하는 곳에서는 다운 캐스팅을 실행(위험성) 
 * 		   -> 실무에서는 Object 클래스를 거의 사용하지 않음
 * 
 */

class Parent {
	
	Object[] arr = new Object[] {
		(Object)"문자열", (Object)new Integer(10).intValue(), (Object)100, new Exam01()
	};
	
}
class Child extends Parent {
	
}

public class Exam01 {
	public static void main(String[] args) {
		
		// 다른 패키지의 다른 이름의 클래스의 객체를 생성
		Exam05 ex = new Exam05();
		
		Object tempClass = new Object();
		System.out.println(tempClass.getClass().isArray());
		Scanner scan = new Scanner(System.in);
	}
	
}
