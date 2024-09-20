package ch06;

import java.util.Scanner;

// �ڹ� �޸� (Stack / Heap / Static)
public class Exam07 {
	
	// stack
	/*
	 * �ڹٴ� ���� ������ ����ؼ� �޼��� ȣ��� ��������(�Ű����� ����)�� ����
	 * method�� ��� ȣ���ϸ� ���� ������(frame)�� ��� ���δ�.
	 * ���� �������� ����Ǹ� ���������� �Բ� ����
	 * ���� �������� ��� ���� -> ���α׷� ����
	 */
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int param = scan.nextInt();
		
		// --- �޼ҵ带 ȣ���ϴ� �������� main�� ���
		// ** ����(����)�� ��� : ��ü������ ���� �ݴ�Ǵ� ������ �ƴ�.
		//					- ��ü ���� ���� ���� ���� ����� ������ �����ϴ� ���� ���信 �����
		//					- ���� ���� ���� �Լ�(function) ������ ����
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
