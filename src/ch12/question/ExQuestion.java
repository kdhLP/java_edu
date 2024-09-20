package ch12.question;

import static util.CommonUtil.*;

public class ExQuestion {

	/*
	 * 1. 1~10 사이의 소수를 메소드를 사용하여 구하세요. 2. 각 소수의 배수를 출력하는 스레드(총 4개 스레드)를 구현하세요. 3.
	 * 소수로 시작하여 소수의 배수(50보다 작은 수)를 출력하세요. 
	 * [결과값] 
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
