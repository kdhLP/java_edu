package ch12.question;

import static util.CommonUtil.*;

public class ExQuestion {

	/*
	 * 1. 1~10 ������ �Ҽ��� �޼ҵ带 ����Ͽ� ���ϼ���. 2. �� �Ҽ��� ����� ����ϴ� ������(�� 4�� ������)�� �����ϼ���. 3.
	 * �Ҽ��� �����Ͽ� �Ҽ��� ���(50���� ���� ��)�� ����ϼ���. 
	 * [�����] 
	 * thread-0 : 2, 4, 6, 8, 10, ... , 50
	 * thread-1 : 3, 6, 9, 12, 15, ... , 48 
	 * thread-2 : 5, 10, 15, 20, ... , 50
	 * thread-3 : 7, 14, 21, 28, ... , 49
	 */

	public static void main(String[] args) {

		int[] num = { 2, 3, 5, 7 };

		for (int i = 0; i < num.length; i++) {
			int nums = num[i];
			Thread thread = new Thread(new PrimeMulti(nums));
			thread.start();
			sleepThread(100);
		}
	}
}

class PrimeMulti implements Runnable {
	private int prime;

	public PrimeMulti(int prime) {
		this.prime = prime;
	}

	@Override
	public void run() {
		System.out.print(Thread.currentThread().getName() + " : ");
		for (int i = prime; i <= 50; i += prime) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
