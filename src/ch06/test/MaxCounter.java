package ch06.test;

import java.util.Scanner;

public class MaxCounter {

	private int count;
	private int max;

	public MaxCounter() {
		this.count = 0;
	}

	public MaxCounter( int mMax) {

		this.max = mMax;

	}

	// 숫자 하나를 증가합니다.
	public void increment() {
		
		System.out.println("반복할 횟수를 입력하세요 : ");
		Scanner sc = new java.util.Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			if (this.count < 10) {
				this.count++;
			} else if (count >= this.max) {
				System.out.println("입력값 "+ x +"(은)는 최대값(10)을 초과할 수 없습니다.");
				this.count = this.max;
				break;
			}
		}
	}

	public int getCount() {

		return this.count;
	}

}
