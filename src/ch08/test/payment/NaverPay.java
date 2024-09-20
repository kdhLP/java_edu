package ch08.test.payment;

public class NaverPay implements Payment {
	@Override
	public boolean pay(int amount) {
		System.out.println("네이버 시스템과 연결합니다.");
		System.out.println(amount + "원을 결제합니다.");
		return true;
	}
}
