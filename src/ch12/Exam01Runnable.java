package ch12;

// ��� 2. Runnable �������̽��� ����
public class Exam01Runnable implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : run() ");
	}
	
}
