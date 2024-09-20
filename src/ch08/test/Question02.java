package ch08.test;

import java.util.Scanner;
import ch08.test.payment.*;

// ch08.test.payment :: 결제수단으로 2개
// 추후 총 5개 까지 결재수단을 늘릴 계획
// 확장성 있고, 유연하게 사용할 수 있도록, 상속(구현), 다형성 등의 개념으로 소스코드를 리펙토링 하세요
// TossPay 클래스를 만들고 추가해주세요.

public class Question02 {

	public static void main(String[] args) {

		/*
		 * // kakao 결재 String type01 = "kakao"; int amount01 = 10000;
		 * pay.processpay(type01, amount01);
		 * 
		 * // naver 결재 String type02 = "naver"; int amount02 = 100000;
		 * pay.processpay(type02, amount02);
		 * 
		 * // toss 결재 String type03 = "toss"; int amount03 = 5000;
		 * pay.processpay(type03, amount03);
		 */
		
		PaymentService payService = new PaymentService();
		Scanner scanner = new Scanner(System.in);

		System.out.println("결제 수단을 입력하세요 (kakao, naver, toss):");
		String type = scanner.next();

		System.out.println("결제 금액을 입력하세요:");
		int amount = scanner.nextInt();

		// 결제 처리
		payService.processPay(type, amount);
	}
}