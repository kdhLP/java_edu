package ch07;

class ParentClass{
	public ParentClass() {
		System.out.println("�θ� Ŭ������ ������ ����");
	}
	void ParentMethod() {
		System.out.println("�θ� Ŭ������ �޼ҵ� ����");
	}
}
class ChildClass extends ParentClass{
	public ChildClass() {
		//super();
		System.out.println("�ڽ� Ŭ������ ������ ����");
	}
	void childMethod() {
		System.out.println("�ڽ� Ŭ������ �޼ҵ� ����");
	}
}

// ��ĳ���� : �ڽ�Ŭ���� -> �θ�Ŭ������ Ÿ���� ������ ��
// �ٿ�ĳ���� : �θ�Ŭ���� -> �ڽ�Ŭ������ Ÿ���� ������ ��
//			- ������ ��� || �Ұ����� ���
//			- �ٿ�ĳ������ �ǵ��� ������� �ʵ��� ���� : �ʼ������� �ٿ� ĳ������ ����ϴ� ���
// ...
public class Exam0201 {

	public static void main(String[] args) {
		
		// 1. �θ� Ÿ���� �ڽ� Ŭ������ ���� 
		// (��ĳ���� : �ڽ�Ŭ������ ��ü�� ����������, ������ �����ϴ� Ÿ�� : �θ�Ŭ����)
		ParentClass parent01 = new ChildClass();
		// �ٿ� ĳ����(����� ����ȯ)
		//instanceof -> Ÿ�� �񱳿� ���ÿ� �ٿ�ĳ������ �� ������ ���� 
		if(parent01 instanceof ChildClass child01) {
			System.out.println("ChildClass�� �ֽ��ϴ�");
			// �ٿ� ĳ����
			//ChildClass child01 = (ChildClass) parent01;
			child01.childMethod();
		} else {
			System.out.println("ChildClass�� �����ϴ�.");
		}
		
		System.out.println("+++++++++++++++++++");
		
		// 2. �θ�Ÿ���� �θ�Ŭ������ ����
		// �θ�Ŭ������ ������ �޸𸮿� �ö� �ִ� ����
		// (���) ��ü�� ������ ��, �θ�Ŭ������ ������ ������ ��� ����Ŭ������ ������ �޸��� �� �������
		// -> ��ü�� ������ ��, �ڽ�Ŭ������ �����ϴ��� �ڽ�Ŭ������ ������ �޸𸮿� ����� ����
		ParentClass parent02 = new ParentClass();
		// �ٿ�ĳ���� : ClassCastException �߻�
		// �޸𸮿� �ڽ�Ŭ������ ������ ���� ������ ������ �߻�
		if (parent02 instanceof ChildClass) {
			System.out.println("parent02 ��ü���� ChildClass�� ������ �ֽ��ϴ�.");
			ChildClass child02 = (ChildClass) parent02;
			child02.childMethod();
		}else {
				System.out.println("parent02 ��ü���� ChildClass�� ������ �����ϴ�.");
			}
		
		// �ڵ带 �ۼ��� ��, ������ �� -> ������(.java -> .class) ����
		// .class ������ ��������� ���� : ������ �ۼ�, ����, ���� �۾��� �����ϰ�, �����ϴ� ����
		// ������ �Ǹ鼭 ����(����)�� �߻��Ǵ� �� : ��Ÿ�� ����(����)
		
		// �ٿ�ĳ������ �߸��ϸ� �ɰ��� ��Ÿ�� ����(ĳ������ �� �� ����)
		// instanceof Ű���� : �ν��Ͻ��� Ÿ���� Ȯ��
		// {���� ������} instanceof {Ȯ���� ��ü Ÿ��} - this:35
		
	}

}
