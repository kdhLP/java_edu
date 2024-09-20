package ch06;

// �⺻�� vs ������
public class Exam02 {
	
	// Ŭ���� ����(�������) - ��������(Ŭ����) & �������� (Ŭ���� �� � �޼ҵ忡�� ��밡����)
	int x = 100;
	
	// �⺻��
	// int, (long), double, char, boolean
	// char : encoding ( utf-8 / euc-kr / cp(ms)949 ... )
	// ����(����)�� ���ؼ� ����� �ϰ� ��.
	// ����� ���� -> �𽺺�ȣ ( --- ... --- )
	// ����(����) -> 0(������ �帣�� �ʴ´�) / 1 (������ �帥��.)
	// �� -> 0 Ȥ�� 1 : bit
	//		-> 1bit : �ΰ��� ���� ���� �� �ִ�.
	//		-> ������, Ư����ȣ, ����, ������ �����ϱ� ���� �ڵ�, ����, ���
	//				: ũ�Ⱑ 8bit -> 2^8����(256)�� ��Ÿ�� �� �ִ�.
	//		-> 8bit -> 1Byte : latin1, ISO-****
	// char
	// A -> 65 -> 01000001
	// �ѱ� -> 65565���� : 2^16���� : 2Byte (��) : euc - kr / cp949 / ms949
	// �߱��� -> 3Byte
	// �����ڵ�(����ǥ��) : UTF-8 ( 3Byte )
	// �̸��� utf8mb4 ( 4Byte )
	
	// int - 4Byte
	// long - 8Byte
	// long num01 = 20��L;
	
	// ������ (****)
	// �⺻���� ������ : String, Array, ...
	// ����� Ŀ���� ������ : Practice02.car, Practice01.Student, ...
	//		--> �����ڰ� ����� Ŭ����
	// Bean(s) : �������� �����͸� ������ �ִ� Ŭ����(��)
	
	public static void main(String[] args) {
		
		// ���� 1. �⺻���� ���� ������ ���� �� ������, �������� ���� Ŭ������ ���� �� ����.
		// �⺻���� ������ ������ Ŭ���� �ȿ� ������� ��.
		// �޼ҵ� �ȿ� ���� �� ��������
		int a = 10;
		int b = 100;
		// ���������� ����
		System.out.println( a + b );
		// Wrapper Class
		Integer num00 = 1000;
		String str = "";
		
		// Student
		Student s1 = new Student();
		s1.age = 17;
		Student s2 = new Student();
		s2.age = 22;
		// int s2Age = s2.getAge();
		// System.out.println( s1 + s2 );
		System.out.println( s1.age + s2.age);
		
	}

}
