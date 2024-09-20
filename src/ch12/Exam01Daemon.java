package ch12;

public class Exam01Daemon implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " : Deamon run() start");
		
		// üũ���ܸ� ���� �� ���� (throws�� ����� �� ����)
		//	 - Override�� ��Ģ �� 1��
		//		: �θ� �޼ҵ尡 ���ܸ� ������ �ʴ� ���,
		//			�����ǵ� �ڽ� �޼ҵ嵵 ���ܸ� ������ ����
		try {
			// .sleep(long millis) : �и��� (1/1000��)
			// : ���� �����带  milli-seconds ��ŭ �ð�-�����·� �ٲ�
			/*
			 * Thread Status(���°�)
			 * 	 1. New				: ����
			 * 	 2. Runnable		: ���� ���� ����
			 * 	 3. Terminated		: ����
			 * 	 4. Block			: ���� ���� - Lock
			 * 	 5. Waiting			: ������ - ������ ��� ����
			 * 	 6. Timed Waiting	: �ð� ���� ��� ���� - ���ѵ� �ð���ŭ ���
			 * 
			 */
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+ " : Daemon run() end");
	}
}
