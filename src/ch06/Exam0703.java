package ch06;

// 클래스 내부의 메소드를 전부 포함
import static java.util.Arrays.*;

// static method(함수) 
public class Exam0703 {
	
	static int normalParam = 10;
	
	// 인스턴스 메소드 : 객체의 생성이 이루어져야지만 사용이 가능한 메소드
	public static void printData() {
		
	}
	
	// 클래스 메서드, 정적 메서드, static 메서드 : 객체의 생성 없이 사용가능 메소드
	// 		-> 객체생성이 필요없어 메소드의 호출만으로 필요한 기능을 수행할 때 주로 사용(유틸리티성 메서드)
	//		 : 배열을 정렬하기 위한 Arrays.sort();
	/*
	 * 정적(클래스/static) 메소드 사용법
	 * 	 1. static 메서드는 static 만 사용가능함
	 * 	 2. 반대로 어디서든지 호출가능
	 */
	public static void main(String[] args) {
		// Arrays -> 클래스
		// sort() -> 메소드
		java.util.Arrays.sort(args);
		// import 를 통해서 다른 패키지에 존재하는 static 함수를 사용
		// Arrays.sort(args);
		// import Arrays.* ... 클래스를 생략 가능
		sort(args);
		// 생성자 자체를 막음 : 객체생성을 막음
		// Arrays util = new Arrays();
		
		System.out.println(normalParam);
		
		printData();
		
	}

}
