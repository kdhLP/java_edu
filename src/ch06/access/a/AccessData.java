package ch06.access.a;

import ch06.Book;

// �ʵ�, �޼ҵ��� ����������
// Ŭ���� ����������
/*
 * Ŭ���� ������ ���� ������ : public, default�� ����� �� ����
 * 		- protected, private�� ����� �� ����
 * public Ŭ������ �ݵ�� ���ϸ�� �̸��� ���ƾ���
 * �ϳ��� �ڹ� ���Ͽ��� public Ŭ������ �ϳ��� ����
 * �ϳ��� �ڹ� ���Ͽ� default ���� �����ڸ� ����ϴ� Ŭ������ ������ ���� �� ����
 * 		- 'Ŭ������ ũ��� �����ؾ��Ѵ�.' ��Ģ ����
 */
// default ���������� : Temp ��,�������� ���� ��Ű�� �ȿ����� ȣ���� ����
class Temp {
	
}


public class AccessData {
	
	//public : all granted
	public int publicField;
	//protected
	protected int protectedField;
	//defualt : same package
	int defaultField;
	// private : all denied
	private int praviteField;
	
	public void publicMethod() {
		System.out.println("publicMethod ȣ�� " + this.publicField);
	}
	
	protected void protectedMethod() {
		System.out.println("protectedMethod ȣ�� " + this.protectedField);
	}
	
	void defaultMethod() {
		System.out.println("defaultMethod ȣ�� " + this.defaultField);
	}
	
	private void privateMethod() {
		System.out.println("privateMethod ȣ�� " + this.praviteField);
	}
	
	// ���� ����(ȣ��/���)
	public void innerAcces() {
		System.out.println("*** ����ȣ�� ***");
		// �ɹ� ����(�ʵ�)�� ���� ���� ( �ʱ�ȭ/���� ����)
		this.publicField = 100;
		this.protectedField = 200;
		this.defaultField = 300;
		this.praviteField = 400;
		// �޼ҵ忡 ���� ����(ȣ��/���)
		this.publicMethod();
		this.protectedMethod();
		this.defaultMethod();
		this.privateMethod();
	}
	
}





