package ch12.question;

import static util.CommonUtil.*;

public class Question01 {
	
	public static void main(String[] args) {
		
		// Q1.
		/*
		 * 1. Thread Ŭ������ ��ӹ��� CounterThread��� ������ Ŭ���� ����
		 * 2. �� ������� 1���� 5���� ���ڸ� 1�� �������� ���
		 * 	 log() �޼ҵ带 ���ؼ� ���
		 * 3. main() �޼ҵ忡�� CounterThread ��ü�� �����ϰ� ����
		 */
		
		CounterThread ct = new CounterThread();
		
		//ct.start();
		
		// Q2.
		/*
		 * 1. Runnable Ŭ������ ��ӹ��� CounterRunnable ��� ������ Ŭ���� ����
		 * 	 1-1. Thread �̸��� "CounterRun"���� ����
		 * 2. �� ������� 1���� 5���� ���ڸ� 1�� �������� ���
		 * 	 CommonUtil.log() �޼ҵ带 ����ؼ� ���
		 * 3. main() �޼ҵ忡�� CounterRunnable ��ü�� �����ϰ� ����
		 * 
		 */
		
		CounterRunnable cr = new CounterRunnable();
		
		Thread th = new Thread(cr, "CounterRunnable");
		
		th.start();
		
		
		
	}
	
}
