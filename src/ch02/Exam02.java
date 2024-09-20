package ch02;
// import java.util.*;
import java.util.Scanner;
// Scanner 라이브러리 (기본적으로 제공해주는 기능)
// 사용자의 입력을 받는 방법 : Scanner
// KeyCode - System.in.read();
// 그런데 자바가 제공하는 System.in 을 통해서 입력을 받기엔 과정 번거로움
// 사용자의 입력을 비교적 쉽게 받는 방법 : Scanner
public class Exam02 {
	public static void main(String[] args) {
		
		// 참조형 변수(클래스-Scanner)를 선언
		// 참조형 변수인 경우, 일반적으로 객체를 선언 > new 키워드 같이 사용
		Scanner s = new Scanner(System.in);
		
		// 문자열을 입력받음
		System.out.print( "문자열을 입력하세요 : " );
		// 입력받은 문자열을 str 이라는 변수에 저장
		String str = s.nextLine();
		// 입력받은 문자열을 출력
		System.out.println( str );
		
		System.out.print( "정수형태의 숫자를 입력하세요 " );
		// 스캐너를 통해서 데이터를 입력받을 때,
		// 입력받는 자료형을 일치시켜줘야합니다.
		int number01 = s.nextInt();
		System.out.println( number01 );
		
		
		System.out.print( "실수형태의 숫자를 입력하세요 : " );
		double number02 = s.nextDouble();
		System.out.println( number02 );
		
		//예상되는 입력값 : 20010629 / 2001-06-29 / 2001년 6월 29일
		System.out.println(  "본인의 생년월일을 입력하세요 (YYYYMMDD의 형태로 출력하세요 )" );
	}
}