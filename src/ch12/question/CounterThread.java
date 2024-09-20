package ch12.question;

import static util.CommonUtil.*;

public class CounterThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 0 ; i < 5 ; i++) {
			log(i+1);
			sleepThread(1000);
		}
		
	}
	
}
