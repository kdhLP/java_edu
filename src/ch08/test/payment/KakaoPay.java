package ch08.test.payment;

public class KakaoPay implements Payment {
	@Override
	public boolean pay(int amount) {
		System.out.println("īī�� �ý��۰� �����մϴ�.");
		System.out.println(amount + "���� �����մϴ�.");
		return true;
	}
}
