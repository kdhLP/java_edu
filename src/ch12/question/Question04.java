package ch12.question;

import static util.CommonUtil.*;
import java.util.ArrayList;
import java.util.List;

public class Question04 {

	/*
	 * // 여러 스레드가 동시에 접근하는 카운터를 동기화 하여 정확한 값을 유지하는 프로그램
	 * 
	 * 1. Counter 클래스를 작성 - int count 값을 증가시키는 increment() 메소드를 작성 2. 10개 스레드가 동시에
	 * increment() 메소드를 실행하여 카운트 값을 중계 3. 최종 count 값이 100이 되도록 수행하는 코드를 작성 4. main
	 * 메소드 마지막에 (모든 작업이 끝난 뒤) count 값을 출력
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		Increment increment = new Increment(100);
		List<Thread> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			Counter ct = new Counter(increment); // 각 스레드가 공유하는 Increment 객체
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
