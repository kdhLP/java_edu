package ch12;

// ��� 1.
public class Exam01Thread extends Thread {
	// Thread Ŭ������ ��ӹ��� ������ run() �޼ҵ带 ������(�ʼ����� �������̵��� �ƴ�)
	//		> ���������� ����� �ڵ� �ۼ�
	@Override
	public void run() {
		System.out.println("1. " + Thread.currentThread().getName() + " : run() ");
	}
	
}
