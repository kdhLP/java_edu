package ch12;

import static util.CommonUtil.*;

/*
 * .join() : �����·� ����� ��
 * 	 - Ư�� �����尡 ����� ������ ȣ�� �����尡 ��ٷ��� �ϴ� ���(������/Waiting)
 * 	 - Ư�� �����尡 Ư���� ������� ������ ������ ��ٷ��� �ϴ� ��쿡 ���� Ȱ��
 * 		ex) ��뷮 ������ �ٿ�ε� > ����
 * 
 * 	 // ���1. sleep()�� ���ؼ� Ư�� �����尡 ����� ������ �ð����Ѵ�����(Time Waiting)
 * 	 // ���2. .getState() ���ؼ� ������¸� �˾ƺ��� ���
 * 	 // ���3. .join() �޼ҵ� ���
 * 
 */
public class Exam02 {
	
	static class Run implements Runnable{
		@Override
		public void run() {
			log(" - Thread:run() start; ");
			// ���� �����带 1�ʰ� �����·� ����
			//sleepThread(1000);
			//thread �����尡 �۾��Ǵ� 5�ʵ��� �����θ� �����·� ����
			//thread.join(5000);
		};
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		log(" - main() start; ");
		
		Run r01 = new Run();
		Thread th01 = new Thread(r01, "th-01");
		Run r02 = new Run();
		Thread th02 = new Thread(r02, "th-02");
		
		th01.start();
		th02.start();
		
		// ��� 3.
		// main Thread(ȣ�⽺����)��
		// th01, th02(��󽺷���)�� ����� ������ ������
		// * ������ ������ : WAITING
		//	 - �ٸ� �������� Ư�� �۾��� �Ϸ�Ǳ⸦ ������ ��ٸ��� ����
		//	 - join()�� ȣ���ϴ� ������� ��� �����尡 TERMINATEED(�������)�� �� ������ ���
		//		> ������°� �Ǹ� ȣ�⽺����(main Thread)�� Waiting > Runnable �ڵ����� ���� ����
		/*
		 * 	 - .join()						: ������ ��� ����
		 * 		.join(long milli-seconds)	
		 * 			: Ư���ð� ��ŭ ������(Timed Waiting)
		 * 			/ �ð��� ������ ���� ��� �����尡 ����Ǹ�, ���̻� ��ٸ��� �ʰ� ������� ����
		 * 			ex) {��󽺷���}.join(1000)
		 * 			: �߰��� �ߴ��� ����(Interrupted)
		 * 
		 * 			cf) .sleep(long milli-seconds) : ����� �ٸ�
		 * 				: ���� �����带 �����ð� ��ŭ ���
		 * 				: �߰��� �ߴ��� �Ұ���(Interrupted)
		 * 
		 */
		// th01�� 1�ʰ� main(�ڽ�)�� ��ٸ�
		//th01.join(1000);
		
		// ������� �ʾҴٸ� while �� ���� ������ ����(������)
		//	 * ���� : ��ӵǴ� �ݺ����� CPU ������ ���������� ��� / ���ŷο�
		while(th01.getState() != Thread.State.TERMINATED) {
			// �����尡 ����� �� ���� ��� �ݺ��ؼ� ... ����
			sleepThread(10);
		}
		
		// main(�ڽ�)�� 1�ʰ� ��ٸ�
		sleepThread(1000);
		
		th02.join();
		
		
		log(" - main() end; ");
		
	}
	
	
}
