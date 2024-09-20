package ch08.test;

import ch08.test.send.*;

/*
 * ��������  �̿�
 * Sender �������̽��� ���
 * EmailSender, SmsSender, SnsSender Ŭ������ ���� ����
 * ** ���û��� : ��Ű�� �����Ͽ� Ŭ���� ����
 */

public class Question01 {

	public static void main(String[] args) {
		
		Sender[] senders = { new EmailSender(), new SmsSender(), new SnsSender()};
		for ( Sender sender : senders ) {
			sender.sendMessage("Hello World~!");
		}
		
		/* ++++++++ result +++++++++
		 * ������ �߼��մϴ�. : Hello world~!
		 * SMS�� �߼��մϴ�. : Hello world~!
		 * SNS�� �߼��մϴ�. : Hello world~!
		 * 
		 */

	}

}
