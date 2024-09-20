package ch06;

public class Exam03 {
	
	static boolean flag = true;
	

	// main() method(function) : ���� �޼ҵ�(�Լ�)
	// �ش� Ŭ������ ����� ��, ó�� �����ϴ� �޼ҵ�(�Լ�)
	// ����б� ���� : f(x) = x^2 + 2x +1 = (x+1)^2
	// method�� �̿��ϴ� ����
	//  1. �ߺ� �ҽ��� �ּ�ȭ�� ���� ���
	//  2. �ҽ��ڵ� �ۼ��� ����ȭ
	public static void main(String[] args) {
		
		if (flag) {
			
		}
		
		/*
		 * ���¸� ���� �⺻���� ����
		 *  - �빮�ڷ� �����ϴ� ���ڿ� : Ŭ����
		 *  - �ҹ��ڷ� �����ϰ� ���ڵڿ� () ���� : �޼ҵ�
		 *  - �ҹ��ڷ� �����ϰ� ���ڵڿ� �ƹ��͵� ���� : ����(�ʵ�)
		 *  * ����
		 *    1. ��� : ���� �빮�ڷ� �ۼ� / �ܾ�� �ܾ� ���̸� _(�����)�� �̾���
		 *    2. ��Ű�� : ���� �ҹ��ڷ� �ۼ� / �ܾ�� �ܾ� ���̸� �̾ ��
		 */
		String camelcase = "";
		
		// �޼ҵ� ȣ�� (��ȯ���� ���� �޼ҵ�)
		int a = 10;
		/*
		int a = 10;
		int b = 20;
		// a�� b�� �հ�
		System.out.println( a + b );
		*/
		
		// �޼ҵ� ȣ�� (��ȯ���� ���� �޼ҵ�)
		add(a, 20);
		/*
		int c = 30;
		int d = 40;
		// c�� d�� �հ�
		System.out.println( c + d );
		*/
		// �޼ҵ� ȣ�� (��ȯ���� ���� �޼ҵ�)
		add(30, a);
		// �޼ҵ� ȣ�� (��ȯ���� ���� �޼ҵ�)
		minus(100, 1);
		// �޼ҵ� ȣ�� (��ȯ���� �����ϴ� �޼ҵ�)
		int result = multi(3, 9);
		System.out.println( result );
	}
	
	//������ ���� Method
	// �� ���ο��� ������ int a�� method�� �Ķ���ͷ� ����� int a�� �ٸ� ���� (������ / ����)
	public static void add(int a, int b) {
		// method�� ���������� Ȯ���ϱ� ���� ��� ���ڿ�
		System.out.println("���ϱ� ����� �ϴ� Method�� �����Ͽ����ϴ�.");
		//�Ķ���� a�� b�� ���� ����� sum ������ ����
		int sum = a + b;
		//�޼ҵ��� ������ ������ ����� ��ȯ(return)
		System.out.println( sum );
		
	}
	
	// Ŭ������ 0�� �̻��� �ʵ�(����)�� 0�� �̻��� �޼ҵ�� �̷���� �ִ�.
	// ���� ������ : public / protected / private
	// static : ��ü�� �������� �ʰ� ȣ���� ������ ���� �޼ҵ�
	// ��ȯ�� : ������ Ÿ��(�ڷ���) - �⺻�� 8���� / ������
	// ������ Ÿ���� ������ ���, �ش� Ÿ������ �����Ͱ� �ݵ�� ��ȯ�ȴ�.
	// void : ��ȯ�Ǵ� �����Ͱ� ���ٴ� �ǹ�
	public static void minus(int x, int y) {
		System.out.println("miuns �޼ҵ��� ���� Ȯ���� ���� ���ڿ�");
		System.out.println( x - y );
	}
	
	public static int multi(int i, int j) {
		int result = i*j;
				return result;
	}
	
	public void exampleMethod(String prm) {
		// ��ȯ���� �����ϵ� ���ϵ� return ��ɹ��� ����� ����
		// return ���� ������ �ش� �޼ҵ�� ����˴ϴ�.
		// cf. �ݺ������� break;
		return;
		
	}
	
	/*
	 * �������
	 * 
	 * ȣ�� : multi(3, 9)
	 * 			- ����, �μ�, �ƱԸ�Ʈ(Argument)
	 * �޼ҵ� ���� : 
	 * {���� ������} {��ȯ��} {�޼ҵ� �̸�} ({�Ű�����, �Ķ����}) {
	 * 		// ...
	 * }
	 * 
	 * * ���� ������(Modifier) : �ܺο��� ���ο��� �����ϴ� ������ ��Ÿ���� Ű����
	 * * ��ȯ��(Ÿ��/Return Type)
	 * * �Ķ����(Parameter)
	 * 
	 */
	
	// �޼ҵ� �����ε�(method Overloading)
	// Overloading : ���� / �̸��� ���� �Ű������� �ٸ� �ż��带 ������ ����
	// ������� : 1. �̸��� ������. 	2. �Ű������� �ٸ��� (�Ű������� Ÿ��, ������ �ٸ��� ��)
	// *�޼ҵ� �ñ״�ó(method signature) = �̸� + �Ű����� Ÿ��(����, ����)
	// - �ڹٿ��� �ż��带 ������ �� �ִ� ������ �ĺ���
	
	// ������ �ٸ� �ż���
	// ���� 3���� ���ϴ� �Լ�
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	// �Ű������� Ÿ���� �ٸ� �ż���
	//���ڿ��� ���ϴ� �Լ�
	public String add(String x, String y) {
		return x+y;
	}
	// �Ű������� ������ �ٸ� �ż���1
	// ���� �ٸ� ������ ���ڸ� ���ϴ� �Լ�
	public int add(double i, int j) {
		return (int)i +j;
	}
	// �Ű������� ������ �ٸ� �ż���2
	// ���� �ٸ� ������ ���ڸ� ���ϴ� �Լ�
	public int add(int i, double j) {
		return i +(int)j;
	}
	

}
