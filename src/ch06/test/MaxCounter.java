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

	// ���� �ϳ��� �����մϴ�.
	public void increment() {
		
		System.out.println("�ݺ��� Ƚ���� �Է��ϼ��� : ");
		Scanner sc = new java.util.Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			if (this.count < 10) {
				this.count++;
			} else if (count >= this.max) {
				System.out.println("�Է°� "+ x +"(��)�� �ִ밪(10)�� �ʰ��� �� �����ϴ�.");
				this.count = this.max;
				break;
			}
		}
	}

	public int getCount() {

		return this.count;
	}

}
