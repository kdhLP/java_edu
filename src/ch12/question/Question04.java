package ch12.question;

import static util.CommonUtil.*;
import java.util.ArrayList;
import java.util.List;

public class Question04 {

	/*
	 * // ���� �����尡 ���ÿ� �����ϴ� ī���͸� ����ȭ �Ͽ� ��Ȯ�� ���� �����ϴ� ���α׷�
	 * 
	 * 1. Counter Ŭ������ �ۼ� - int count ���� ������Ű�� increment() �޼ҵ带 �ۼ� 2. 10�� �����尡 ���ÿ�
	 * increment() �޼ҵ带 �����Ͽ� ī��Ʈ ���� �߰� 3. ���� count ���� 100�� �ǵ��� �����ϴ� �ڵ带 �ۼ� 4. main
	 * �޼ҵ� �������� (��� �۾��� ���� ��) count ���� ���
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		Increment increment = new Increment(100);
		List<Thread> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			Counter ct = new Counter(increment); // �� �����尡 �����ϴ� Increment ��ü
			Thread th = new Thread(ct);
			list.add(th);
			th.start();
		}

		for (Thread th : list) {
			th.join();
		}

		log("Last count : " + increment.getCount());
	}

}

class Counter implements Runnable {

	private Increment increment;

	public Counter(Increment increment) {
		this.increment = increment;
	}

	@Override
	public void run() {
		while (increment.increment()) {
		}
	}

}

class Increment {
	private int count = 0;
	private int end;

	public Increment(int end) {
		this.end = end;
	}

	public synchronized boolean increment() {
		if (count < this.end) {
			count++;
			log(count);
			return true;
		}
		return false;
	}

	public synchronized int getCount() {
		return count;
	}

}
