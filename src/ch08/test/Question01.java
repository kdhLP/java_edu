package ch08.test;

import ch08.test.send.*;

/*
 * 다형성을  이용
 * Sender 인터페이스를 사용
 * EmailSender, SmsSender, SnsSender 클래스를 각각 구현
 * ** 선택사항 : 패키지 구분하여 클래스 생성
 */

public class Question01 {

	public static void main(String[] args) {
		
		Sender[] senders = { new EmailSender(), new SmsSender(), new SnsSender()};
		for ( Sender sender : senders ) {
			sender.sendMessage("Hello World~!");
		}
		
		/* ++++++++ result +++++++++
		 * 메일을 발송합니다. : Hello world~!
		 * SMS를 발송합니다. : Hello world~!
		 * SNS에 발송합니다. : Hello world~!
		 * 
		 */

	}

}
