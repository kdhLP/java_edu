package ch08.test;

import java.util.Scanner;
import ch08.test.payment.*;

// ch08.test.payment :: ������������ 2��
// ���� �� 5�� ���� ��������� �ø� ��ȹ
// Ȯ�强 �ְ�, �����ϰ� ����� �� �ֵ���, ���(����), ������ ���� �������� �ҽ��ڵ带 �����丵 �ϼ���
// TossPay Ŭ������ ����� �߰����ּ���.

public class Question02 {

	public static void main(String[] args) {

		/*
		 * // kakao ���� String type01 = "kakao"; int amount01 = 10000;
		 * pay.processpay(type01, amount01);
		 * 
		 * // naver ���� String type02 = "naver"; int amount02 = 100000;
		 * pay.processpay(type02, amount02);
		 * 
		 * // toss ���� String type03 = "toss"; int amount03 = 5000;
		 * pay.processpay(type03, amount03);
		 */
		
		PaymentService payService = new PaymentService();
		Scanner scanner = new Scanner(System.in);

		System.out.println("���� ������ �Է��ϼ��� (kakao, naver, toss):");
		String type = scanner.next();

		System.out.println("���� �ݾ��� �Է��ϼ���:");
		int amount = scanner.nextInt();

		// ���� ó��
		payService.processPay(type, amount);
	}
}