package ch08.test.payment;

public class NaverPay implements Payment {
	@Override
	public boolean pay(int amount) {
		System.out.println("���̹� �ý��۰� �����մϴ�.");
		System.out.println(amount + "���� �����մϴ�.");
		return true;
	}
}
