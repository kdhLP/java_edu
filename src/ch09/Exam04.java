package ch09;

// ����Ŭ���� : ���������� ���� ��ġ�� ����Ǵ� Ŭ����
public class Exam04 {
	int outerInstanceValue = 10;
	
	public void outerMethod(int parameter) {
		// �������� 
		int outerMethodLocalValue = 20;
		// ����Ŭ���� : ���������� ���� ��ġ�� ����Ǵ� Ŭ����
		// * ����Ŭ����(inner Class)�� Ư¡�� �״�� ����
		// * �ܺ�Ŭ����(Exam04)�� ��ü������ �̷������ ����Ŭ������ ������ ����
		// * �ź� Ŭ���� -> �ܺ�Ŭ������ ����, �޼ҵ� : ������ ���������ϴ�.
		/*
		 *  *** ĸ�� ***
		 *  1. ����Ŭ�������� �����ϴ� ���������� ���� �����Ͽ� ���� ������ ����
		 *  2. ����Ŭ������ �����ϴ� ���������� ���� �����ϸ� �ȵȴ�(final).
		 *  
		 *  * ����Ŭ������ ����� ������ ���� ����
		 */
		// ����
		class LocalClass{
			int localInstanceValue = 30;
			public void print() {
				// ����Ŭ������ �ɹ� ���� ����
				System.out.println( localInstanceValue);
				// ����Ŭ������ ���δ� �޼ҵ� �� ��������
				System.out.println(outerMethodLocalValue);
				// ����Ŭ������ ���δ� �޼ҵ��� �Ű�����(��������)
				System.out.println(parameter);
				// �ܺ�Ŭ������ �ɹ����� ����
				System.out.println(outerInstanceValue);
			}
		}
		// ����
		LocalClass local = new LocalClass();
		local.print();
		
	}
	
}
