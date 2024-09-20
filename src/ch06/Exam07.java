package ch06;

import java.util.Scanner;

// 자바 메모리 (Stack / Heap / Static)
public class Exam07 {
	
	// stack
	/*
	 * 자바는 스택 영역을 사용해서 메서드 호출과 지역변수(매개변수 포함)를 관리
	 * method를 계속 호출하면 스택 프레임(frame)이 계속 쌓인다.
	 * 스택 프레임이 종료되면 지역변수도 함꼐 제거
	 * 스택 프레임이 모두 제거 -> 프로그램 종료
	 */
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int param = scan.nextInt();
		
		// --- 메소드를 호출하는 시점에서 main은 대기
		// ** 절차(지향)적 언어 : 객체지향적 언어와 반대되는 개념이 아님.
		//					- 객체 지향 언어는 절차 지향 언어의 개념을 포함하는 상위 개념에 가까움
		//					- 절차 지향 언어에도 함수(function) 개념이 존재
		method01(param);
		
		
		System.out.println("main end");
	}

	public static void method01(int num01) {
		System.out.println("method01 start");
		
		int result = num01 * 10;
		method02(result);
		
		System.out.println("method end");
	}
	
	public static void method02(int num02) {
		System.out.println("method02 start");
		
		int[] array = new int[3];
		for (int i = 3 ; i < 10 ; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("method02 end");
	}
	
}
