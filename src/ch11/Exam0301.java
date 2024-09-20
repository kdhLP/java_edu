package ch11;

import java.util.Arrays;

// Wrapper Class 사용법
public class Exam0301 {
	
	public static void main(String[] args) {
		
		// deprecated : 메소드(생성자), 함수, ... : 없어졌거나 없어질 예정
		Integer newInteger = new Integer(10);
		// 숫자의 값을 가지는 다양한 타입을 정수 타입으로 변환
		// valueOf()를 이용하여 Integer 타입을 선언
		// Boxing : 기본 > 참조
		Integer integerObj = Integer.valueOf(10);
		Double doubleObj = Double.valueOf(3.14);
		Long longObj = Long.valueOf(5000000000L);
		
		// 값을 객체로 감싼 결과
		System.out.println(newInteger);
		System.out.println(integerObj);
		System.out.println(doubleObj);
		System.out.println(longObj);
		// equals()
		System.out.println(newInteger == integerObj);
		System.out.println(newInteger.equals(integerObj));
		
		// 언박싱 (Unboxing) - {해당 타입 이름} + Value();
		//	 : 래퍼 클래스에 들어있는 기본형 값을 다시 꺼내는 메소드
		//	 : 참조 > 기본
		int ubInt = integerObj.intValue();
		double ubDouble = doubleObj.doubleValue();
		long ubLong = longObj.longValue();
		
		// 주요 메소드
		// parse + {변환하고자 하는 타입}() : 기본형 변환]
		/*
		String value000 = integerObj.toString();
		int value001 = Integer.parseInt(null);
		double value002 = Double.parseDouble(null);
		long value003 = Long.parseLong(null);
		// 래퍼 타입으로 반환 : valueOf()
		String value01 = String.valueOf(false);
		Integer value02 = Integer.valueOf(ubInt);
		Double value03 = Double.valueOf(ubDouble);
		Long value04 = Long.valueOf(ubLong);
		*/
		
		// 기타 메소드
		int sum = Integer.sum(10, 20);
		System.out.println("합계 : " + sum);
		int min = Integer.min(10, 20);
		System.out.println("최소값 : " + min);
		int max = Integer.max(10, 20);
		System.out.println("최대값 : " + max);
		
		// Integer : int 타입이 표시할 수 있는 최소값 / 최대값
		System.out.println("Int의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("Int의 최소값 : " + Integer.MIN_VALUE);
		// Double : Double 타입이 표시할 수 있는 최소값 / 최대값
		System.out.println("Double의 최대값 : " + Double.MAX_VALUE);
		System.out.println("Double의 최소값 : " + Double.MIN_VALUE);
		
		System.out.println(Integer.parseUnsignedInt("150"));
		
		// Math
		// 절대값
		Math.abs(max);
		// 0 ~ 1 사이의 난수 생성
		int random = (int)(Math.random()*44)+1;
		System.out.println("난수 : " + random);
		
		int[] lotto = new int[6];
		
		
		for (int i = 0; i < lotto.length ; i++) {
			lotto[i] = (int)(Math.random()*44)+1;
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		
	}

}
