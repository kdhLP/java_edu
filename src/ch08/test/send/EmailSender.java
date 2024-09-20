package ch08.test.send;

import ch08.test.Sender;

public class EmailSender implements Sender {

	@Override
	public void sendMessage(String msg) {
		System.out.println("이메일을 전송합니다 : " + msg);
		
	}
	
	
	
}
