package ch12.question;

import util.CommonUtil;

public class CounterRunnable implements Runnable{
	
	@Override
	public void run() {
		
		for(int i = 1 ; i <= 5 ; i++) {
			CommonUtil.log(i);
			CommonUtil.sleepThread(1000);			
		}
		
	}
	
}
