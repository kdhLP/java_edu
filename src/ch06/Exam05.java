package ch06;




// ��Ű�� : Ư���� ����(���, ���� ��)�� ���� Ŭ������ �з��س��� ����ü
/*
 * ��Ģ
 * 	- �ʼ����� ���� : ���丮�� ���� ��� (������ ������ ����)
 * 	- �ҹ��ڷ� �ۼ�(����/�ҹ��� : �⺻��)
 * 	- (����) kr.ac.btc �� ���� �������� �������� ��Ű���� ����
 * 		ex) kr.ac.btc > package �� �������� ���� (���� ��ü�� ���� �⺻ �ҽ�)
 * 			- board
 * 			- product
 * 			- ch01
 * 			- ch05 ...
 * 		   kr.co.btc2 �������� �������� �����ؼ� (����������ü : ������ �ҽ��� ���׷��̵��� �ҽ��� ���� ��Ű��)
 * 			- board
 * 			- product
 * 		   kr.co.naver.mobile
 * 			- board
 * 			- webtoon
 * 	* ���� ������� ��Ű���� �ٸ� ��Ű���� �ν�
 * 
 * 	** �ۼ����� Ŭ�������� �ٸ� Ŭ������ ����ϱ� ���ؼ� new Ű���带 ��ü�� ����
 * 		1. import
 * 		2. ����� �ҽ��ڵ�(Ŭ����) �տ� �ش� ���(��Ű��)�� �ٿ��ִ� ���
 * 		 * ���� ��Ű���� �����ִٸ� import, ��� ����
 * 
 * 	* Ư�� ��Ű���� ��� Ŭ������ ����(import)
 * 	import java.util.*
 * 		- ���� ��Ű���� ����
 * 		cf. import java.util.lang.*;
 */

import java.util.Scanner;
import java.util.Arrays;

import ch06.sub.Employees;
import java.lang.annotation.Annotation;

public class Exam05 {

	public static void main(String[] args) {
		
		// import Ű���带 ����Ͽ� Ŭ���� �ۿ� �ڵ� �ϼ�
		// Scanner Ŭ������ ��ü�� ����(new)
		// �ٸ� ��Ű���� ���� Ŭ������ ����ϱ� ���ؼ��� �ش� Ŭ������ ���(��Ű��)�� ����� ��
		Scanner scan = new java.util.Scanner(System.in);
		// �߻� Ŭ����
		Annotation annotation = new Annotation() {
			
			@Override
			public Class<? extends Annotation> annotationType() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		java.text.Annotation annotationClass = new java.text.Annotation(annotation);
		
		// ���� ��Ű�� �ȿ� �ִ� ��ü�� ����(new) - import ����
		// ���� ��Ű���� ���� ��Ű���� �ִ� Ŭ������ ȣ���ϴ��� ��θ� ������ ��� ��
		Employees employee = new Employees();
		// �ٸ� ��Ű���� ���� Ŭ������ ȣ��(���)�ؾ��ϴ� ���,
		// �� �߿� �ϳ��� ���� .(���Ῥ����)�� ���ؼ� �տ� �������� ��.
		ch06.Employees employeeUpper = new ch06.Employees();
		
	}

}
