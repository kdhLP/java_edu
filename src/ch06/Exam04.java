package ch06;

// ������
public class Exam04 {

	public static void main(String[] args) {
		
		
		/* ��ü�� �����ϴ� ������
		 * 	�Ӽ�(�ʵ�)���� ���Խ�Ų�ٰų�
		 * 	��� ���(�޼ҵ�)�� �����Ų�ٰų�
		 * 	�� �� ��� �۾��� �ʿ��� ���
		 * 	�����ڸ� ����մϴ�.
		 * 
		 * ������(Constructor)
		 * 	- �޼ҵ� : ()
		 * 	- Ŭ������ �̸��� ���� �޼ҵ�
		 * 	- �Ű������� ��� ����
		 * 
		 * ����
		 * 	{����������} {Ŭ���� �̸�} (){
		 *		// ...
		 * 	}
		 */
		Car sonata = new Car();
		sonata.name = "�ҳ�Ÿ";
		sonata.color = "���";
		sonata.category = "����";
		
		// ��ü�� ������ ���ÿ� �ʵ忡 ������ ���� �Ѳ����� ó��(Ŭ������ �ʵ� �ʱ�ȭ)
		Car mohabi = new Car("���Ϻ�", "��", "SUV");
		
		// �л� 1 ��ü�� ����
		// �����ڸ� ���ؼ� �Ʒ��� ������ ������ ���ÿ� �ʵ忡 ���� ����
		/*
		 * �̸� : �����
		 * ���� : 33
		 * Ű : 183
		 * ���� : ���
		 * ���� :���ѹα�
		 * �ּ� : ������ ��õ�� ����
		 * ���� : �� 
		 */
		
		// String[] nickName = {"���"};
		String[] nickName = new String[5];
		nickName[0] = "���";
		Student student1 = new Student("�����", 33, 183.0, nickName, "���ѹα�", "������ ��õ�� ����", "��" );
		
		// �޼ҵ� ȣ��(����)
		student1.averageSubject();
		
		// �޼ҵ� �� ���Ǵ� ���������� �ʱ�ȭ�� �ݵ�� �̷������ �մϴ�.
		int var = 0;
		System.out.println(var);
		String strVal;
		// Exception : The local variable ... may not have been initialized
		// �ݵ�� �ʱ�ȭ(���� ����)�� �ʿ���
		//System.out.println(strVal);
		
		// this Ű���� : Car.java(Class)�� ����
		// this()
		//	- ������ ���ο��� �ڽ��� 
		
		
	}

}
