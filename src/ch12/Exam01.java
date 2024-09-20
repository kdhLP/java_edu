package ch12;

/*
 * Thread�� ����� ��
 * 	 1. Thread Ŭ������ ���(extend)
 * 	 2. Runnable �������̽��� ����(implement)
 * 
 * ** �ǹ����� Thread Ȱ�뿩��
 * 	 - �оߺ��� �����ڰ� Thread�� �����ϴ� ������ �ٸ�
 * 	 - ��, �� �����ڴ� ���� �����ϴ� Thread�� ���� ���� (Framework�� ����)
 * 	 - ����, ���� �о� �����ڴ� �ʼ������� Thread�� ���� ����
 * 	 - ��) ���� �ٿ�ε� 
 * 		a) ������ �ٿ�ε�, ����ڿ��� �󸶳� ����Ǿ����� �˷��ִ� ����
 * 			(����ŷ, �ε� ���α׷�����...)
 * 		b) ��뷮 ������ ���� ��, �������� �����带 �̿��ؼ� ���ͺ��� �����͸� ���
 * 
 */

import static util.CommonUtil.*;

public class Exam01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. main() : main Thread ����
		 * 	 - ���μ����� ����� �۵��ϱ� ���ؼ� 1�� �̻��� �����尡 ����( main() )
		 * 2. Thread�� ��ӹ��� Ŭ������ ��ü�� ����
		 * 3. ex.start() �޼ҵ带 ����
		 * 	 - Memory > Stack > �Ǵٸ� �۾������� �����ϱ� ���ؼ� ���� �Ҵ�
		 * 	 - ���ο� �����忡 �̸��� �ο����� ������, Thread-0, Thread-1... ó�� ���� �̸��� �ο�
		 * 4. run() �޼ҵ� ����
		 * 	 - �������� ��������� ������� ����
		 * 	 - ������� ���ÿ� ����Ǳ� ������ ������ ���� ��������� �󸶵��� �޶��� �� ����
		 * 	 - �ϳ� �̻��� �����尡 ��������� ������ : Multi-Thread(���� ������)
		 * 5. main() : main Thread ����
		 */
		
		// 'main'�̶�� �̸��� Thread�� ����
		//System.out.println(Thread.currentThread().getName()+ " : 1. main() start");
		log(" : 1. main() start ");
		
		// Thread�� ��ӹ��� Ŭ������ ��ü ����
		Exam01Thread ex = new Exam01Thread();
		
		// run() �޼ҵ尡 ����Ǵ� ��ġ�� Ȯ���ϱ� ���� ��¹�
		//System.out.println(Thread.currentThread().getName()+ " : 1. start() ���� ��");
		log(" : 1. start() ���� ��");
		// run() �޼ҵ� ������ > ȣ�� x / start() �޼ҵ带 ȣ�� : �ٸ� Thread�� ����
		ex.start();
		// run() �޼ҵ带 ȣ�� - Thread�� Name : main
		ex.run();
		
		// run() �޼ҵ尡 ����Ǵ� ��ġ�� Ȯ���ϱ� ���� ��¹�
		System.out.println(Thread.currentThread().getName()+ " : 1. start() ���� ��");
		
		// "main" �̶�� �̸��� Thread�� ����
		System.out.println(Thread.currentThread().getName()+ " : 1. main() end");
		
		// Runnable �������̽� ���� ����
		// - ��� 1�� �ſ� ���
		Exam01Runnable exR = new Exam01Runnable();
		// - Thread�� ������ �۾��� ����
		// - Thread�� ��ü�� ������ ��, ������ �۾��� �����ڷ� ����
		Thread th = new Thread(exR);
		// start() : Thread�� ����
		th.start();
		
		/* // Thread Ŭ������ ��ӹ޾� �����ϴ� �ͺ��ٴ� 
		 * 	 Runnable Ŭ������ ��ӹ޾� �����ϴ� ���� ��õ
		 * 
		 * Thread Ŭ���� ���
		 * 	 - ���� 	: �����ϰ� ������ ����
		 * 	 - ���� 	: ����� ���� :: �ڹٴ� ���� ��Ӹ� ����
		 * 				/ Thread�� ��ӹ޾ƾ� �ϴ� Ŭ������ �̹� �ٸ� Ŭ������ ��ӹ޾Ҵٸ�
		 * 					Thread Ŭ������ ��ӹ��� �� ���� 
		 * 		   	: ������ ���� :: Runnable �������̽��� ����ϴ� �Ϳ� ���� �ڵ� �������� ������
		 * 
		 * Runnable �������̽��� ���(����)
		 * 	 - ����	: �����ο� ��� :: �ڹٴ� ���� ������ ����
		 * 					/ �̹� ��ӹ��� Ŭ������ ���� ����
		 * 		   	: �ڵ��� �и� :: ������� ������ �۾��� �и��ؼ� �ڵ��� �������� ����
		 * 				/ ���� �����尡 ������ Runnable ��ü�� ��������
		 * 				/ �� �����尡 ��쿡 ���� �������� Runnable ��ü�� ��� ����
		 * 	 - ����	: �ڵ尡 �������� ���ɼ��� ������
		 * 
		 */
		
		/*
		 * �������� ������ �������� ����
		 * 	 1. ���� ������(Single Thread)
		 * 	 2. ���� ������(Multi Thread)
		 * 
		 * �۾��� �߿䵵�� �������� ����
		 * 		* ���α׷� - ���μ���
		 * 		* ������ ���� - ������
		 * 
		 * 	 1. ����� ������(non-daemon Thread)
		 * 		- ���α׷��� �ֿ��۾��� ����
		 * 		- �۾��� �Ϸ�� ������ ����
		 * 
		 * 	 2. ���� ������(daemon Thread)
		 * 		- ��׶��忡�� �������� �۾��� ����
		 * 		- ��� ����� �����尡 ����Ǹ� �ڵ����� ���� ����
		 * 		- .start() �����ϱ� ���� ���� > .start() ����� ���Ŀ��� ���� X
		 * 
		 * 
		 */		
		
		System.out.println(Thread.currentThread().getName() + " 2. main : Daemon ����");
		
		Exam01Daemon dm = new Exam01Daemon(); // Runnable �������̽� ����
		Thread thDm = new Thread(dm, "Daemon Thread");
		// .setDaemon(boolean false) : ���� �����带 �����ϴ� �޼ҵ�
		thDm.setDaemon(true); // ���� ������ ���
		thDm.start();
		
		System.out.println(Thread.currentThread().getName() + " 2. main : Daemon ����");
		
		
		
		
		
		
	}
}
