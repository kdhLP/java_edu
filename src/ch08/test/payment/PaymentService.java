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
			System.out.println("존재하지 않는 결제 수단입니다.");
			return;
		}

		boolean result = payments.pay(amount);
		if (result) {
			System.out.println("결제를 완료했습니다.");
		} else {
			System.out.println("결제를 실패했습니다.");
		}
	}
}