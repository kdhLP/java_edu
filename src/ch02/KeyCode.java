<<<<<<< HEAD
package ch02;

import java.io.IOException;

// 키보드의 키를 눌렀을 때, 해당 키의 키코드를 확인하기 위한 소스코드
// 1. 입력 / 2. 출력
public class KeyCode {
	
	//eclipse : main > ctrl+space > main:main method
	//intellij : psvm > ctrl+space || main > ctrl+space

	// 시작함수를 포함
	public static void main(String[] args) {
		
		//system.in... 데이터를 입력받기 위해서는 예외처리(Exception / chapter10)가 되어야 함.
		//				1. method 뒤에 throws 키워드 함께 사용
		//				2. 예외처리가 되어야 하는 소스코드를 감싸는 try/catch 사용
		try {
			System.out.println( "start program.");
			// while 반복문
			//괄호 안에 반복되어질 조건식
			while ( true ) {
			// 키를 입력받음
			int keyCode = System.in.read();
			System.out.println( " input : " +keyCode);
			//if 조건문
			if (keyCode == 113) {
				break;
			}
			}
			System.out.println( "End program.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
=======
package ch02;

import java.io.IOException;

// 키보드의 키를 눌렀을 때, 해당 키의 키코드를 확인하기 위한 소스코드
// 1. 입력 / 2. 출력
public class KeyCode {
	
	//eclipse : main > ctrl+space > main:main method
	//intellij : psvm > ctrl+space || main > ctrl+space

	// 시작함수를 포함
	public static void main(String[] args) {
		
		//system.in... 데이터를 입력받기 위해서는 예외처리(Exception / chapter10)가 되어야 함.
		//				1. method 뒤에 throws 키워드 함께 사용
		//				2. 예외처리가 되어야 하는 소스코드를 감싸는 try/catch 사용
		try {
			System.out.println( "start program.");
			// while 반복문
			//괄호 안에 반복되어질 조건식
			while ( true ) {
			// 키를 입력받음
			int keyCode = System.in.read();
			System.out.println( " input : " +keyCode);
			//if 조건문
			if (keyCode == 113) {
				break;
			}
			}
			System.out.println( "End program.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
>>>>>>> 9f8ead6df6866ca68a6dc133d12ea51b2663b4b3
