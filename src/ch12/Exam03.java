package ch12;

import static util.CommonUtil.*;

// ����ȭ(Synchronization)
/*
 *  ��Ƽ������(���߽�����: 2�� �̻��� ������)�� ����� �� ���� �����ؾ� �� �κ� 
 *  	: ���� �ڿ�(���ҽ�/�����ڿ�)�� ���� �����尡 ���ÿ� ������ �� �߻��ϴ� ���ü�
 *  
 *  keyword : synchronized 
 *  	- ����ȭ : �� ���� �ϳ��� �����常 ������ ����(Status: Runnable)�ϰԲ� �������
 *  	- ����ȭ Ű���尡 ����� ��ü�� Ư�� �����尡 �����ϰԵǸ� �ٸ� ��ü���� LOCK(Status: Blocked) 
 *  
 *  ** �ڹ� ���� ��Ƽ������(���߽�����)�� ����ϰ� ������� ���
 *  ����ȭ
 *  	���� : 
 *  		1. ���α׷��� ��� �⺻ ���� ���� 
 *  		2. ���� ���
 *  		3. �ڵ� ��� ���� : blocked(lock)�� �ڹٰ� �ڵ����� ����
 *  
 *  	���� : 
 *  		1. ���� ��� : Blocked ���¸� ���� �ٸ� �����尡 Lock�� Ǯ�� ������ ���Ѵ��(�ߴ� X)
 *  		2. ������ : Lock Ǯ���� ��, Blocked ������ �ٸ� ������ �� � �����带 ���ٽ�ų�� �� �� ����
 *  					/ �־��� ���, Ư�� ������� ���� �ð����� Lock�� Ǯ���� ���� ���� ����
 *  			>> java.util.concurrent ���ü� ���� �ذ��� ���� ��Ű�� ����  
 * 
 * */
public class Exam03 {

	// ���� ���¿��� �� �ſ�ī�� ȸ�翡�� ���� �����ذ��� ���� ��� �ý���
	public static void main(String[] args) throws InterruptedException {
		
		log(" main() ������ ���� ");
		
		// ���� ����(myAccount) ��ü�� ���� : �ܾ��� 10000 
		BankAccount myAccount = new BankAccount(10000);
		
		// A �ſ�ī��ȸ�� : 8000
		// ������ ��ü ���� : Withdraw Runnable ��ü�� �����ڿ� ����
		Thread th01 = new Thread(new Withdraw(myAccount, 8000));
		// B �ſ�ī��ȸ�� : 5000
		// ������ ��ü ���� : Withdraw Runnable ��ü�� �����ڿ� ����
		Thread th02 = new Thread(new Withdraw(myAccount, 5000));
		
		// ������ ���� 
		th01.start();
		th02.start();
		
		// main �����尡 �� 2���� �����尡 ����� ������ ��ٸ�
		th01.join();
		th02.join();
		
		log(" main() ������ ���� " + myAccount.getBalance() );
	}
	
}

// Runnable �������̽��� ��ӹ޴� WithDraw Ŭ���� ����
// ��� 
class Withdraw implements Runnable {
	// �ʵ�
	private BankAccount account;
	private int amount;
	// WithDraw ������
	// ��ü�� ������ ��, ��� ���¿��� ��ݾ��� �Ķ���ͷ� ����
	// �Ѱܹ��� �Ķ���͸� �ʵ�� ���� 
	public Withdraw(BankAccount account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	// �����忡�� ���������� ����Ǵ� run() 
	@Override
	public void run() {
		// ��� ����(account)���� ������ ��ݾ�(amount)��ŭ ���
		this.account.withdraw(amount);
	}
}

// ���¸� ��Ÿ���� BankAccount Ŭ����
class BankAccount {
	// �ܾ� �ʵ� : balance (private ����������)   
	private int balance;
	// ������ : ��ü�� ������ ��, �ܾ��� �Է¹޾Ƽ� ����
	public BankAccount(int balance) {
		this.balance = balance;
	}
	// �ʵ尪�� �ܺο��� ����� �� �ֵ��� getter method
	public synchronized int getBalance() {
		return this.balance;
	}
	// ���¿��� ����� �� �ִ� boolean withdraw() �޼ҵ� ����
	// amount : ��ݾ�
	public synchronized boolean withdraw(int amount) {
		log("+++��� ����+++");
		// ��ݾ��� �ܾ׺��� ũ��, false�� ��ȯ 
		if ( amount > this.balance ) {
			log("+++��� ����+++" + this.balance);
			return false;
		}
		// ���� Ȯ���� ���ؼ� �߰����� �ڵ� 
		sleepThread(100);
		// ��ݾ��� �ܾ׺��� �۰ų� ������ �ܾ׿��� ��ݾ��� ���� �ڵ� : true ��ȯ
		this.balance -= amount;
		log("+++��� �Ϸ�+++" + this.balance);
		return true;
	}
	
}












