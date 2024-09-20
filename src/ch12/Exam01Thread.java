package ch12;

// 방법 1.
public class Exam01Thread extends Thread {
	// Thread 클래스를 상속받은 곳에서 run() 메소드를 재정의(필수적인 오버라이딩은 아님)
	//		> 실질적으로 실행될 코드 작성
	@Override
	public void run() {
		System.out.println("1. " + Thread.currentThread().getName() + " : run() ");
	}
	
}
