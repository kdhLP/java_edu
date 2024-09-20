package ch07;


// ��� - super
// super :: �θ�Ŭ����
// this :: �ڽ�Ŭ����(�ڽ�)
// super() ������ : �ڽ�Ŭ������ �����ڿ��� �θ� Ŭ������ �����ڸ� �ݵ�� ȣ��
//		-> �⺻ �����ڴ� ������ ����
public class Exam0101 extends ParentExam0101 {
	public Exam0101() {
		// �θ� Ŭ������ ������ -> �⺻ Ŭ������ �ƴ� -> �ݵ�� ȣ��
		super(10);
		System.out.println("��ũ��Ʈ Ŭ������ ������");
	}
	public void setPrintNumber() {
		System.out.println("super.number = " + super.number);
		System.out.println("number = " + number);
		number = 100;
		System.out.println("number ���� ��ȯ :: number = 100;" );
		System.out.println("super.number = " + super.number);
		System.out.println("number = " + number);
	}
	public static void main(String[] args) {
		// ��ũ��Ʈ Ŭ����(����� �޴� ������ Ŭ����)�� ��ü����
		Exam0101 superTest = new Exam0101();
		// number �ʵ��� ���� �������� Ȯ���ϱ� ���ؼ�
		superTest.setPrintNumber();
		
		Exam010102 superTestVS = new Exam010102();
		superTestVS.setPrintNumber();
		
		superTest.setPrintNumber();
	}
}
class Exam010102 extends ParentExam0101{
	public Exam010102() {
		super(50);
	}
	public void setPrintNumber() {
		System.out.println("super.number = " + super.number);
		System.out.println("number = " + number);
		number = 1000;
		System.out.println("number ���� ��ȯ :: number = 1000;" );
		System.out.println("super.number = " + super.number);
		System.out.println("number = " + number);
	}
}

class ParentExam0101 extends GrandParentExam0101 {
	public ParentExam0101(int a) {
		// �ֻ��� Ŭ������ �����ڰ� �⺻ �������� ���¸� ��� �ֱ� ������ ���� ����
		// super();
		System.out.println("�ι�° �θ� Ŭ������ ������");
		System.out.println("������ �Ķ���� a�� �� " + a);
	}
}
class GrandParentExam0101{
	int number = 20;
	public GrandParentExam0101() {
		System.out.println("�ֻ��� �θ� Ŭ������ ������");
	}
}


