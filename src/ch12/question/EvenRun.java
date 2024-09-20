package ch12.question;

import static util.CommonUtil.*;

public class EvenRun implements Runnable {
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				sleepThread(1000);
				log(i);
			} else {
				continue;
			}
		}

	}

}
