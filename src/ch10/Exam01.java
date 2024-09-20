package ch10;

import java.io.FileNotFoundException;
import java.net.SocketException;
import java.util.Scanner;

// 예외(Exception) 처리
//			: 오류보다는 낮은 단계의 잘못된 상태
//			ex : 파일이 있어야 진행되는 프로그램 > 파일이 없는 경우 
// cf. 오류(Error) : 문법상 맞지 않거나,
// 				컴퓨터가 더 이상 처리할 수 없는 상태에 있어서 나타나는 현상
//		ex) OutofMemory : 컴퓨터 메모리에 더 이상 프로그램을 적재할 수 없는 경우

/*
 * 결론 
 * 	 : 예외처리 개념이 처음 나왔을 때는 유용한 기능
 * 	 > 번거로운 작업(복잡한 프로그래밍이 되는 경우)
 * 	 > 실무에서는 최소한의 예외처리를 작업
 * 	 > Spring Framework ... 등 프레임 워크를 사용하게 되면
 * 		생략 등의 컴퓨터가 알아서 해주는 영역 중 하나
 * 		(개발자의 노력을 많이 하지 않는 기능)	
 */
public class Exam01 {
	/*
	 * * Throwable : 최상위 예외 객체 / Exception, Error 포함
	 * * Exception 
	 * 	 - 체크 예외	: 개발자가 명시적으로 처리해야 하는 예외 (컴파일러에 체크)
	 * 		:: 장점 - 개발자가 실수로 예외를 누락하지 않도록 컴파일러를 통해 문제를 잡아줌 ( 훌륭한 안전장치 )
	 * 		:: 단점 - 복잡하고 번거로운 작업이 될 가능성이 높아짐
	 * 	 - 언체크 예외	: RumtimeException, 실행되어야지만 확인할 수 있는 예외
	 * 				: 컴파일러에 체크되지 않는 내용
	 * 				: throws 키워드를 통해서 표현 > 생략가능
	 * 		:: 장점 - 신경쓰고 싶지 않는 예외는 무시 가능
	 * 		   단점 - 실수로 예외처리를 누락할 가능성이 높아짐
	 * *** Exception(예외) > 최상위 객체 : Object > 상속 - 가능
	 * 		::
	 * 
	 * 
	 * 예외처리 Keyword : try, catch, finally, throw, throws
	 * 
	 * - 방법 (폭탄제거)
	 * 	 1. 본인 클래스에서 처리 (try-catch-finally)
	 * 	 2. 다른 클래스에서 처리 (throw, throws)
	 * 
	 */
	
	public static void main(String[] args) {
		try {
			// 예외가 발생될 가능성이 있는 소스코드가 작성되는 영역
			
			// A
			// B 
			// C - Exception()
			// D : 실행되지 않고, catch()로 넘어감
			//	 : C에서 예외처리와 상관없이 무조건 실행
			
			int a = 10;
			int b = 0;
			System.out.println( a + b );
			System.out.println( a - b );
			System.out.println( a * b );
			System.out.println( a / b );
			System.out.println( a % b );
			
			System.out.println( "사칙연산의 결과를 확인합니다." );
			
		}catch (ArithmeticException ae) {
			
			System.out.println(" 개별 catch 사용 : / by zero");
			
		}catch (Exception e) {
			// catch : () 안에 선언된 예외를 처리
			// 예외가 발생하면 실행되는 영역
			
			// C > Exception()
			// 	 > 수정, 관련된 로그를 남기는 등의 과정을 실행
			//	 > 프로그램이 종료되지 않도록 정상적인 상태로 되돌림
			
			// 오류 내용을 확인하는 방법
			System.out.println("getMessage() : " + e.getMessage());	// 에러의 원인을 간단하게 출력
			System.out.println("toString() : " + e.toString());	// 에러의 내용과 원인을 출력
			e.printStackTrace();				// 예외가 발생된 소스코드를 추적하여 단계별로 출력
			
			// ... 오류를 수정하는 코드
			// ... 수정할 수 없는 내용 > 로그 > 프로그램의 업데이트
			//		> 사용자 : 안내문구 (클레임 방지용)
			
			// out, err : 기능상으로는 차이가 없음(빨간색), 과정상 차이 존재 : 다른 버퍼를 사용
			// err.println() > 출력 위치가 자유롭게 출력
			System.out.println("예외가 발생되었습니다.");
			
		} finally {
			// finally : 예외 상황과 관계없이 실행될 내용
			
			// 예외처리 > 진행될 내용
			System.out.println("예외가 발생된 이후 코드 중 반드시 실행되어야 하는 후처리입니다.");
		}
		
		//System.out.println(a);
		
		// E : 실행
		// F : 실행
		// G : 실행
		System.out.println("예외 발생과 상관없이 진행되는 소스코드들입니다.");
		
	}
	
	public void exceptionMethod() throws Exception{
		// 영역안에서 발생된 예외를 직접 처리하지 않을려면 throws
		// throws 던지는 주체 : exceptionMethod()
		// throws 받는 주체 : exceptionMethod()를 실행한 객체
	}
	
}
