package ch06.test;


public class test07 {
	
	/*
	 * 1. MaxCounter Ŭ������ ���弼��
	 * 		- �� Ŭ������ �ִ밪�� �����ϰ� �ִ밪 ������ ���� �����ϴ� ����� ����
	 * 2. �ʵ�(�ɹ�����)
	 * 		int count : Ŭ���� ���ο��� ����ϴ� ������ ���� / �ʱⰪ�� 0
	 * 		int max : �ִ밪�Դϴ�. �����ڸ� ���ؼ� �Է� / �ִ밪�� 10
	 * 3. �޼ҵ�(�Լ�)
	 * 	 increment() : ���� �ϳ��� �����մϴ�.
	 * 			// if ���ǹ��� ����Ͽ� �ִ밪���� �������� "�ִ밪�� �ʰ��� �� �����ϴ�." ��� �ȳ������� ����ϼ���.
	 * 	 getCount() : ���ݱ��� ������ ���� ��ȯ�մϴ�.
	 */
	
	public static void main(String[] args) {
		
		MaxCounter counter = new MaxCounter(10);
		
		counter.increment();
		
		int count = counter.getCount();
		System.out.println("�Էµ� �������� " + count + " �Դϴ�.");
		
	}
}
