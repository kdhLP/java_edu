package ch08.test.payment;

public class PaymentService {

	public void processPay(String type, int amount) {
		Payment payments = null;

		if (type.equals("kakao")) {
			payments = new KakaoPay();
		} else if (type.equals("naver")) {
			payments = new NaverPay();
		} else if (type.equals("toss")) {
			payments = new TossPay();
		} else {
			System.out.println("�������� �ʴ� ���� �����Դϴ�.");
			return;
		}

		boolean result = payments.pay(amount);
		if (result) {
			System.out.println("������ �Ϸ��߽��ϴ�.");
		} else {
			System.out.println("������ �����߽��ϴ�.");
		}
	}
}