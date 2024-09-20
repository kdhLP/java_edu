package ch06.access.a;

import ch06.Book;

// 필드, 메소드의 접근제어자
// 클래스 접근제어자
/*
 * 클래스 레벨의 접근 제어자 : public, default만 사용할 수 있음
 * 		- protected, private은 사용할 수 있음
 * public 클래스는 반드시 파일명과 이름이 같아야함
 * 하나의 자바 파일에는 public 클래스는 하나만 존재
 * 하나의 자바 파일에 default 접근 제어자를 사용하는 클래스는 무한정 만들 수 있음
 * 		- '클래스의 크기는 일정해야한다.' 원칙 존재
 */
// default 접근제어자 : Temp ㅋ,ㄹ래스는 같은 패키지 안에서만 호출이 가능
class Temp {
	
}


public class AccessData {
	
	//public : all granted
	public int publicField;
	//protected
	protected int protectedField;
	//defualt : same package
	int defaultField;
	// private : all denied
	private int praviteField;
	
	public void publicMethod() {
		System.out.println("publicMethod 호출 " + this.publicField);
	}
	
	protected void protectedMethod() {
		System.out.println("protectedMethod 호출 " + this.protectedField);
	}
	
	void defaultMethod() {
		System.out.println("defaultMethod 호출 " + this.defaultField);
	}
	
	private void privateMethod() {
		System.out.println("privateMethod 호출 " + this.praviteField);
	}
	
	// 내부 접근(호출/사용)
	public void innerAcces() {
		System.out.println("*** 내부호출 ***");
		// 맴버 변수(필드)에 대한 접근 ( 초기화/값의 대입)
		this.publicField = 100;
		this.protectedField = 200;
		this.defaultField = 300;
		this.praviteField = 400;
		// 메소드에 대한 접근(호출/사용)
		this.publicMethod();
		this.protectedMethod();
		this.defaultMethod();
		this.privateMethod();
	}
	
}





