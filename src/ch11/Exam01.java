package ch11;

import java.util.Scanner;

import ch09.Exam05;

/*
 * �ڹٰ� �⺻���� �����ϴ� ���̺귯��(Ŭ���� ����) �߿� ���� �⺻�� �Ǵ� ���̺귯��
 * 	- java.lang ��Ű��
 *  - ��� �ڹ� ���ø����̼�(����/������Ʈ)�� �ڵ����� import
 *  	-> ���� import�� ���ؼ� ��Ű���� �������� �ʾƵ� ��
 * 
 * 1. Object
 * 2. String / Integer / Long / Double / ...
 * 	 - Wrapper Class : �⺻�� ������ Ÿ���� ��ü�� �����
 * 3. Class : Ŭ���� ��Ÿ ������ - ������̼� : @Override - ��ǻ�Ͱ� �˾Ƶ�� �ּ�
 * 		ex) getClass()
 * 4. System.out.println(���/OUT) / System.in(�Է�/IN) -> �����(IO)
 * 
 */
// Object Ŭ���� - �ڹٿ��� ����ϴ� ��� ��ü�� �ֻ���(root) (�θ�)Ŭ���� *****
//		-> interface : �߻� Ŭ���� / �������� Ŭ���� (Object�� ��ӹ��� �ʽ��ϴ�)
// extends Ű���带 ������� ���� : ������ ���
// ����� ��� : extends Object (����) : ���� ����� �������� ����
//	-> extends Exam05 : Object�� ��ӹ��� ����

// Object
/*
 * 1. �������� ��� ���� - ��ü�� ��, �� ��, � Ŭ������ �̸�, �Ӽ� Ȯ�� ���, ...
 * 2. �������� �⺻ ����
 * 	-> ��� Ŭ������ ����, ����, ����ϴ��� Object Ŭ������ �����س��� ���� �ȿ��� ���� ���� 
 * 
 * Object Ŭ������ �����ϴ� �⺻���� ��ɵ��� ��� -> �ʼ����� �Ϻ� ��ɵ鸸 �н� 
 * 	 / �������� ���� ���� ��õ
 * 
 * ** Object�� �Ѱ�
 * 1. ������ -> �ٿ�ĳ���� : ���������� ����ϴ� �������� �ٿ� ĳ������ ����(���輺) 
 * 		   -> �ǹ������� Object Ŭ������ ���� ������� ����
 * 
 */

class Parent {
	
	Object[] arr = new Object[] {
		(Object)"���ڿ�", (Object)new Integer(10).intValue(), (Object)100, new Exam01()
	};
	
}
class Child extends Parent {
	
}

public class Exam01 {
	public static void main(String[] args) {
		
		// �ٸ� ��Ű���� �ٸ� �̸��� Ŭ������ ��ü�� ����
		Exam05 ex = new Exam05();
		
		Object tempClass = new Object();
		System.out.println(tempClass.getClass().isArray());
		Scanner scan = new Scanner(System.in);
	}
	
}
