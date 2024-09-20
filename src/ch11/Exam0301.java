package ch11;

import java.util.Arrays;

// Wrapper Class ����
public class Exam0301 {
	
	public static void main(String[] args) {
		
		// deprecated : �޼ҵ�(������), �Լ�, ... : �������ų� ������ ����
		Integer newInteger = new Integer(10);
		// ������ ���� ������ �پ��� Ÿ���� ���� Ÿ������ ��ȯ
		// valueOf()�� �̿��Ͽ� Integer Ÿ���� ����
		// Boxing : �⺻ > ����
		Integer integerObj = Integer.valueOf(10);
		Double doubleObj = Double.valueOf(3.14);
		Long longObj = Long.valueOf(5000000000L);
		
		// ���� ��ü�� ���� ���
		System.out.println(newInteger);
		System.out.println(integerObj);
		System.out.println(doubleObj);
		System.out.println(longObj);
		// equals()
		System.out.println(newInteger == integerObj);
		System.out.println(newInteger.equals(integerObj));
		
		// ��ڽ� (Unboxing) - {�ش� Ÿ�� �̸�} + Value();
		//	 : ���� Ŭ������ ����ִ� �⺻�� ���� �ٽ� ������ �޼ҵ�
		//	 : ���� > �⺻
		int ubInt = integerObj.intValue();
		double ubDouble = doubleObj.doubleValue();
		long ubLong = longObj.longValue();
		
		// �ֿ� �޼ҵ�
		// parse + {��ȯ�ϰ��� �ϴ� Ÿ��}() : �⺻�� ��ȯ]
		/*
		String value000 = integerObj.toString();
		int value001 = Integer.parseInt(null);
		double value002 = Double.parseDouble(null);
		long value003 = Long.parseLong(null);
		// ���� Ÿ������ ��ȯ : valueOf()
		String value01 = String.valueOf(false);
		Integer value02 = Integer.valueOf(ubInt);
		Double value03 = Double.valueOf(ubDouble);
		Long value04 = Long.valueOf(ubLong);
		*/
		
		// ��Ÿ �޼ҵ�
		int sum = Integer.sum(10, 20);
		System.out.println("�հ� : " + sum);
		int min = Integer.min(10, 20);
		System.out.println("�ּҰ� : " + min);
		int max = Integer.max(10, 20);
		System.out.println("�ִ밪 : " + max);
		
		// Integer : int Ÿ���� ǥ���� �� �ִ� �ּҰ� / �ִ밪
		System.out.println("Int�� �ִ밪 : " + Integer.MAX_VALUE);
		System.out.println("Int�� �ּҰ� : " + Integer.MIN_VALUE);
		// Double : Double Ÿ���� ǥ���� �� �ִ� �ּҰ� / �ִ밪
		System.out.println("Double�� �ִ밪 : " + Double.MAX_VALUE);
		System.out.println("Double�� �ּҰ� : " + Double.MIN_VALUE);
		
		System.out.println(Integer.parseUnsignedInt("150"));
		
		// Math
		// ���밪
		Math.abs(max);
		// 0 ~ 1 ������ ���� ����
		int random = (int)(Math.random()*44)+1;
		System.out.println("���� : " + random);
		
		int[] lotto = new int[6];
		
		
		for (int i = 0; i < lotto.length ; i++) {
			lotto[i] = (int)(Math.random()*44)+1;
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		
	}

}
