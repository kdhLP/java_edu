package ch07;

// ������ : �޼ҵ� ���������� + �߻�(ȭ) Ŭ����
// ��� : �޼ҵ� �������̵� (Exam01:59)
// ** �������̵� �� �޼��尡 �׻� �켱���� ����
public class Exam03 {
	
	public static void main(String[] args) {
		// �� ĳ����
		// ������(��ĳ����, �ٿ�ĳ����)���� �������̵��� �޼��尡 �����Ѵٸ� �� �޼��尡 �׻� �켱���� ����
		PClass pClass01 = new CClass();
		pClass01.pMethod();
		CClass cClass01 = new CClass();
		cClass01.pMethod();
		
	}

}

class PClass {
	void pMethod() {
		System.out.println("++ �θ�Ŭ������ �޼ҵ� ����.");
	}
}
class CClass extends PClass {
	@Override
	void pMethod() {
		System.out.println("-- �ڽ�Ŭ������ �������̵� �� �޼ҵ� ����.");
	}
	
}
