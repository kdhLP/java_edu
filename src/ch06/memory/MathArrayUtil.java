package ch06.memory;

public class MathArrayUtil {
	
	/*
	 * 
	 * 다음 기능(메소드)을 제공하는 배열용 수학 유틸리티 클래스를 만드세요
	 * 
	 * 1. sum(int[] array) : 배열의 모든 요소를 더하여 합계를 반환
	 * 2. average(int[] array) : 배열의 모든 요소의 평균값을 반환
	 * 3. min(int[] array) : 배열의 최소값을 반환
	 * 4. max(int[] array) : 배열의 최대값을 반환
	 * 
	 * * 제한사항
	 * 1. MathArrayUtil 클래스의 객체를 생성하지 않고 기능(메소드) 사용할 수 있도록 작성
	 * 
	 */
	
	private int sum;
	private int average;
	private int min;
	private int max;
	
	
	public static void sum(int[] numbers) {
		int sResult = 0;
		for(int i = 0 ; i < numbers.length ; i++) {
			sResult += numbers[i]; 
		}
		System.out.println("배열의 합계 : " + sResult);
		
	}

	public static void average(int[] numbers) {
		
		double sResult = 0;
		for(int i = 0 ; i < numbers.length ; i++) {
			sResult += numbers[i]; 
		}
		double aResult = sResult/numbers.length;
		
		System.out.println("배열의 평균 : " + aResult);
		
	}

	public static void min(int[] numbers) {
		int min = 0;
		for(int i = 0 ; i < numbers.length ; i++) {
			if(i == 0 ) {
				min = numbers[i];
			}
			else if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("배열의 최솟값 : " + min);
		
	}

	public static void max(int[] numbers) {
		int max = 0;
		for(int i = 0 ; i < numbers.length ; i++) {
			if(i == 0 ) {
				max = numbers[i];
			}
			else if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("배열의 최댓값 : " + max);
	}
	
	
	
}
