package ch12.question;

import static util.CommonUtil.*;

import java.util.ArrayList;

public class Question02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Runnable 이턴페이스를 구현하는 Thread를 2개 만드세요
		 * 	 - 이름 : OddRun
		 * 	 - 이름 : EvenRun
		 * 2. 스레드 2개 객체를 각각 만드세요
		 * 3. OddRun 실행 될 내용 : 1초 마다 10 사이에 홀수를 출력
		 * 		EvenRun 실행될 내용 : 1초만다 1부터 10 사이에 짝수를 출력
		 */
		
		OddRun or = new OddRun();
		EvenRun er = new EvenRun();
		
		Thread th1 = new Thread(or, "OddRun");
		Thread th2 = new Thread(er, "EvenRun");
		
		th1.start();
		th2.start();
		
		
		
	}
	
}
