package ch04;

// (자료)형(data-type) 변환
//	1. 자동 형변환 (묵시적/암시적 형변환)		: 컴퓨터가 알아서 형 변환을 해줌
//	2. 명시적 형 변환 					: 캐발자가 형 변환을 직접 해야함. 
public class Exam04 {

	public static void main(String[] args) {
		//실무에서는 변수의 형(타입)을 int(sometimes.long) / double / 참조형을 주로 사용
		
		// 변수의 선언과 초기화
		int intValue = 65;
		// 기본 자료형 중 7가지의 자료형끼리는 형 변환이 가능
		char charValue = 'A';	//65
		
		// 명시적 형변환
		//정수 > 문자(정수)
		char changeCharValue = (char) intValue;
		System.out.println( changeCharValue );
		// 실수 > 정수 : 소수점 자리 이하를 버림
		final double PIE = 3.14;
		int changeIntValue = (int) PIE;
		System.out.println( changeIntValue );
		// 같은 숫자형 타입, 크기가 다른 형으로 변환
		int intValue01 = 1000;
		byte changeByteValue = (byte) intValue01;
		System.out.println( changeByteValue );

		// 자동 형변환
		// 정수 > 실수 : .0과 같이 실수형으로 변환
		double changeDoubleValue = intValue;
		// double changeDoubleValue = (double) intValue;
		System.out.println( changeDoubleValue );
		/*
		 *  changeDoubleValue = intValue
		 *  changeDoubleValue = (double) intValue
		 *  changeDoubleValue = (double) 65;
		 *  changeDoubleValue = 65.0
		 *   
		 * */
		
		/*
		 * 세금 계산
		 * 	 180000 * (180000 * 0.0 ) = 180000
		 * 
		 * 	 300000 * ( 300000 * 3.3 ) = ......
		 * */
		
		int salaryPerDay = 300000;
		double taxRate = 3.3 * 0.01;
		if ( salaryPerDay <= 180000 ) {
			//자동 형변환 : 정수 > 실수
			taxRate = 0;
		}
		int salaryPerMonth = salaryPerDay * 22;
		int totalSalary = salaryPerMonth - (int)( (double)salaryPerMonth * taxRate );
		System.out.println( totalSalary );
		
	}

}
