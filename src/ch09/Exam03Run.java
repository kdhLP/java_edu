package ch09;

import ch09.Exam03.InnerClass;

public class Exam03Run {

	public static void main(String[] args) {
		
		// 외부클래스의 객체를 생성
		Exam03 ex = new Exam03();
		/*
		// 클래스 타입을 표시 - 변수를 선언
		// 내부 클래스는 외부클래스의 인스턴스에 소속
		// -> 외부클래스의 인스턴스(객체가 생성)가 만들어지지 않으면
		// -> 내부클래스의 인스턴스도 만들 수 없음
		 * 
		 * 내부 클래스의 객체생성(인스턴스화)을 하기 위해서 외부클래스의 인스턴스(객체) 정보가 필요합니다.
		 * 
		 * 
		 * 실제로는 Heap 메모리에 가각ㄱ 주소를 할당박아서 객체가 생성됩니다.
		 * 내부클래스의 인스턴스는 외부클래스의 인스턴스를 참조
		*/
		// Exam03 외부클래스의 내부클래스를 객체생성 ( 외부클래스의 인스턴스 정보 누락)
		//Exam03.InnerClass inner = new Exam03.InnerClass();
		InnerClass inner = ex.new InnerClass();
		
		inner.print();
		
	}

}
