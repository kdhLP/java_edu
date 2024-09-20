package ch06.memory;

public class MathArrayUtil {
	
	/*
	 * 
	 * ���� ���(�޼ҵ�)�� �����ϴ� �迭�� ���� ��ƿ��Ƽ Ŭ������ ���弼��
	 * 
	 * 1. sum(int[] array) : �迭�� ��� ��Ҹ� ���Ͽ� �հ踦 ��ȯ
	 * 2. average(int[] array) : �迭�� ��� ����� ��հ��� ��ȯ
	 * 3. min(int[] array) : �迭�� �ּҰ��� ��ȯ
	 * 4. max(int[] array) : �迭�� �ִ밪�� ��ȯ
	 * 
	 * * ���ѻ���
	 * 1. MathArrayUtil Ŭ������ ��ü�� �������� �ʰ� ���(�޼ҵ�) ����� �� �ֵ��� �ۼ�
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
		System.out.println("�迭�� �հ� : " + sResult);
		
	}

	public static void average(int[] numbers) {
		
		double sResult = 0;
		for(int i = 0 ; i < numbers.length ; i++) {
			sResult += numbers[i]; 
		}
		double aResult = sResult/numbers.length;
		
		System.out.println("�迭�� ��� : " + aResult);
		
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
		System.out.println("�迭�� �ּڰ� : " + min);
		
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
		System.out.println("�迭�� �ִ� : " + max);
	}
	
	
	
}
