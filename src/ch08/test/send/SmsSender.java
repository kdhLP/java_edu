package ch08.test.send;

import ch08.test.Sender;

public class SmsSender implements Sender {

	@Override
	public void sendMessage(String msg) {
		System.out.println("SMS�� �����մϴ� : " + msg);
		
	}

	
		

}
