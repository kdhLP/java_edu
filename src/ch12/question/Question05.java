package ch12.question;

import static util.CommonUtil.*;

public class Question05 {
	
	/*
	 * 프린터 한대를 여러 사람이 사용하는 예제
	 * 
	 * 1. Print Class 작성
	 * 	 - print method(User user, int pages)
	 * 		: 프린터를 사용하는 사람(user)이 인쇄하는 메소드
	 * 		: 출력하는 페이지 수(pages) 만큼 System.out.println("인쇄페이지 : i"); 출력
	 * 		: 출력하는 페이지 1장 당 0.5초가 걸릴 수 있도록 처리
	 * 
	 * 2. User Class 작성
	 * 	 : 프린터를 사용하는 사용자 정보를 가지고 있음.
	 * 	 : 필드 생성
	 * 		String userName;
	 * 	 - 프린터 사용자 이름 및 출력 페이지 수
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
		log(userName + "이(가) 프린트를 시작합니다.");

		for (int i = 1; i <= pages; i++) {
			log("인쇄페이지 : " + i + "	| " + userName);
			sleepThread(500);
		}

		log(userName + "의 프린트가 완료되었습니다.");
	}
}