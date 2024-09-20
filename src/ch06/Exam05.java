package ch06;




// 패키지 : 특정한 기중(기능, 역할 등)에 따라 클래스를 분류해놓은 집합체
/*
 * 규칙
 * 	- 필수적인 내용 : 디렉토리와 같이 사용 (계층적 구조를 가짐)
 * 	- 소문자로 작성(관례/불문율 : 기본값)
 * 	- (관례) kr.ac.btc 와 같이 도메인의 역순으로 패키지를 구성
 * 		ex) kr.ac.btc > package 명예 도메인을 생략 (개발 업체가 만든 기본 소스)
 * 			- board
 * 			- product
 * 			- ch01
 * 			- ch05 ...
 * 		   kr.co.btc2 도메인의 역순으로 구분해서 (유지보수업체 : 기존의 소스를 업그레이드한 소스를 별도 패키지)
 * 			- board
 * 			- product
 * 		   kr.co.naver.mobile
 * 			- board
 * 			- webtoon
 * 	* 각각 만들어진 패키지는 다른 패키지로 인식
 * 
 * 	** 작성중인 클래스에서 다른 클래스를 사용하기 위해서 new 키워드를 객체로 생성
 * 		1. import
 * 		2. 사용한 소스코드(클래스) 앞에 해당 경로(패키지)를 붙여주는 방법
 * 		 * 같은 패키지에 속해있다면 import, 경로 생략
 * 
 * 	* 특정 패키지의 모든 클래스를 포함(import)
 * 	import java.util.*
 * 		- 하위 패키지는 별도
 * 		cf. import java.util.lang.*;
 */

import java.util.Scanner;
import java.util.Arrays;

import ch06.sub.Employees;
import java.lang.annotation.Annotation;

public class Exam05 {

	public static void main(String[] args) {
		
		// import 키워드를 사용하여 클래스 밖에 자동 완성
		// Scanner 클래스의 객체를 생성(new)
		// 다른 패키지에 속한 클래스를 사용하기 위해서는 해당 클래스의 경로(패키지)를 적어야 함
		Scanner scan = new java.util.Scanner(System.in);
		// 추상 클래스
		Annotation annotation = new Annotation() {
			
			@Override
			public Class<? extends Annotation> annotationType() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		java.text.Annotation annotationClass = new java.text.Annotation(annotation);
		
		// 같은 패키지 안에 있는 객체를 생성(new) - import 생략
		// 현재 패키지의 하위 패키지에 있는 클래스를 호출하더라도 경로를 지정해 줘야 함
		Employees employee = new Employees();
		// 다른 패키지의 같은 클래스를 호출(사용)해야하는 경우,
		// 둘 중에 하나는 직접 .(연결연산자)를 통해서 앞에 명시해줘야 함.
		ch06.Employees employeeUpper = new ch06.Employees();
		
	}

}
