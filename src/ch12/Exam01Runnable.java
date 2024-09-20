package ch12;

// 방법 2. Runnable 인터페이스를 구현
public class Exam01Runnable implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : run() ");
	}
	
}
