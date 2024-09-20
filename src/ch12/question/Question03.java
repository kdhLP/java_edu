package ch12.question;

import static util.CommonUtil.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Question03 {

	/*
	 * Q. Thread - join()
	 * 
	 * * 1~1000 ������ �հ踦 ��� : 0.05�� * 10���� �����带 �̿��ؼ� �հ踦 ��� : 0.006��
	 * 
	 */
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		int totalSum = 0;
		//DivBigFileClass.getTotalSum(1, 100, 10);
		
		HashMap<SumRun, Thread> list = new HashMap<>();
		for(int i = 0 ; i < 10 ;i++) {
		SumRun sr = new SumRun((i*100)+1, 100*(i+1));
		list.put(sr, new Thread(sr));
		list.get(sr).start();
		
		}
		
		for( SumRun sr :list.keySet()) {
			list.get(sr).join();
			totalSum += sr.getSum();
		}
		
		log("��ü �հ� : " + totalSum);
		
		
		
	}

}

class SumRun implements Runnable {
	private int sum = 0;
	private int start;
	private int end;
	
	public SumRun(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			sum += i;
			log(i);
		}
	}
	public int getSum() {
		return sum;
	}
	
}

