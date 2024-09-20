package ch12.question;

import static util.CommonUtil.*;

public class Question01 {
	
	public static void main(String[] args) {
		
		// Q1.
		/*
		 * 1. Thread 클래스를 상속받은 CounterThread라는 스레드 클래스 생성
		 * 2. 이 스레드는 1부터 5까지 숫자를 1초 간격으로 출력
		 * 	 log() 메소드를 통해서 출력
		 * 3. main() 메소드에서 CounterThread 객체를 생성하고 실행
		 */
		
		CounterThread ct = new CounterThread();
		
		//ct.start();
		
		// Q2.
		/*
		 * 1. Runnable 클래스를 상속받은 CounterRunnable 라는 스레드 클래스 생성
		 * 	 1-1. Thread 이름은 "CounterRun"으로 지정
		 * 2. 이 스레드는 1부터 5까지 숫자를 1초 간격으로 출력
		 * 	 CommonUtil.log() 메소드를 사용해서 출력
		 * 3. main() 메소드에서 CounterRunnable 객체를 생성하고 실행
		 * 
		 */
		
		CounterRunnable cr = new CounterRunnable();
		
		Thread th = new Thread(cr, "CounterRunnable");
		
		th.start();
		
		
		
	}
	
}
