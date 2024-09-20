package ch12;

import static util.CommonUtil.*;

// 동기화(Synchronization)
/*
 *  멀티스레드(다중스레드: 2개 이상의 스레드)를 사용할 때 가장 주의해야 할 부분 
 *  	: 같은 자원(리소스/공유자원)에 여러 스레드가 동시에 접근할 때 발생하는 동시성
 *  
 *  keyword : synchronized 
 *  	- 동기화 : 한 번에 하나의 스레드만 접근이 가능(Status: Runnable)하게끔 만들어줌
 *  	- 동기화 키워드가 선언된 객체에 특정 스레드가 접근하게되면 다른 객체에는 LOCK(Status: Blocked) 
 *  
 *  ** 자바 언어는 멀티스레드(다중스레드)를 고려하고 만들어진 언어
 *  동기화
 *  	장점 : 
 *  		1. 프로그래밍 언어 기본 문법 포함 
 *  		2. 편리한 사용
 *  		3. 자동 잠금 해제 : blocked(lock)를 자바가 자동으로 해제
 *  
 *  	단점 : 
 *  		1. 무한 대기 : Blocked 상태를 가진 다른 스레드가 Lock이 풀릴 때까지 무한대기(중단 X)
 *  		2. 공정성 : Lock 풀렸을 때, Blocked 상태의 다른 스레드 중 어떤 스레드를 접근시킬지 알 수 없음
 *  					/ 최악의 경우, 특정 스레드는 오랜 시간동안 Lock이 풀리지 않을 수도 있음
 *  			>> java.util.concurrent 동시성 문제 해결을 위한 패키지 존재  
 * 
 * */
public class Exam03 {

	// 나의 계좌에서 각 신용카드 회사에서 돈을 인출해가는 가상 출금 시스템
	public static void main(String[] args) throws InterruptedException {
		
		log(" main() 스레드 실행 ");
		
		// 나의 계좌(myAccount) 객체를 생성 : 잔액은 10000 
		BankAccount myAccount = new BankAccount(10000);
		
		// A 신용카드회사 : 8000
		// 스레드 객체 생성 : Withdraw Runnable 객체를 생성자에 포함
		Thread th01 = new Thread(new Withdraw(myAccount, 8000));
		// B 신용카드회사 : 5000
		// 스레드 객체 생성 : Withdraw Runnable 객체를 생성자에 포함
		Thread th02 = new Thread(new Withdraw(myAccount, 5000));
		
		// 스레드 실행 
		th01.start();
		th02.start();
		
		// main 스레드가 위 2개의 스레드가 종료될 때까지 기다림
		th01.join();
		th02.join();
		
		log(" main() 스레드 종료 " + myAccount.getBalance() );
	}
	
}

// Runnable 인터페이스를 상속받는 WithDraw 클래스 생성
// 출금 
class Withdraw implements Runnable {
	// 필드
	private BankAccount account;
	private int amount;
	// WithDraw 생성자
	// 객체가 생성될 때, 대상 계좌에서 출금액을 파라미터로 전송
	// 넘겨받은 파라미터를 필드로 저장 
	public Withdraw(BankAccount account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	// 스레드에서 실질적으로 실행되는 run() 
	@Override
	public void run() {
		// 대상 계좌(account)에서 지정된 출금액(amount)만큼 출금
		this.account.withdraw(amount);
	}
}

// 계좌를 나타나는 BankAccount 클래스
class BankAccount {
	// 잔액 필드 : balance (private 접근제어자)   
	private int balance;
	// 생성자 : 객체가 생성될 때, 잔액을 입력받아서 저장
	public BankAccount(int balance) {
		this.balance = balance;
	}
	// 필드값을 외부에서 사용할 수 있도록 getter method
	public synchronized int getBalance() {
		return this.balance;
	}
	// 계좌에서 출금할 수 있는 boolean withdraw() 메소드 생성
	// amount : 출금액
	public synchronized boolean withdraw(int amount) {
		log("+++출금 시작+++");
		// 출금액이 잔액보다 크면, false를 반환 
		if ( amount > this.balance ) {
			log("+++출금 실패+++" + this.balance);
			return false;
		}
		// 내용 확인을 위해서 추가적인 코드 
		sleepThread(100);
		// 출금액이 잔액보다 작거나 같으면 잔액에서 출금액을 빼는 코드 : true 반환
		this.balance -= amount;
		log("+++출금 완료+++" + this.balance);
		return true;
	}
	
}












