package ch12.question;

import static util.CommonUtil.*;

import java.util.ArrayList;

public class Question02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Runnable �������̽��� �����ϴ� Thread�� 2�� ���弼��
		 * 	 - �̸� : OddRun
		 * 	 - �̸� : EvenRun
		 * 2. ������ 2�� ��ü�� ���� ���弼��
		 * 3. OddRun ���� �� ���� : 1�� ���� 10 ���̿� Ȧ���� ���
		 * 		EvenRun ����� ���� : 1�ʸ��� 1���� 10 ���̿� ¦���� ���
		 */
		
		OddRun or = new OddRun();
		EvenRun er = new EvenRun();
		
		Thread th1 = new Thread(or, "OddRun");
		Thread th2 = new Thread(er, "EvenRun");
		
		th1.start();
		th2.start();
		
		
		
	}
	
}
