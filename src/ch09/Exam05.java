package ch09;

// �͸� Ŭ���� (anonymous Class)
// - ���� Ŭ������ Ư���� ����
// - ����Ŭ�����ε�, Ŭ������ �̸��� ���ٴ� Ư¡
// - ����� ������ ���ÿ� �̷�� ��
// - �θ�Ŭ������ ��ӹްų�, �������̽� ������ �������� ���
//	 �͸�Ŭ������ ����� ���� ����(�θ�)Ŭ������ �������̽�(�߻�Ŭ����)�� �ʿ�
// - ������ : �⺻ �����ڸ� ��밡�� ( �����ڸ� ���� �� ���� )
// - Ŭ������ ������ �������� �ʰ� �������̽��� Ŭ������ �Ｎ�ؼ� ����(���) �� �� �־ �ڵ尡 ������
// - �ý����� ������ ���������ų� ������ �ʿ��� ���, ��ø(����) Ŭ������ �ƴ϶� �Ϲ����� Ŭ���� ����
// - ��ȸ������ ������ ���, �͸� Ŭ������ ���� ���� ���
public class Exam05 {
	
	public void outerClassMethod( int methodParamValue) {
		
		// 
		class LocalClass extends Exam01 implements ch08.Exam02{
			public void localMethod() {
				
			}

			@Override
			public void method01() {	}

			@Override
			public void method02() {	}

			@Override
			public void method03() {	}
		}
		 // ���
		/*
		 * Exam01 Ŭ������ ��ӹ޴� �̸����� Ŭ����(�͸�Ŭ����)��
		 * �ּҰ��� ������ ������ �̸� : tmpClass01
		 */
		new Exam01() {
			public void print() {
				
			}
		}.print();
		
		// ����
		/*
		 * ch08.Exam02 �������̽��� �����ϴ� �̸����� Ŭ������ 
		 * 	�ּҰ��� ������ ������ �̸� tmpClass02
		 */
		
		ch08.Exam02 tmpClass02 = new ch08.Exam02() {
			@Override
			public void method01() {	}
			@Override
			public void method02() {	}
			@Override
			public void method03() {	}	
		};
		// ���
		tmpClass02.method01();
		
	}
	
}
