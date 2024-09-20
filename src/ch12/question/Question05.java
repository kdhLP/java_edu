package ch12.question;

import static util.CommonUtil.*;

public class Question05 {
	
	/*
	 * ������ �Ѵ븦 ���� ����� ����ϴ� ����
	 * 
	 * 1. Print Class �ۼ�
	 * 	 - print method(User user, int pages)
	 * 		: �����͸� ����ϴ� ���(user)�� �μ��ϴ� �޼ҵ�
	 * 		: ����ϴ� ������ ��(pages) ��ŭ System.out.println("�μ������� : i"); ���
	 * 		: ����ϴ� ������ 1�� �� 0.5�ʰ� �ɸ� �� �ֵ��� ó��
	 * 
	 * 2. User Class �ۼ�
	 * 	 : �����͸� ����ϴ� ����� ������ ������ ����.
	 * 	 : �ʵ� ����
	 * 		String userName;
	 * 	 - ������ ����� �̸� �� ��� ������ ��
	 * 		1) Alpha	/ 8
	 * 		2) Delta	/ 5
	 * 		3) Bravo	/ 20
	 * 
	 */
	
	public static void main(String[] args) {
		Print pp = new Print();

		User user1 = new User("Alpha", pp, 8);
		User user2 = new User("Delta", pp, 5);
		User user3 = new User("Bravo", pp, 20);

		Thread th1 = new Thread(user1);
		Thread th2 = new Thread(user2);
		Thread th3 = new Thread(user3);

		th1.start();
		th2.start();
		th3.start();
	}
}

class User implements Runnable {
	private String userName;
	private Print printer;
	private int pages;

	public User(String userName, Print printer, int pages) {
		this.userName = userName;
		this.printer = printer;
		this.pages = pages;
	}

	@Override
	public void run() {
		printer.print(userName, pages);
	}
}

class Print {

	public synchronized void print(String userName, int pages) {
		log(userName + "��(��) ����Ʈ�� �����մϴ�.");

		for (int i = 1; i <= pages; i++) {
			log("�μ������� : " + i + "	| " + userName);
			sleepThread(500);
		}

		log(userName + "�� ����Ʈ�� �Ϸ�Ǿ����ϴ�.");
	}
}